package p000;

/* JADX INFO: renamed from: hg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0285hg extends AbstractC0210fg {

    /* JADX INFO: renamed from: k */
    public static final int f3199k = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: l */
    public static final C0285hg f3200l = new C0285hg("CharMatcher.whitespace()");

    @Override // p000.af0
    /* JADX INFO: renamed from: e */
    public final boolean mo200e(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f3199k) == c;
    }
}
