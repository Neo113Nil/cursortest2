package androidx.core.text.util;

/* loaded from: classes7.dex */
public final class LinkifyCompat {
    private static final java.lang.String[] Camera2StreamConfigurationMap = new java.lang.String[0];
    private static final java.util.Comparator<androidx.core.text.util.LinkifyCompat.LinkSpec> getHighSpeedVideoFpsRanges = new java.util.Comparator() { // from class: androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.core.text.util.LinkifyCompat.getHighSpeedVideoFpsRangesFor((androidx.core.text.util.LinkifyCompat.LinkSpec) obj, (androidx.core.text.util.LinkifyCompat.LinkSpec) obj2);
        }
    };

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LinkifyMask {
    }

    static /* synthetic */ int getHighSpeedVideoFpsRangesFor(androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec, androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec2) {
        if (linkSpec.getHighSpeedVideoFpsRanges < linkSpec2.getHighSpeedVideoFpsRanges) {
            return -1;
        }
        if (linkSpec.getHighSpeedVideoFpsRanges > linkSpec2.getHighSpeedVideoFpsRanges) {
            return 1;
        }
        return java.lang.Integer.compare(linkSpec2.getHighResolutionOutputSizeshNQ4ISI, linkSpec.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static boolean addLinks(android.text.Spannable spannable, int i) {
        if (getHighSpeedVideoSizes()) {
            return android.text.util.Linkify.addLinks(spannable, i);
        }
        if (i == 0) {
            return false;
        }
        android.text.style.URLSpan[] uRLSpanArr = (android.text.style.URLSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i & 4) != 0) {
            android.text.util.Linkify.addLinks(spannable, 4);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i & 1) != 0) {
            getHighSpeedVideoFpsRangesFor(arrayList, spannable, androidx.core.util.PatternsCompat.AUTOLINK_WEB_URL, new java.lang.String[]{"http://", "https://", "rtsp://"}, android.text.util.Linkify.sUrlMatchFilter, null);
        }
        if ((i & 2) != 0) {
            getHighSpeedVideoFpsRangesFor(arrayList, spannable, androidx.core.util.PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new java.lang.String[]{androidx.core.net.MailTo.MAILTO_SCHEME}, null, null);
        }
        if ((i & 8) != 0) {
            getHighResolutionOutputSizeshNQ4ISI(arrayList, spannable);
        }
        getHighSpeedVideoFpsRangesFor((java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec>) arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = (androidx.core.text.util.LinkifyCompat.LinkSpec) it.next();
            if (linkSpec.Camera2StreamConfigurationMap == null) {
                getHighSpeedVideoFpsRanges(linkSpec.getHighSpeedVideoFpsRangesFor, linkSpec.getHighSpeedVideoFpsRanges, linkSpec.getHighResolutionOutputSizeshNQ4ISI, spannable);
            }
        }
        return true;
    }

    public static boolean addLinks(android.widget.TextView textView, int i) {
        if (getHighSpeedVideoSizes()) {
            return android.text.util.Linkify.addLinks(textView, i);
        }
        if (i == 0) {
            return false;
        }
        java.lang.CharSequence text = textView.getText();
        if (text instanceof android.text.Spannable) {
            if (addLinks((android.text.Spannable) text, i)) {
                Camera2StreamConfigurationMap(textView);
                return true;
            }
        } else {
            android.text.SpannableString valueOf = android.text.SpannableString.valueOf(text);
            if (addLinks(valueOf, i)) {
                Camera2StreamConfigurationMap(textView);
                textView.setText(valueOf);
                return true;
            }
        }
        return false;
    }

    public static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str) {
        if (getHighSpeedVideoSizes()) {
            android.text.util.Linkify.addLinks(textView, pattern, str);
        } else {
            addLinks(textView, pattern, str, (java.lang.String[]) null, (android.text.util.Linkify.MatchFilter) null, (android.text.util.Linkify.TransformFilter) null);
        }
    }

    public static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (getHighSpeedVideoSizes()) {
            android.text.util.Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            addLinks(textView, pattern, str, (java.lang.String[]) null, matchFilter, transformFilter);
        }
    }

    public static void addLinks(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (getHighSpeedVideoSizes()) {
            androidx.core.text.util.LinkifyCompat.Api24Impl.getHighSpeedVideoSizes(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(textView.getText());
        if (addLinks(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            Camera2StreamConfigurationMap(textView);
        }
    }

    public static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str) {
        if (getHighSpeedVideoSizes()) {
            return android.text.util.Linkify.addLinks(spannable, pattern, str);
        }
        return addLinks(spannable, pattern, str, (java.lang.String[]) null, (android.text.util.Linkify.MatchFilter) null, (android.text.util.Linkify.TransformFilter) null);
    }

    public static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        if (getHighSpeedVideoSizes()) {
            return android.text.util.Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
        }
        return addLinks(spannable, pattern, str, (java.lang.String[]) null, matchFilter, transformFilter);
    }

    public static boolean addLinks(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        java.lang.String lowerCase;
        if (getHighSpeedVideoSizes()) {
            return androidx.core.text.util.LinkifyCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length <= 0) {
            strArr = Camera2StreamConfigurationMap;
        }
        java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
        strArr2[0] = str.toLowerCase(java.util.Locale.ROOT);
        int i = 0;
        while (i < strArr.length) {
            java.lang.String str2 = strArr[i];
            i++;
            if (str2 == null) {
                lowerCase = "";
            } else {
                lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            }
            strArr2[i] = lowerCase;
        }
        java.util.regex.Matcher matcher = pattern.matcher(spannable);
        boolean z = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            java.lang.String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes(group, strArr2, matcher, transformFilter), start, end, spannable);
                    z = true;
                }
            }
        }
        return z;
    }

    private static boolean getHighSpeedVideoSizes() {
        return android.os.Build.VERSION.SDK_INT >= 28;
    }

    private static void Camera2StreamConfigurationMap(android.widget.TextView textView) {
        if ((textView.getMovementMethod() instanceof android.text.method.LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.lang.String[] strArr, java.util.regex.Matcher matcher, android.text.util.Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            java.lang.String str2 = strArr[i];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!str.regionMatches(false, 0, str2, 0, str2.length())) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append(str.substring(str2.length()));
                    str = sb.toString();
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(strArr[0]);
        sb2.append(str);
        return sb2.toString();
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList, android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
        java.util.regex.Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            java.lang.String group = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                if (group != null) {
                    androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = new androidx.core.text.util.LinkifyCompat.LinkSpec();
                    linkSpec.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoSizes(group, strArr, matcher, transformFilter);
                    linkSpec.getHighSpeedVideoFpsRanges = start;
                    linkSpec.getHighResolutionOutputSizeshNQ4ISI = end;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, int i2, android.text.Spannable spannable) {
        spannable.setSpan(new android.text.style.URLSpan(str), i, i2, 33);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList, android.text.Spannable spannable) {
        int indexOf;
        java.lang.String obj = spannable.toString();
        int i = 0;
        while (true) {
            try {
                java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(obj);
                if (highSpeedVideoFpsRangesFor == null || (indexOf = obj.indexOf(highSpeedVideoFpsRangesFor)) < 0) {
                    return;
                }
                androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = new androidx.core.text.util.LinkifyCompat.LinkSpec();
                int length = highSpeedVideoFpsRangesFor.length() + indexOf;
                linkSpec.getHighSpeedVideoFpsRanges = indexOf + i;
                i += length;
                linkSpec.getHighResolutionOutputSizeshNQ4ISI = i;
                obj = obj.substring(length);
                try {
                    java.lang.String encode = java.net.URLEncoder.encode(highSpeedVideoFpsRangesFor, "UTF-8");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("geo:0,0?q=");
                    sb.append(encode);
                    linkSpec.getHighSpeedVideoFpsRangesFor = sb.toString();
                    arrayList.add(linkSpec);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            } catch (java.lang.UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return android.webkit.WebView.findAddress(str);
        }
        return androidx.core.text.util.FindAddress.Camera2StreamConfigurationMap(str);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> arrayList, android.text.Spannable spannable) {
        int i;
        int i2 = 0;
        for (android.text.style.URLSpan uRLSpan : (android.text.style.URLSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.URLSpan.class)) {
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec = new androidx.core.text.util.LinkifyCompat.LinkSpec();
            linkSpec.Camera2StreamConfigurationMap = uRLSpan;
            linkSpec.getHighSpeedVideoFpsRanges = spannable.getSpanStart(uRLSpan);
            linkSpec.getHighResolutionOutputSizeshNQ4ISI = spannable.getSpanEnd(uRLSpan);
            arrayList.add(linkSpec);
        }
        java.util.Collections.sort(arrayList, getHighSpeedVideoFpsRanges);
        int size = arrayList.size();
        while (i2 < size - 1) {
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec2 = arrayList.get(i2);
            int i3 = i2 + 1;
            androidx.core.text.util.LinkifyCompat.LinkSpec linkSpec3 = arrayList.get(i3);
            if (linkSpec2.getHighSpeedVideoFpsRanges <= linkSpec3.getHighSpeedVideoFpsRanges && linkSpec2.getHighResolutionOutputSizeshNQ4ISI > linkSpec3.getHighSpeedVideoFpsRanges) {
                if (linkSpec3.getHighResolutionOutputSizeshNQ4ISI > linkSpec2.getHighResolutionOutputSizeshNQ4ISI && linkSpec2.getHighResolutionOutputSizeshNQ4ISI - linkSpec2.getHighSpeedVideoFpsRanges <= linkSpec3.getHighResolutionOutputSizeshNQ4ISI - linkSpec3.getHighSpeedVideoFpsRanges) {
                    i = linkSpec2.getHighResolutionOutputSizeshNQ4ISI - linkSpec2.getHighSpeedVideoFpsRanges < linkSpec3.getHighResolutionOutputSizeshNQ4ISI - linkSpec3.getHighSpeedVideoFpsRanges ? i2 : -1;
                } else {
                    i = i3;
                }
                if (i != -1) {
                    java.lang.Object obj = arrayList.get(i).Camera2StreamConfigurationMap;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i);
                    size--;
                }
            }
            i2 = i3;
        }
    }

    private LinkifyCompat() {
    }

    static class LinkSpec {
        android.text.style.URLSpan Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        LinkSpec() {
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void getHighSpeedVideoSizes(android.widget.TextView textView, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
            android.text.util.Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.text.Spannable spannable, java.util.regex.Pattern pattern, java.lang.String str, java.lang.String[] strArr, android.text.util.Linkify.MatchFilter matchFilter, android.text.util.Linkify.TransformFilter transformFilter) {
            return android.text.util.Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
    }
}
