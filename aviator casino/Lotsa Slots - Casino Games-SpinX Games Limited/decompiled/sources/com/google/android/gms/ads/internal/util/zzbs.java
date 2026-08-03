package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbs {
    public static boolean zza(int i) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeq)).booleanValue()) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzer)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|4|5|(2:8|6)|9|10|(1:12)(1:66)|13|14|(7:57|58|17|18|19|20|(10:22|(8:26|27|(2:29|(1:31)(1:49))(1:50)|32|33|(3:42|43|(1:45))|35|(2:37|38))|51|27|(0)(0)|32|33|(0)|35|(0))(10:52|(8:54|27|(0)(0)|32|33|(0)|35|(0))|51|27|(0)(0)|32|33|(0)|35|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0169, code lost:
    
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163 A[Catch: JSONException -> 0x0168, TRY_LEAVE, TryCatch #6 {JSONException -> 0x0168, blocks: (B:19:0x012f, B:31:0x015a, B:49:0x015e, B:50:0x0163), top: B:18:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static org.json.JSONObject zzb(android.content.Context context, android.view.View view) {
        java.lang.String str;
        int hashCode;
        char c;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (view != null) {
            try {
                int[] zzg = zzg(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    iArr[0] = java.lang.Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                    iArr[1] = java.lang.Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredWidth()));
                jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredHeight()));
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[1]));
                jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]));
                jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[1]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                android.graphics.Rect rect = new android.graphics.Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = zzl(context, rect);
                } else {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                    jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[1]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (java.lang.Exception unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get native ad view bounding box");
            }
            android.view.ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (java.lang.String) parent2.getClass().getMethod("getTemplateTypeName", new java.lang.Class[0]).invoke(parent2, new java.lang.Object[0]);
                } catch (java.lang.IllegalAccessException e) {
                    e = e;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                } catch (java.lang.NoSuchMethodException unused2) {
                } catch (java.lang.SecurityException e2) {
                    e = e2;
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                } catch (java.lang.reflect.InvocationTargetException e3) {
                    e = e3;
                    int i222 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        c = 1;
                        if (c != 0) {
                            jSONObject2.put("native_template_type", 1);
                        } else if (c != 1) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjh)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", zzm(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", zzm(r0.height) - 1);
                                }
                            } catch (java.lang.Exception unused3) {
                                com.google.android.gms.ads.internal.util.zze.zza("Unable to get native ad view layout types");
                            }
                        }
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjl)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (org.json.JSONException e4) {
                                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log container view alpha signal to JSON", e4);
                            }
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjh)).booleanValue()) {
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjl)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        c = 0;
                        if (c != 0) {
                        }
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjh)).booleanValue()) {
                        }
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjl)).booleanValue()) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjh)).booleanValue()) {
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjl)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode != -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static org.json.JSONObject zzc(android.view.View view) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                boolean z = true;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjd)).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzje)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (com.google.android.gms.ads.internal.util.zzs.zzA(view) == 0) {
                            z = false;
                        }
                        jSONObject.put("contained_in_scroll_view", z);
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjf)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("scroll_view_type", com.google.android.gms.ads.internal.util.zzs.zzA(view));
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    android.view.ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof android.widget.AdapterView)) {
                        parent = parent.getParent();
                    }
                    if ((parent == null ? -1 : ((android.widget.AdapterView) parent).getPositionForView(view)) == -1) {
                        z = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONObject;
    }

    public static org.json.JSONObject zzd(android.content.Context context, android.view.View view) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("can_show_on_lock_screen", com.google.android.gms.ads.internal.util.zzs.zzo(view));
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("is_keyguard_locked", com.google.android.gms.ads.internal.util.zzs.zzG(context));
            } catch (org.json.JSONException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static org.json.JSONObject zze(android.content.Context context, java.util.Map map, java.util.Map map2, android.view.View view, android.widget.ImageView.ScaleType scaleType) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        android.view.ViewGroup.LayoutParams layoutParams;
        java.lang.String str3 = "ad_view";
        java.lang.String str4 = "relative_to";
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (map != null && view != null) {
            int[] zzg = zzg(view);
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] zzg2 = zzg(view2);
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    java.util.Iterator it2 = it;
                    try {
                        org.json.JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[0] - zzg[0]));
                            jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[1] - zzg[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            android.graphics.Rect rect = new android.graphics.Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzl(context, rect);
                            } else {
                                jSONObject2 = new org.json.JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[0] - zzg[0]));
                                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[1] - zzg[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((java.lang.String) entry.getKey()).equals("3010")) {
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjg)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjh)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject4.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjk)).booleanValue()) {
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    arrayList.add(java.lang.Integer.valueOf(view2.getId()));
                                    for (android.view.ViewParent parent = view2.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                                        arrayList.add(java.lang.Integer.valueOf(((android.view.View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", android.text.TextUtils.join(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof android.widget.TextView) {
                                android.widget.TextView textView = (android.widget.TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put(com.facebook.appevents.internal.ViewHierarchyConstants.TEXT_SIZE, textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (org.json.JSONException unused) {
                                    jSONObject = jSONObject6;
                                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjl)).booleanValue()) {
                                jSONObject4.put("alpha", view2.getAlpha());
                            }
                            jSONObject = jSONObject6;
                        } catch (org.json.JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (org.json.JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    try {
                        jSONObject.put((java.lang.String) entry.getKey(), jSONObject4);
                    } catch (org.json.JSONException unused4) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                        it = it2;
                        jSONObject3 = jSONObject;
                        str3 = str;
                        str4 = str2;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static org.json.JSONObject zzf(java.lang.String str, android.content.Context context, android.graphics.Point point, android.graphics.Point point2) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = null;
        try {
            jSONObject = new org.json.JSONObject();
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (org.json.JSONException e2) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (java.lang.Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] zzg(android.view.View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static android.graphics.Point zzh(android.view.MotionEvent motionEvent, android.view.View view) {
        int[] zzg = zzg(view);
        return new android.graphics.Point(((int) motionEvent.getRawX()) - zzg[0], ((int) motionEvent.getRawY()) - zzg[1]);
    }

    public static boolean zzi(android.content.Context context, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        if (!zzfkfVar.zzN) {
            return false;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjm)).booleanValue()) {
            return ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjp)).booleanValue();
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjn);
        if (!str.isEmpty() && context != null) {
            java.lang.String packageName = context.getPackageName();
            java.util.Iterator it = com.google.android.gms.internal.ads.zzgty.zza(com.google.android.gms.internal.ads.zzgsx.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static org.json.JSONObject zzj(@javax.annotation.Nonnull android.content.Context context) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.google.android.gms.ads.internal.zzt.zzc();
        android.util.DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv((android.view.WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzv.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzv.heightPixels));
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static android.view.WindowManager.LayoutParams zzk() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjo)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static org.json.JSONObject zzl(android.content.Context context, android.graphics.Rect rect) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzm(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
