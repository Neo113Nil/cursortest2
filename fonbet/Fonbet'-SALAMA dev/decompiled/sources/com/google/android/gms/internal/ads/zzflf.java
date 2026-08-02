package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzflf {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfle zzb(View view) {
        zzfle zzfleVar = (zzfle) this.zzb.get(view);
        if (zzfleVar != null) {
            this.zzb.remove(view);
        }
        return zzfleVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        String str;
        Activity activity;
        Boolean bool;
        zzfkc zza = zzfkc.zza();
        if (zza != null) {
            for (zzfjl zzfjlVar : zza.zzb()) {
                View zzf = zzfjlVar.zzf();
                if (zzfjlVar.zzj()) {
                    String zzh = zzfjlVar.zzh();
                    if (zzf != null) {
                        Context context = zzf.getContext();
                        while (true) {
                            str = null;
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (isInPictureInPictureMode) {
                            this.zzh.add(zzh);
                        }
                        if (zzf.isAttachedToWindow()) {
                            if (zzf.hasWindowFocus()) {
                                this.zzi.remove(zzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzi.containsKey(zzf)) {
                                bool = (Boolean) this.zzi.get(zzf);
                            } else {
                                Map map = this.zzi;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzf, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || isInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view = zzf;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String zza2 = zzfld.zza(view);
                                    if (zza2 != null) {
                                        str = zza2;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfkf zzfkfVar : zzfjlVar.zzi()) {
                                View view2 = (View) zzfkfVar.zzb().get();
                                if (view2 != null) {
                                    zzfle zzfleVar = (zzfle) this.zzb.get(view2);
                                    if (zzfleVar != null) {
                                        zzfleVar.zzc(zzfjlVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfle(zzfkfVar, zzfjlVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(View view) {
        if (!this.zzi.containsKey(view)) {
            return true;
        }
        this.zzi.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
