package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class SpannedToHtmlConverter {
    private static final java.util.regex.Pattern NEWLINE_PATTERN = java.util.regex.Pattern.compile("(&#13;)?&#10;");

    private SpannedToHtmlConverter() {
    }

    public static com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss convert(java.lang.CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss("", com.google.common.collect.ImmutableMap.of());
        }
        if (!(charSequence instanceof android.text.Spanned)) {
            return new com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss(escapeHtml(charSequence), com.google.common.collect.ImmutableMap.of());
        }
        android.text.Spanned spanned = (android.text.Spanned) charSequence;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        for (android.text.style.BackgroundColorSpan backgroundColorSpan : (android.text.style.BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), android.text.style.BackgroundColorSpan.class)) {
            hashSet.add(java.lang.Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            hashMap.put(com.google.android.exoplayer2.ui.HtmlUtils.cssAllClassDescendantsSelector("bg_" + intValue), com.google.android.exoplayer2.util.Util.formatInvariant("background-color:%s;", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(intValue)));
        }
        android.util.SparseArray<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition> findSpanTransitions = findSpanTransitions(spanned, f);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(spanned.length());
        int i2 = 0;
        while (i < findSpanTransitions.size()) {
            int keyAt = findSpanTransitions.keyAt(i);
            sb.append(escapeHtml(spanned.subSequence(i2, keyAt)));
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition transition = findSpanTransitions.get(keyAt);
            java.util.Collections.sort(transition.spansRemoved, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.FOR_CLOSING_TAGS);
            java.util.Iterator it2 = transition.spansRemoved.iterator();
            while (it2.hasNext()) {
                sb.append(((com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) it2.next()).closingTag);
            }
            java.util.Collections.sort(transition.spansAdded, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.FOR_OPENING_TAGS);
            java.util.Iterator it3 = transition.spansAdded.iterator();
            while (it3.hasNext()) {
                sb.append(((com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) it3.next()).openingTag);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(escapeHtml(spanned.subSequence(i2, spanned.length())));
        return new com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss(sb.toString(), hashMap);
    }

    private static android.util.SparseArray<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition> findSpanTransitions(android.text.Spanned spanned, float f) {
        android.util.SparseArray<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition> sparseArray = new android.util.SparseArray<>();
        for (java.lang.Object obj : spanned.getSpans(0, spanned.length(), java.lang.Object.class)) {
            java.lang.String openingTag = getOpeningTag(obj, f);
            java.lang.String closingTag = getClosingTag(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (openingTag != null) {
                com.google.android.exoplayer2.util.Assertions.checkNotNull(closingTag);
                com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo spanInfo = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, openingTag, closingTag);
                getOrCreate(sparseArray, spanStart).spansAdded.add(spanInfo);
                getOrCreate(sparseArray, spanEnd).spansRemoved.add(spanInfo);
            }
        }
        return sparseArray;
    }

    private static java.lang.String getOpeningTag(java.lang.Object obj, float f) {
        float size;
        if (obj instanceof android.text.style.StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof android.text.style.ForegroundColorSpan) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("<span style='color:%s;'>", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(((android.text.style.ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof android.text.style.BackgroundColorSpan) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("<span class='bg_%s'>", java.lang.Integer.valueOf(((android.text.style.BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof android.text.style.AbsoluteSizeSpan) {
            android.text.style.AbsoluteSizeSpan absoluteSizeSpan = (android.text.style.AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return com.google.android.exoplayer2.util.Util.formatInvariant("<span style='font-size:%.2fpx;'>", java.lang.Float.valueOf(size));
        }
        if (obj instanceof android.text.style.RelativeSizeSpan) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("<span style='font-size:%.2f%%;'>", java.lang.Float.valueOf(((android.text.style.RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            java.lang.String family = ((android.text.style.TypefaceSpan) obj).getFamily();
            if (family != null) {
                return com.google.android.exoplayer2.util.Util.formatInvariant("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof android.text.style.StyleSpan) {
            int style = ((android.text.style.StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof com.google.android.exoplayer2.text.span.RubySpan) {
            int i = ((com.google.android.exoplayer2.text.span.RubySpan) obj).position;
            if (i == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof android.text.style.UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof com.google.android.exoplayer2.text.span.TextEmphasisSpan)) {
            return null;
        }
        com.google.android.exoplayer2.text.span.TextEmphasisSpan textEmphasisSpan = (com.google.android.exoplayer2.text.span.TextEmphasisSpan) obj;
        return com.google.android.exoplayer2.util.Util.formatInvariant("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", getTextEmphasisStyle(textEmphasisSpan.markShape, textEmphasisSpan.markFill), getTextEmphasisPosition(textEmphasisSpan.position));
    }

    private static java.lang.String getClosingTag(java.lang.Object obj) {
        if ((obj instanceof android.text.style.StrikethroughSpan) || (obj instanceof android.text.style.ForegroundColorSpan) || (obj instanceof android.text.style.BackgroundColorSpan) || (obj instanceof com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan) || (obj instanceof android.text.style.AbsoluteSizeSpan) || (obj instanceof android.text.style.RelativeSizeSpan) || (obj instanceof com.google.android.exoplayer2.text.span.TextEmphasisSpan)) {
            return "</span>";
        }
        if (obj instanceof android.text.style.TypefaceSpan) {
            if (((android.text.style.TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof android.text.style.StyleSpan) {
            int style = ((android.text.style.StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof com.google.android.exoplayer2.text.span.RubySpan) {
                return "<rt>" + escapeHtml(((com.google.android.exoplayer2.text.span.RubySpan) obj).rubyText) + "</rt></ruby>";
            }
            if (obj instanceof android.text.style.UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static java.lang.String getTextEmphasisStyle(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i == 3) {
            sb.append("sesame");
        } else {
            sb.append("unset");
        }
        return sb.toString();
    }

    private static java.lang.String getTextEmphasisPosition(int i) {
        if (i == 2) {
            return "under left";
        }
        return "over right";
    }

    private static com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition getOrCreate(android.util.SparseArray<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition> sparseArray, int i) {
        com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition transition = sparseArray.get(i);
        if (transition != null) {
            return transition;
        }
        com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition transition2 = new com.google.android.exoplayer2.ui.SpannedToHtmlConverter.Transition();
        sparseArray.put(i, transition2);
        return transition2;
    }

    private static java.lang.String escapeHtml(java.lang.CharSequence charSequence) {
        return NEWLINE_PATTERN.matcher(android.text.Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static class HtmlAndCss {
        public final java.util.Map<java.lang.String, java.lang.String> cssRuleSets;
        public final java.lang.String html;

        private HtmlAndCss(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
            this.html = str;
            this.cssRuleSets = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SpanInfo {
        public final java.lang.String closingTag;
        public final int end;
        public final java.lang.String openingTag;
        public final int start;
        private static final java.util.Comparator<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> FOR_OPENING_TAGS = new java.util.Comparator() { // from class: com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$0((com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) obj, (com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) obj2);
            }
        };
        private static final java.util.Comparator<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> FOR_CLOSING_TAGS = new java.util.Comparator() { // from class: com.google.android.exoplayer2.ui.SpannedToHtmlConverter$SpanInfo$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo.lambda$static$1((com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) obj, (com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo) obj2);
            }
        };

        static /* synthetic */ int lambda$static$0(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo spanInfo, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo spanInfo2) {
            int compare = java.lang.Integer.compare(spanInfo2.end, spanInfo.end);
            if (compare != 0) {
                return compare;
            }
            int compareTo = spanInfo.openingTag.compareTo(spanInfo2.openingTag);
            return compareTo != 0 ? compareTo : spanInfo.closingTag.compareTo(spanInfo2.closingTag);
        }

        static /* synthetic */ int lambda$static$1(com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo spanInfo, com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo spanInfo2) {
            int compare = java.lang.Integer.compare(spanInfo2.start, spanInfo.start);
            if (compare != 0) {
                return compare;
            }
            int compareTo = spanInfo2.openingTag.compareTo(spanInfo.openingTag);
            return compareTo != 0 ? compareTo : spanInfo2.closingTag.compareTo(spanInfo.closingTag);
        }

        private SpanInfo(int i, int i2, java.lang.String str, java.lang.String str2) {
            this.start = i;
            this.end = i2;
            this.openingTag = str;
            this.closingTag = str2;
        }
    }

    private static final class Transition {
        private final java.util.List<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> spansAdded = new java.util.ArrayList();
        private final java.util.List<com.google.android.exoplayer2.ui.SpannedToHtmlConverter.SpanInfo> spansRemoved = new java.util.ArrayList();
    }
}
