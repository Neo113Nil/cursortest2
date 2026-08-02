package com.google.android.gms.internal.ads;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzfwk implements Map, Serializable {
    private transient zzfwm zza;
    private transient zzfwm zzb;
    private transient zzfwc zzc;

    public static zzfwk zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfwj zzfwjVar = new zzfwj(entrySet != null ? entrySet.size() : 4);
        zzfwjVar.zzb(entrySet);
        return zzfwjVar.zzc();
    }

    public static zzfwk zzd() {
        return zzfxy.zza;
    }

    public static zzfwk zze(Object obj, Object obj2) {
        zzfve.zzb("dialog_not_shown_reason", obj2);
        return zzfxy.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzfxe.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfyj.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfve.zza(size, RRWebVideoEvent.JsonKeys.SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z4 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzfwc zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfwc values() {
        zzfwc zzfwcVar = this.zzc;
        if (zzfwcVar != null) {
            return zzfwcVar;
        }
        zzfwc zza = zza();
        this.zzc = zza;
        return zza;
    }

    public abstract zzfwm zzf();

    public abstract zzfwm zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfwm entrySet() {
        zzfwm zzfwmVar = this.zza;
        if (zzfwmVar != null) {
            return zzfwmVar;
        }
        zzfwm zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfwm keySet() {
        zzfwm zzfwmVar = this.zzb;
        if (zzfwmVar != null) {
            return zzfwmVar;
        }
        zzfwm zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
