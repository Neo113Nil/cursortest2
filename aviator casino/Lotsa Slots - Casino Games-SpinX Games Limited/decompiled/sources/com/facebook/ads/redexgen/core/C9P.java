package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9P {
    public final android.media.AudioTrack.StreamEventCallback A00;
    public final android.os.Handler A01 = new android.os.Handler(android.os.Looper.myLooper());
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2077oM A02;

    public C9P(final com.facebook.ads.redexgen.core.C2077oM c2077oM) {
        this.A02 = c2077oM;
        this.A00 = new android.media.AudioTrack.StreamEventCallback() { // from class: com.facebook.ads.redexgen.X.9O
            public static java.lang.String[] A02 = {"8abdE8ICHAnxwFMUcOcB2jRAyUCGhoJo", "eSG1FX4JUeB6EOGXBLLAS9lOPW1", "25OZd6V", "MAJYraeiFmbj", "mUQNxKLiPMNWcUO6nW3zZtqSV9cqGhZ8", "VvmkF0iz3WmQeVV4Hfojcs5Qu1q9OORp", "gntz5ah2KiglLn2nngo2Gr7V9oibD8w7", "BsUxp7JWgCvt"};

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(android.media.AudioTrack audioTrack, int i) {
                android.media.AudioTrack audioTrack2;
                com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v;
                boolean z;
                com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v2;
                audioTrack2 = com.facebook.ads.redexgen.core.C9P.this.A02.A0D;
                if (!audioTrack.equals(audioTrack2)) {
                    return;
                }
                interfaceC05448v = com.facebook.ads.redexgen.core.C9P.this.A02.A0I;
                if (interfaceC05448v != null) {
                    com.facebook.ads.redexgen.core.C2077oM c2077oM2 = com.facebook.ads.redexgen.core.C9P.this.A02;
                    java.lang.String[] strArr = A02;
                    if (strArr[1].length() == strArr[2].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    A02[0] = "JFsW9FWtG581w4rAGivIJch2V9mOeS5l";
                    z = c2077oM2.A0X;
                    if (!z) {
                        return;
                    }
                    interfaceC05448v2 = com.facebook.ads.redexgen.core.C9P.this.A02.A0I;
                    interfaceC05448v2.AF2();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(android.media.AudioTrack audioTrack) {
                android.media.AudioTrack audioTrack2;
                com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v;
                boolean z;
                com.facebook.ads.redexgen.core.InterfaceC05448v interfaceC05448v2;
                audioTrack2 = com.facebook.ads.redexgen.core.C9P.this.A02.A0D;
                if (!audioTrack.equals(audioTrack2)) {
                    return;
                }
                interfaceC05448v = com.facebook.ads.redexgen.core.C9P.this.A02.A0I;
                if (interfaceC05448v != null) {
                    com.facebook.ads.redexgen.core.C9P c9p = com.facebook.ads.redexgen.core.C9P.this;
                    java.lang.String[] strArr = A02;
                    if (strArr[3].length() != strArr[7].length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A02;
                    strArr2[3] = "n6LYwQPnbsiV";
                    strArr2[7] = "LQIZIXydZbX4";
                    z = c9p.A02.A0X;
                    if (!z) {
                        return;
                    }
                    interfaceC05448v2 = com.facebook.ads.redexgen.core.C9P.this.A02.A0I;
                    interfaceC05448v2.AF2();
                }
            }
        };
    }

    public final void A00(android.media.AudioTrack audioTrack) {
        android.os.Handler handler = this.A01;
        java.util.Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new com.facebook.ads.redexgen.core.C9N(handler), this.A00);
    }

    public final void A01(android.media.AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages(null);
    }
}
