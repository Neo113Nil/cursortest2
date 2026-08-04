package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.Map;
import p044f6.d;
import p050g6.s;

/* JADX INFO: loaded from: classes.dex */
public final class zzgn implements zzgm {
    private final Context zza;
    private final Map zzb = s.M0(new d(2, "activity"), new d(3, "phone"), new d(4, "input_method"), new d(5, "audio"));

    public zzgn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzgl.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzgm
    public final Object zza(Object... objArr) throws zzby {
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
