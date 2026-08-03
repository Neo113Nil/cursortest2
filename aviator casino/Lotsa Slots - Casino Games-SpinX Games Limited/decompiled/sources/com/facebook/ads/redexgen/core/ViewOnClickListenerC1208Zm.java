package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1208Zm implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"XFhwvfKkSyEqyRRacFdsqa616PFWUHCh", "TE99xZ7RorqY7SfVqRabPy9CgIKsfp3m", "kdLoeHuwvZoF6PjW0V2phiTjzwiVAf2t", "RlTzAejg9EfvSUQcXL5xjQX", "GFFSxtzm", "K1qZUjF5HHG2weDv49vHRNq0ZyDtpmc", "H0qCz3fL", "PDkQY8eSanvsX5OhJAHoWikZaqKVEEl4"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.MD A00;

    public ViewOnClickListenerC1208Zm(com.facebook.ads.redexgen.core.MD md) {
        this.A00 = md;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (java.lang.Throwable th) {
            if (A01[0].charAt(19) == 'i') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[4] = "TKgPwnLp";
            strArr[6] = "fznJdSDC";
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
