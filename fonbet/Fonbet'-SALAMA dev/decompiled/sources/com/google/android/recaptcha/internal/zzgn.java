package com.google.android.recaptcha.internal;

import android.content.Context;
import f6.C1111d;
import g6.AbstractC1170s;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgn implements zzgm {
    private final Context zza;
    private final Map zzb = AbstractC1170s.M0(new C1111d(2, "activity"), new C1111d(3, "phone"), new C1111d(4, "input_method"), new C1111d(5, "audio"));

    public zzgn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final Object zza(Object... objArr) {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzby(4, 4, null);
    }
}
