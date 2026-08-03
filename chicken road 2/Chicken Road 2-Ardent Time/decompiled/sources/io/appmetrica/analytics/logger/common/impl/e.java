package io.appmetrica.analytics.logger.common.impl;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.regex.Pattern f7278a = java.util.regex.Pattern.compile("[\\p{Space},;]");

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r3 == (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r3 == (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(java.util.regex.Matcher matcher, int i2, int i3) {
        int start;
        int a2;
        if (i3 < i2) {
            return -1;
        }
        int i4 = ((i3 - i2) / 2) + i2;
        matcher.region(i4, i3);
        if (matcher.find()) {
            start = matcher.start();
            a2 = a(matcher, start + 1, i3);
        } else {
            matcher.region(i2, i4);
            if (!matcher.find()) {
                return -1;
            }
            start = matcher.start();
            a2 = a(matcher, start + 1, i4);
        }
    }
}
