package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Rf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0999Rf implements com.facebook.ads.internal.api.AudienceNetworkActivityApi {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"npa5fyfDyBgpHwGfwNiqfHEj4F8LEiZf", "OqeETugh9", "5goSJATWOcVItDjddk", "82BqGjCZsQ5KSOXOW0A0KlOfyUV9N54d", "DC8qTi6RH4AT7G9O", "9IwTeKuU2aT5NbzWtfQwCWqg5E0PczVH", "CnGxzoUQk", "OIUpXP34AuomSZv"};
    public boolean A00;
    public final com.facebook.ads.internal.api.AudienceNetworkActivityApi A01;
    public final com.facebook.ads.redexgen.core.C0998Re A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {101, 97, 98, 86, 71, 74, 70, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 109, 70, 87, 84, 76, 81, 72, 19, 40, 35, 62, 54, 35, 37, 50, 35, 34, 102, 35, 62, 37, 35, 54, 50, 47, 41, 40, 104, 60, 51, 2, 60, 62, 41, 52, 43, 52, 41, 36};
        if (A04[2].length() == 12) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A04;
        strArr[3] = "H3o2ukg7PoWSfztBPt1oK5BMl3p36c0G";
        strArr[0] = "tZaZcqIYCt5A5bsZPeypVNujsThHJ9sw";
        A03 = bArr;
    }

    static {
        A01();
    }

    public C0999Rf(com.facebook.ads.AudienceNetworkActivity audienceNetworkActivity, com.facebook.ads.internal.api.AudienceNetworkActivityApi audienceNetworkActivityApi, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A01 = audienceNetworkActivityApi;
        this.A02 = c0998Re;
    }

    private void A02(java.lang.Throwable th) {
        this.A00 = true;
        this.A02.A09();
        finish(8);
        com.facebook.ads.redexgen.core.T8 logContext = this.A02.A06();
        if (logContext != null) {
            logContext.A08().ABC(A00(38, 11, 116), com.facebook.ads.redexgen.core.AbstractC1048Td.A0C, new com.facebook.ads.redexgen.core.C1049Te(th));
            return;
        }
        android.util.Log.e(A00(0, 17, 10), A00(17, 21, 111), th);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        try {
            if (this.A00) {
                this.A01.dump(str, fileDescriptor, printWriter, strArr);
            } else {
                this.A02.dump(str, fileDescriptor, printWriter, strArr);
            }
        } catch (java.lang.Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A02.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        try {
        } catch (java.lang.Throwable t) {
            A02(t);
        }
        if (this.A00) {
            this.A01.onActivityResult(i, i2, intent);
        } else {
            this.A02.onActivityResult(i, i2, intent);
            this.A01.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        try {
            if (this.A00) {
                return;
            }
            this.A02.onBackPressed();
        } catch (java.lang.Throwable th) {
            if (A04[5].charAt(6) == 'I') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[7] = "nPADpKrXuoueUGX";
            strArr[4] = "T13akIzntQNSUZag";
            A02(th);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        try {
        } catch (java.lang.Throwable t) {
            A02(t);
        }
        if (this.A00) {
            this.A01.onConfigurationChanged(configuration);
            return;
        }
        this.A02.onConfigurationChanged(configuration);
        this.A01.onConfigurationChanged(configuration);
        java.lang.String[] strArr = A04;
        if (strArr[1].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[7] = "Q1wJ3SQKEGYG95X";
        strArr2[4] = "AvO5pGxADzIyCHUj";
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(android.os.Bundle bundle) {
        this.A01.onCreate(bundle);
        try {
            this.A02.onCreate(bundle);
        } catch (java.lang.Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        try {
        } catch (java.lang.Throwable th) {
            if (A04[2].length() == 12) {
                throw new java.lang.RuntimeException();
            }
            A04[2] = "3CPJLXRae2337PFMI";
            A02(th);
        }
        if (this.A00) {
            this.A01.onDestroy();
        } else {
            this.A02.onDestroy();
            this.A01.onDestroy();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        try {
        } catch (java.lang.Throwable t) {
            A02(t);
        }
        if (this.A00) {
            this.A01.onPause();
        } else {
            this.A02.onPause();
            this.A01.onPause();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A01.onResume();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onResume();
        } catch (java.lang.Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        this.A01.onSaveInstanceState(bundle);
        try {
            if (this.A00) {
                return;
            }
            this.A02.onSaveInstanceState(bundle);
        } catch (java.lang.Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A01.onStart();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onStart();
        } catch (java.lang.Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A01.onStop();
        try {
            if (this.A00) {
                return;
            }
            this.A02.onStop();
        } catch (java.lang.Throwable t) {
            A02(t);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        try {
        } catch (java.lang.Throwable t) {
            A02(t);
        }
        if (this.A00) {
            return this.A01.onTouchEvent(motionEvent);
        }
        this.A02.onTouchEvent(motionEvent);
        return this.A01.onTouchEvent(motionEvent);
    }
}
