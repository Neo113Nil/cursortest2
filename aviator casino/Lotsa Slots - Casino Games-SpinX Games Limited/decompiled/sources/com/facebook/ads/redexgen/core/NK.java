package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class NK extends android.content.BroadcastReceiver {
    public static java.lang.String[] A03 = {"dggRIwntGnoxWZ7BDQUg45Sl6NQgoMuN", "38c9H60yn2P1pt17", "STlEyQPStERy8tSXGvH8F24LWNUxdBhq", "hCwe", "bKRxwQpiW0PmVHVfGUn2RavmyNEFkRji", "VPPe2MO9HED0sxCZzVAB8cvkabJHsXeP", "uH31h0PRXTyVkIOgrCb5PcgaQIfZ1AyX", "pPlbIWWtmQkYN3MHTwcOdVUNUzBLXTby"};
    public com.facebook.ads.redexgen.core.AbstractC1805jh A00;
    public com.facebook.ads.redexgen.core.NJ A01;
    public java.lang.String A02;

    public NK(java.lang.String str, com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh, com.facebook.ads.redexgen.core.NJ nj) {
        this.A00 = abstractC1805jh;
        this.A01 = nj;
        this.A02 = str;
    }

    public final android.content.IntentFilter A00() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A06.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A09.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A04.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A0A.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A05.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A0C.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A0B.A04(this.A02));
        intentFilter.addAction(com.facebook.ads.redexgen.core.EnumC1529ez.A03.A04(this.A02));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez = com.facebook.ads.redexgen.core.EnumC1529ez.A06;
        java.lang.String action2 = this.A02;
        if (enumC1529ez.A04(action2).equals(action)) {
            this.A01.AFo(this.A00);
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez2 = com.facebook.ads.redexgen.core.EnumC1529ez.A09;
        java.lang.String action3 = this.A02;
        if (enumC1529ez2.A04(action3).equals(action)) {
            if (com.facebook.ads.redexgen.core.C1086Up.A1y(context)) {
                this.A01.AFp(this.A00, com.facebook.ads.AdError.AD_PRESENTATION_ERROR);
                return;
            } else {
                this.A01.AFp(this.A00, com.facebook.ads.AdError.INTERNAL_ERROR);
                return;
            }
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez3 = com.facebook.ads.redexgen.core.EnumC1529ez.A04;
        java.lang.String action4 = this.A02;
        if (enumC1529ez3.A04(action4).equals(action)) {
            this.A01.AFl(this.A00);
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez4 = com.facebook.ads.redexgen.core.EnumC1529ez.A0A;
        java.lang.String action5 = this.A02;
        if (enumC1529ez4.A04(action5).equals(action)) {
            this.A01.AFn(this.A00);
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez5 = com.facebook.ads.redexgen.core.EnumC1529ez.A05;
        java.lang.String action6 = this.A02;
        boolean equals = enumC1529ez5.A04(action6).equals(action);
        if (A03[6].charAt(8) != 'X') {
            throw new java.lang.RuntimeException();
        }
        A03[6] = "gVjZHTAPXXqW3paCpGTUxeCgOEd4dSxo";
        if (equals) {
            this.A01.onRewardedVideoClosed();
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez6 = com.facebook.ads.redexgen.core.EnumC1529ez.A0B;
        java.lang.String action7 = this.A02;
        if (enumC1529ez6.A04(action7).equals(action)) {
            com.facebook.ads.redexgen.core.NJ nj = this.A01;
            com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh = this.A00;
            java.lang.String[] strArr = A03;
            if (strArr[2].charAt(25) != strArr[4].charAt(25)) {
                throw new java.lang.RuntimeException();
            }
            A03[6] = "QgP7tKiwXm5h6JnagwUE7gN68w8IQRlz";
            nj.AFj(abstractC1805jh);
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez7 = com.facebook.ads.redexgen.core.EnumC1529ez.A0C;
        java.lang.String action8 = this.A02;
        if (enumC1529ez7.A04(action8).equals(action)) {
            this.A01.AFk(this.A00);
            return;
        }
        com.facebook.ads.redexgen.core.EnumC1529ez enumC1529ez8 = com.facebook.ads.redexgen.core.EnumC1529ez.A03;
        java.lang.String str = this.A02;
        if (A03[0].charAt(19) != 'F') {
            A03[1] = "4VvB4uonEo2HdG2J";
            java.lang.String action9 = enumC1529ez8.A04(str);
            if (!action9.equals(action)) {
                return;
            }
        } else {
            java.lang.String action10 = enumC1529ez8.A04(str);
            if (!action10.equals(action)) {
                return;
            }
        }
        this.A01.onRewardedVideoActivityDestroyed();
    }
}
