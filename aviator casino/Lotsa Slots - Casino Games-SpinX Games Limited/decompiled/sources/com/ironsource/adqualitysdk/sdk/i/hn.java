package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class hn extends com.ironsource.adqualitysdk.sdk.i.hi<android.media.MediaPlayer.OnCompletionListener> implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2377 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2378 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2379 = -3596124203662077445L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.hn.a f2380;

    public interface a {
        /* renamed from: ﾇ */
        void mo7404(com.ironsource.adqualitysdk.sdk.i.hn hnVar, android.media.MediaPlayer mediaPlayer);
    }

    public hn(android.media.MediaPlayer.OnCompletionListener onCompletionListener, com.ironsource.adqualitysdk.sdk.i.hn.a aVar) {
        super(onCompletionListener);
        this.f2380 = aVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        int i = 2 % 2;
        int i2 = f2377 + 25;
        f2378 = i2 % 128;
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.adqualitysdk.sdk.i.kl.m8455(m7838("醴ꇀ\uf112ū僂怢끩쏍ጧ⍯狆舲퉋\ue5c3㔮䕴铎ꐰ\uf464߆圛杧뛖옷ᙱ⧗礭襣\ud8c5", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12373).intern(), m7838("醾䝊㰏ᗝ쪅ꀔ餀什⟃ᵍ\uf231꯸肓癵⼢Ӣﶮ퍦蠨懰囧౫\ue557\uda3d돜條幅㜆\uecca얘뭈选䧵", 54979 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
        }
        if (i2 % 2 != 0) {
            this.f2380.mo7404(this, mediaPlayer);
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }
        this.f2380.mo7404(this, mediaPlayer);
        if (mo6360() != null) {
            int i3 = f2378 + 27;
            f2377 = i3 % 128;
            int i4 = i3 % 2;
            mo6360().onCompletion(mediaPlayer);
        }
        int i5 = f2378 + 49;
        f2377 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 68 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static java.lang.String m7838(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2379);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
