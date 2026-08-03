package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
final class WebViewSubtitleOutput extends android.widget.FrameLayout implements com.google.android.exoplayer2.ui.SubtitleView.Output {
    private static final float CSS_LINE_HEIGHT = 1.2f;
    private static final java.lang.String DEFAULT_BACKGROUND_CSS_CLASS = "default_bg";
    private float bottomPaddingFraction;
    private final com.google.android.exoplayer2.ui.CanvasSubtitleOutput canvasSubtitleOutput;
    private float defaultTextSize;
    private int defaultTextSizeType;
    private com.google.android.exoplayer2.ui.CaptionStyleCompat style;
    private java.util.List<com.google.android.exoplayer2.text.Cue> textCues;
    private final android.webkit.WebView webView;

    private static int anchorTypeToTranslatePercent(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    public WebViewSubtitleOutput(android.content.Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.textCues = java.util.Collections.emptyList();
        this.style = com.google.android.exoplayer2.ui.CaptionStyleCompat.DEFAULT;
        this.defaultTextSize = 0.0533f;
        this.defaultTextSizeType = 0;
        this.bottomPaddingFraction = 0.08f;
        com.google.android.exoplayer2.ui.CanvasSubtitleOutput canvasSubtitleOutput = new com.google.android.exoplayer2.ui.CanvasSubtitleOutput(context, attributeSet);
        this.canvasSubtitleOutput = canvasSubtitleOutput;
        android.webkit.WebView webView = new android.webkit.WebView(this, context, attributeSet) { // from class: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.1
            @Override // android.webkit.WebView, android.view.View
            public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            @Override // android.view.View
            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.webView = webView;
        webView.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(webView);
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.Output
    public void update(java.util.List<com.google.android.exoplayer2.text.Cue> list, com.google.android.exoplayer2.ui.CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.style = captionStyleCompat;
        this.defaultTextSize = f;
        this.defaultTextSizeType = i;
        this.bottomPaddingFraction = f2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.exoplayer2.text.Cue cue = list.get(i2);
            if (cue.bitmap != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.textCues.isEmpty() || !arrayList2.isEmpty()) {
            this.textCues = arrayList2;
            updateWebView();
        }
        this.canvasSubtitleOutput.update(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.textCues.isEmpty()) {
            return;
        }
        updateWebView();
    }

    public void destroy() {
        this.webView.destroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0152, code lost:
    
        if (r13 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0157, code lost:
    
        r20 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0159, code lost:
    
        r21 = "top";
        r22 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        if (r13 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateWebView() {
        java.lang.String formatInvariant;
        int i;
        boolean z;
        java.lang.String str;
        int i2;
        java.lang.String str2;
        int i3;
        java.util.Iterator it;
        com.google.android.exoplayer2.ui.WebViewSubtitleOutput webViewSubtitleOutput = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String cssRgba = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(webViewSubtitleOutput.style.foregroundColor);
        java.lang.String convertTextSizeToCss = webViewSubtitleOutput.convertTextSizeToCss(webViewSubtitleOutput.defaultTextSizeType, webViewSubtitleOutput.defaultTextSize);
        float f = CSS_LINE_HEIGHT;
        char c = 0;
        int i4 = 1;
        sb.append(com.google.android.exoplayer2.util.Util.formatInvariant("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", cssRgba, convertTextSizeToCss, java.lang.Float.valueOf(CSS_LINE_HEIGHT), convertCaptionStyleToCssTextShadow(webViewSubtitleOutput.style)));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.google.android.exoplayer2.ui.HtmlUtils.cssAllClassDescendantsSelector(DEFAULT_BACKGROUND_CSS_CLASS), com.google.android.exoplayer2.util.Util.formatInvariant("background-color:%s;", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(webViewSubtitleOutput.style.backgroundColor)));
        int i5 = 0;
        while (i5 < webViewSubtitleOutput.textCues.size()) {
            com.google.android.exoplayer2.text.Cue cue = webViewSubtitleOutput.textCues.get(i5);
            float f2 = cue.position != -3.4028235E38f ? cue.position * 100.0f : 50.0f;
            int anchorTypeToTranslatePercent = anchorTypeToTranslatePercent(cue.positionAnchor);
            if (cue.line != -3.4028235E38f) {
                if (cue.lineType != i4) {
                    java.lang.Object[] objArr = new java.lang.Object[i4];
                    objArr[c] = java.lang.Float.valueOf(cue.line * 100.0f);
                    formatInvariant = com.google.android.exoplayer2.util.Util.formatInvariant("%.2f%%", objArr);
                    if (cue.verticalType == i4) {
                        i = -anchorTypeToTranslatePercent(cue.lineAnchor);
                    } else {
                        i = anchorTypeToTranslatePercent(cue.lineAnchor);
                    }
                } else if (cue.line >= 0.0f) {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[c] = java.lang.Float.valueOf(cue.line * f);
                    formatInvariant = com.google.android.exoplayer2.util.Util.formatInvariant("%.2fem", objArr2);
                    i = 0;
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[i4];
                    objArr3[c] = java.lang.Float.valueOf(((-cue.line) - 1.0f) * f);
                    formatInvariant = com.google.android.exoplayer2.util.Util.formatInvariant("%.2fem", objArr3);
                    i = 0;
                    z = true;
                    if (cue.size == -3.4028235E38f) {
                        java.lang.Object[] objArr4 = new java.lang.Object[i4];
                        objArr4[c] = java.lang.Float.valueOf(cue.size * 100.0f);
                        str = com.google.android.exoplayer2.util.Util.formatInvariant("%.2f%%", objArr4);
                    } else {
                        str = "fit-content";
                    }
                    java.lang.String convertAlignmentToCss = convertAlignmentToCss(cue.textAlignment);
                    java.lang.String convertVerticalTypeToCss = convertVerticalTypeToCss(cue.verticalType);
                    java.lang.String convertTextSizeToCss2 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
                    java.lang.String cssRgba2 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : webViewSubtitleOutput.style.windowColor);
                    int i6 = i;
                    i2 = cue.verticalType;
                    java.lang.String str3 = "right";
                    java.lang.String str4 = "left";
                    java.lang.String str5 = "top";
                    if (i2 == 1) {
                        if (i2 != 2) {
                            if (z) {
                                str5 = com.helpshift.proactive.InAppViewConstants.POSITION_BOTTOM;
                            }
                        }
                    }
                    if (cue.verticalType != 2 || cue.verticalType == 1) {
                        str2 = "height";
                        i3 = i6;
                        i6 = anchorTypeToTranslatePercent;
                    } else {
                        str2 = "width";
                        i3 = anchorTypeToTranslatePercent;
                    }
                    com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss convert = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
                    it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        java.util.Iterator it2 = it;
                        java.lang.String str6 = (java.lang.String) it.next();
                        com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCss = convert;
                        java.lang.String str7 = (java.lang.String) hashMap.put(str6, (java.lang.String) hashMap.get(str6));
                        com.google.android.exoplayer2.util.Assertions.checkState(str7 == null || str7.equals(hashMap.get(str6)));
                        it = it2;
                        convert = htmlAndCss;
                    }
                    com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCss2 = convert;
                    java.util.HashMap hashMap2 = hashMap;
                    sb.append(com.google.android.exoplayer2.util.Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", java.lang.Integer.valueOf(i5), str4, java.lang.Float.valueOf(f2), str5, formatInvariant, str2, str, convertAlignmentToCss, convertVerticalTypeToCss, convertTextSizeToCss2, cssRgba2, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i6), getBlockShearTransformFunction(cue)));
                    sb.append(com.google.android.exoplayer2.util.Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
                    if (cue.multiRowAlignment == null) {
                        sb.append(com.google.android.exoplayer2.util.Util.formatInvariant("<span style='display:inline-block; text-align:%s;'>", convertAlignmentToCss(cue.multiRowAlignment)));
                        sb.append(htmlAndCss2.html);
                        sb.append("</span>");
                    } else {
                        sb.append(htmlAndCss2.html);
                    }
                    sb.append("</span></div>");
                    i5++;
                    webViewSubtitleOutput = this;
                    hashMap = hashMap2;
                    i4 = 1;
                    f = CSS_LINE_HEIGHT;
                    c = 0;
                }
            } else {
                java.lang.Object[] objArr5 = new java.lang.Object[i4];
                objArr5[c] = java.lang.Float.valueOf((1.0f - webViewSubtitleOutput.bottomPaddingFraction) * 100.0f);
                formatInvariant = com.google.android.exoplayer2.util.Util.formatInvariant("%.2f%%", objArr5);
                i = -100;
            }
            z = false;
            if (cue.size == -3.4028235E38f) {
            }
            java.lang.String convertAlignmentToCss2 = convertAlignmentToCss(cue.textAlignment);
            java.lang.String convertVerticalTypeToCss2 = convertVerticalTypeToCss(cue.verticalType);
            java.lang.String convertTextSizeToCss22 = webViewSubtitleOutput.convertTextSizeToCss(cue.textSizeType, cue.textSize);
            java.lang.String cssRgba22 = com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(!cue.windowColorSet ? cue.windowColor : webViewSubtitleOutput.style.windowColor);
            int i62 = i;
            i2 = cue.verticalType;
            java.lang.String str32 = "right";
            java.lang.String str42 = "left";
            java.lang.String str52 = "top";
            if (i2 == 1) {
            }
            if (cue.verticalType != 2) {
            }
            str2 = "height";
            i3 = i62;
            i62 = anchorTypeToTranslatePercent;
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss convert2 = com.google.android.exoplayer2.ui.SpannedToHtmlConverter.convert(cue.text, getContext().getResources().getDisplayMetrics().density);
            it = hashMap.keySet().iterator();
            while (it.hasNext()) {
            }
            com.google.android.exoplayer2.ui.SpannedToHtmlConverter.HtmlAndCss htmlAndCss22 = convert2;
            java.util.HashMap hashMap22 = hashMap;
            sb.append(com.google.android.exoplayer2.util.Util.formatInvariant("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", java.lang.Integer.valueOf(i5), str42, java.lang.Float.valueOf(f2), str52, formatInvariant, str2, str, convertAlignmentToCss2, convertVerticalTypeToCss2, convertTextSizeToCss22, cssRgba22, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i62), getBlockShearTransformFunction(cue)));
            sb.append(com.google.android.exoplayer2.util.Util.formatInvariant("<span class='%s'>", DEFAULT_BACKGROUND_CSS_CLASS));
            if (cue.multiRowAlignment == null) {
            }
            sb.append("</span></div>");
            i5++;
            webViewSubtitleOutput = this;
            hashMap = hashMap22;
            i4 = 1;
            f = CSS_LINE_HEIGHT;
            c = 0;
        }
        java.util.Map map = hashMap;
        sb.append("</div></body></html>");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<html><head><style>");
        for (java.lang.String str8 : map.keySet()) {
            sb2.append(str8);
            sb2.append("{");
            sb2.append((java.lang.String) map.get(str8));
            sb2.append("}");
        }
        sb2.append("</style></head>");
        sb.insert(0, sb2.toString());
        this.webView.loadData(android.util.Base64.encodeToString(sb.toString().getBytes(com.google.common.base.Charsets.UTF_8), 1), "text/html", "base64");
    }

    private static java.lang.String getBlockShearTransformFunction(com.google.android.exoplayer2.text.Cue cue) {
        java.lang.String str;
        if (cue.shearDegrees != 0.0f) {
            if (cue.verticalType == 2 || cue.verticalType == 1) {
                str = "skewY";
            } else {
                str = "skewX";
            }
            return com.google.android.exoplayer2.util.Util.formatInvariant("%s(%.2fdeg)", str, java.lang.Float.valueOf(cue.shearDegrees));
        }
        return "";
    }

    private java.lang.String convertTextSizeToCss(int i, float f) {
        float resolveTextSize = com.google.android.exoplayer2.ui.SubtitleViewUtils.resolveTextSize(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return resolveTextSize == -3.4028235E38f ? "unset" : com.google.android.exoplayer2.util.Util.formatInvariant("%.2fpx", java.lang.Float.valueOf(resolveTextSize / getContext().getResources().getDisplayMetrics().density));
    }

    private static java.lang.String convertCaptionStyleToCssTextShadow(com.google.android.exoplayer2.ui.CaptionStyleCompat captionStyleCompat) {
        int i = captionStyleCompat.edgeType;
        if (i == 1) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 2) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("0.1em 0.12em 0.15em %s", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 3) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("0.06em 0.08em 0.15em %s", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        if (i == 4) {
            return com.google.android.exoplayer2.util.Util.formatInvariant("-0.05em -0.05em 0.15em %s", com.google.android.exoplayer2.ui.HtmlUtils.toCssRgba(captionStyleCompat.edgeColor));
        }
        return "unset";
    }

    private static java.lang.String convertVerticalTypeToCss(int i) {
        if (i == 1) {
            return "vertical-rl";
        }
        if (i == 2) {
            return "vertical-lr";
        }
        return "horizontal-tb";
    }

    private static java.lang.String convertAlignmentToCss(android.text.Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = com.google.android.exoplayer2.ui.WebViewSubtitleOutput.AnonymousClass2.$SwitchMap$android$text$Layout$Alignment[alignment.ordinal()];
        if (i == 1) {
            return "start";
        }
        if (i != 2) {
            return "center";
        }
        return "end";
    }

    /* renamed from: com.google.android.exoplayer2.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$android$text$Layout$Alignment;

        static {
            int[] iArr = new int[android.text.Layout.Alignment.values().length];
            $SwitchMap$android$text$Layout$Alignment = iArr;
            try {
                iArr[android.text.Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$text$Layout$Alignment[android.text.Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
