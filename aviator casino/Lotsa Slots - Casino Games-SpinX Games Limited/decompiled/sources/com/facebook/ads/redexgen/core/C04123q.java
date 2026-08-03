package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04123q extends com.facebook.ads.redexgen.core.ED {
    public static byte[] A04;
    public static java.lang.String[] A05 = {"QMyl0EdrMkBz74Ff", "RsTLWDF6GNKozTWYWcUQtNpRSKZ3a8yy", "3BM6qDUn0450lnygNbifIZpDeGnVa2ha", "F", "qC4SUzvBtsB95zH", "T9xPYhzLnjJILIo2UZ88O5HWOSlCgw65", "9Z5hXOcvGEJoZZ2dBR43Uw9AYXT3hwwE", "j5Icya"};

    @javax.annotation.Nullable
    public java.lang.ref.WeakReference<android.media.AudioManager.OnAudioFocusChangeListener> A00;
    public final com.facebook.ads.redexgen.core.EA A01;
    public final com.facebook.ads.redexgen.core.E4 A02;
    public final com.facebook.ads.redexgen.core.E2 A03;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 42);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{-108, -88, -105, -100, -94};
    }

    static {
        A05();
    }

    public C04123q(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A00 = null;
        this.A01 = new com.facebook.ads.redexgen.core.EA() { // from class: com.facebook.ads.redexgen.X.3u
            public static byte[] A01;
            public static java.lang.String[] A02 = {"QO", "Z8VzzUk48H2MjHputsbFKGrTuA", "oizJfYv64JjjPWcjk8h6rnHMPSWYW3KU", "f0BEY4eTEaDQ97bHAlskleks6ilDfv7w", "kzTTWWoLyKzhVsFKHFAAxGaFMysI7iP7", "O5", "DqVK5n8IQlswAJl59jQWGsTS7h", "g8gXhMPhSk6l7LNUsVLjaHR4ALnMtBc"};

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    java.lang.String[] strArr = A02;
                    if (strArr[5].length() != strArr[0].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A02[3] = "zGtxq0LnznDpkAI9fIogelgluQXN9rJC";
                    if (i4 >= length) {
                        return new java.lang.String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{7, 19, 2, com.google.common.base.Ascii.SI, 9};
            }

            static {
                A01();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4K c4k) {
                java.lang.ref.WeakReference weakReference;
                java.lang.ref.WeakReference weakReference2;
                android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
                android.media.AudioManager audioManager = (android.media.AudioManager) com.facebook.ads.redexgen.core.C04123q.this.getContext().getApplicationContext().getSystemService(A00(0, 5, 10));
                weakReference = com.facebook.ads.redexgen.core.C04123q.this.A00;
                if (weakReference == null) {
                    onAudioFocusChangeListener = null;
                } else {
                    weakReference2 = com.facebook.ads.redexgen.core.C04123q.this.A00;
                    onAudioFocusChangeListener = (android.media.AudioManager.OnAudioFocusChangeListener) weakReference2.get();
                }
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
        };
        this.A02 = new com.facebook.ads.redexgen.core.E4() { // from class: com.facebook.ads.redexgen.X.3s
            public static byte[] A01;

            static {
                A01();
            }

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{90, 78, 95, 82, 84};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A02, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C4B c4b) {
                java.lang.ref.WeakReference weakReference;
                java.lang.ref.WeakReference weakReference2;
                android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener;
                android.media.AudioManager audioManager = (android.media.AudioManager) com.facebook.ads.redexgen.core.C04123q.this.getContext().getApplicationContext().getSystemService(A00(0, 5, 92));
                weakReference = com.facebook.ads.redexgen.core.C04123q.this.A00;
                if (weakReference == null) {
                    onAudioFocusChangeListener = null;
                } else {
                    weakReference2 = com.facebook.ads.redexgen.core.C04123q.this.A00;
                    onAudioFocusChangeListener = (android.media.AudioManager.OnAudioFocusChangeListener) weakReference2.get();
                }
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
        };
        this.A03 = new com.facebook.ads.redexgen.core.C04133r(this);
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ED
    public final void A08() {
        if (getVideoView() != null) {
            com.facebook.ads.redexgen.core.UM<com.facebook.ads.redexgen.core.UN, com.facebook.ads.redexgen.core.UL> eventBus = getVideoView().getEventBus();
            com.facebook.ads.redexgen.core.UN[] unArr = new com.facebook.ads.redexgen.core.UN[3];
            java.lang.String[] strArr = A05;
            if (strArr[5].charAt(16) == strArr[6].charAt(16)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A05;
            strArr2[5] = "N8PlN6ko7rCmWrjSgXmwzpcc7zXrNMwO";
            strArr2[6] = "3Ei0HdJvkUvOcHctndwpn9MtMWHZ1TMz";
            unArr[0] = this.A02;
            unArr[1] = this.A01;
            unArr[2] = this.A03;
            eventBus.A04(unArr);
        }
        super.A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ((android.media.AudioManager) getContext().getApplicationContext().getSystemService(A02(0, 5, 9))).abandonAudioFocus(this.A00 == null ? null : this.A00.get());
        super.onDetachedFromWindow();
    }
}
