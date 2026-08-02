package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: com.google.android.gms.internal.ads.Pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0665Pg {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11087a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    public static final String f11088b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    public static final String f11089c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    public static final String f11090d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    public static final String f11091e = Integer.toString(4, 36);

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11087a, spanned.getSpanStart(obj));
        bundle2.putInt(f11088b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11089c, spanned.getSpanFlags(obj));
        bundle2.putInt(f11090d, i);
        if (bundle != null) {
            bundle2.putBundle(f11091e, bundle);
        }
        return bundle2;
    }
}
