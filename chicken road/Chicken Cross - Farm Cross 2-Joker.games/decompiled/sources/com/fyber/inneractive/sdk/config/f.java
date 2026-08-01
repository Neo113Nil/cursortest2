package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tiktok.util.UrlConst;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.io.files.FileSystemKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5246a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        String str = IAConfigManager.R.c;
        StringBuilder sb = new StringBuilder(UrlConst.HTTPS);
        int i = n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(property);
        }
        String sb2 = sb.append(str).append(FileSystemKt.UnixPathSeparator).append(str).append(".json").toString();
        IAlog.d("%s: %s", "APP_CONFIG_REQUEST", sb2);
        return sb2;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.o.f5960a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.R.c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        m0 m0Var = (m0) obj;
        if (m0Var == null || m0Var.f5270a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f5960a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", m0Var.f5270a).apply();
    }

    public final void a(String str, Throwable th) {
        String str2;
        String str3;
        String str4;
        if (this.f5246a) {
            return;
        }
        this.f5246a = true;
        if (TextUtils.isEmpty(str)) {
            str2 = "Empty Json Data";
        } else {
            str2 = str.length() > 501 ? str.substring(0, 500) : str.substring(0, str.length() - 1);
        }
        String str5 = str2;
        if (th != null) {
            str3 = th.getClass().getName();
            str4 = th.getLocalizedMessage();
        } else {
            str3 = "Bad remote configuration";
            str4 = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        String str6 = str3;
        String str7 = IAConfigManager.R.c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (str4 == null) {
            str4 = "No message";
        }
        String str8 = str4;
        if (TextUtils.isEmpty(str7)) {
            str7 = "EMPTY_APP_ID";
        }
        wVar.a("exception", str6, "message", str8, "data", str5, RemoteConfigConstants.RequestFieldKey.APP_ID, str7).a((String) null);
    }

    public static m0 a(com.fyber.inneractive.sdk.config.remote.e eVar) {
        boolean z;
        m0 m0Var;
        Iterator it;
        HashMap hashMap;
        Iterator it2;
        ArrayList arrayList;
        UnitDisplayType unitDisplayType;
        boolean z2;
        Integer num;
        Boolean bool;
        UnitDisplayType unitDisplayType2;
        String b;
        com.fyber.inneractive.sdk.config.remote.e eVar2 = eVar;
        m0 m0Var2 = new m0();
        m0Var2.c = eVar2.c;
        com.fyber.inneractive.sdk.config.remote.a aVar = eVar2.f5281a;
        m0Var2.b = aVar.b;
        m0Var2.f5270a = aVar.f5279a;
        Iterator it3 = eVar2.b.iterator();
        while (it3.hasNext()) {
            com.fyber.inneractive.sdk.config.remote.h hVar = (com.fyber.inneractive.sdk.config.remote.h) it3.next();
            HashMap hashMap2 = m0Var2.d;
            String str = hVar.f5283a;
            com.fyber.inneractive.sdk.config.remote.a aVar2 = eVar2.f5281a;
            HashMap hashMap3 = m0Var2.e;
            o0 o0Var = m0Var2.f;
            v0 v0Var = new v0();
            int i = 2;
            com.fyber.inneractive.sdk.config.remote.c[] cVarArr = {aVar2, hVar};
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                com.fyber.inneractive.sdk.config.remote.c cVar = cVarArr[i2];
                if (cVar != null && (b = cVar.b()) != null && b.equals("false")) {
                    z = false;
                    break;
                }
                i2++;
                i = 2;
            }
            v0Var.b = z;
            Iterator it4 = hVar.g.iterator();
            while (it4.hasNext()) {
                com.fyber.inneractive.sdk.config.remote.i iVar = (com.fyber.inneractive.sdk.config.remote.i) it4.next();
                w0 w0Var = new w0();
                String str2 = iVar.f5284a;
                if (str2 != null) {
                    String str3 = iVar.b;
                    if (str3 != null) {
                        w0Var.f5293a = str2;
                        w0Var.b = str3;
                        com.fyber.inneractive.sdk.config.remote.b bVar = iVar.c;
                        if (bVar != null) {
                            com.fyber.inneractive.sdk.config.remote.b bVar2 = hVar.c;
                            com.fyber.inneractive.sdk.config.remote.b bVar3 = aVar2.e;
                            q0 q0Var = new q0();
                            it = it3;
                            UnitDisplayType unitDisplayType3 = bVar.f5280a;
                            it2 = it4;
                            if (unitDisplayType3 == UnitDisplayType.BANNER || unitDisplayType3 == UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                q0Var.b = bVar.f5280a;
                                Integer num2 = bVar.c;
                                Integer num3 = bVar2 != null ? bVar2.c : null;
                                if (bVar3 != null) {
                                    m0Var = m0Var2;
                                    num = bVar3.c;
                                } else {
                                    m0Var = m0Var2;
                                    num = null;
                                }
                                Integer num4 = (Integer) a((Object) null, num2, num3, num);
                                if (num4 != null && num4.intValue() >= 5 && num4.intValue() <= 60) {
                                    q0Var.f5276a = num4;
                                }
                                Boolean bool2 = Boolean.TRUE;
                                Boolean bool3 = bVar.b;
                                Boolean bool4 = bVar2 != null ? bVar2.b : null;
                                if (bVar3 != null) {
                                    hashMap = hashMap2;
                                    bool = bVar3.b;
                                } else {
                                    hashMap = hashMap2;
                                    bool = null;
                                }
                                Boolean bool5 = (Boolean) a(bool2, bool3, bool4, bool);
                                bool5.getClass();
                                q0Var.c = bool5;
                                Integer num5 = (Integer) a((Object) null, bVar.d, bVar2 != null ? bVar2.d : null, bVar3 != null ? bVar3.d : null);
                                if (num5 != null && num5.intValue() >= 5 && num5.intValue() <= 60) {
                                    q0Var.d = num5;
                                }
                                if (q0Var.d == null && !q0Var.c.booleanValue() && ((unitDisplayType2 = bVar.f5280a) == UnitDisplayType.INTERSTITIAL || unitDisplayType2 == UnitDisplayType.REWARDED)) {
                                    q0Var.c = bool2;
                                }
                                w0Var.c = q0Var;
                            } else {
                                it3 = it;
                                it4 = it2;
                            }
                        } else {
                            m0Var = m0Var2;
                            it = it3;
                            hashMap = hashMap2;
                            it2 = it4;
                        }
                        com.fyber.inneractive.sdk.config.remote.j jVar = iVar.f;
                        if (jVar != null || iVar.e != null) {
                            if (jVar != null) {
                                UnitDisplayType unitDisplayType4 = jVar.j;
                                UnitDisplayType unitDisplayType5 = UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && iVar.c == null) {
                                    q0 q0Var2 = new q0();
                                    w0Var.c = q0Var2;
                                    q0Var2.c = Boolean.FALSE;
                                    q0Var2.d = -1;
                                    q0 q0Var3 = w0Var.c;
                                    q0Var3.b = unitDisplayType5;
                                    q0Var3.f5276a = -1;
                                }
                            }
                            y0 y0Var = new y0();
                            com.fyber.inneractive.sdk.config.remote.j jVar2 = iVar.f;
                            com.fyber.inneractive.sdk.config.remote.j jVar3 = hVar.e;
                            com.fyber.inneractive.sdk.config.remote.j jVar4 = aVar2.d;
                            if (jVar2 != null && ((unitDisplayType = jVar2.j) == UnitDisplayType.LANDSCAPE || unitDisplayType == UnitDisplayType.SQUARE || unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.VERTICAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.MRECT)) {
                                y0Var.j = unitDisplayType;
                            } else {
                                if (iVar.e != null) {
                                    y0Var.j = UnitDisplayType.NATIVE;
                                    w0Var.e = new u0();
                                }
                                it3 = it;
                                it4 = it2;
                                m0Var2 = m0Var;
                                hashMap2 = hashMap;
                            }
                            Object a2 = a((Object) null, jVar2 != null ? jVar2.f5285a : null, jVar3 != null ? jVar3.f5285a : null, jVar4 != null ? jVar4.f5285a : null);
                            if (a2 != null) {
                                y0Var.f5296a = (Boolean) a2;
                                y0Var.b = (Integer) a((Object) 5000, jVar2 != null ? jVar2.b : null, jVar3 != null ? jVar3.b : null, jVar4 != null ? jVar4.b : null);
                                Integer num6 = (Integer) a((Object) 0, jVar2 != null ? jVar2.c : null, jVar3 != null ? jVar3.c : null, jVar4 != null ? jVar4.c : null);
                                y0Var.c = Integer.valueOf(num6.intValue() < 0 ? 0 : num6.intValue());
                                y0Var.d = (Boolean) a(Boolean.TRUE, jVar2 != null ? jVar2.e : null, jVar3 != null ? jVar3.e : null, jVar4 != null ? jVar4.e : null);
                                y0Var.e = (Orientation) a(Orientation.USER, jVar2 != null ? jVar2.g : null, jVar3 != null ? jVar3.g : null, jVar4 != null ? jVar4.g : null);
                                Integer num7 = (Integer) a((Object) 0, jVar2 != null ? jVar2.i : null, jVar3 != null ? jVar3.i : null, jVar4 != null ? jVar4.i : null);
                                y0Var.f = Integer.valueOf(num7.intValue() < 0 ? 0 : num7.intValue());
                                Integer num8 = (Integer) a((Object) 2048, jVar2 != null ? jVar2.h : null, jVar3 != null ? jVar3.h : null, jVar4 != null ? jVar4.h : null);
                                if (num8.intValue() > y0Var.b.intValue()) {
                                    num8 = y0Var.b;
                                }
                                y0Var.g = num8;
                                y0Var.h = (Skip) a(Skip._0, jVar2 != null ? jVar2.d : null, jVar3 != null ? jVar3.d : null, jVar4 != null ? jVar4.d : null);
                                y0Var.i = (TapAction) a(TapAction.DO_NOTHING, jVar2 != null ? jVar2.f : null, jVar3 != null ? jVar3.f : null, jVar4 != null ? jVar4.f : null);
                                ArrayList arrayList2 = new ArrayList();
                                com.fyber.inneractive.sdk.config.remote.j a3 = new com.fyber.inneractive.sdk.config.remote.d[]{iVar}[0].a();
                                if (a3 != null && (arrayList = a3.k) != null && arrayList.size() > 0) {
                                    arrayList2 = a3.k;
                                }
                                y0Var.k = arrayList2;
                                w0Var.f = y0Var;
                            }
                            it3 = it;
                            it4 = it2;
                            m0Var2 = m0Var;
                            hashMap2 = hashMap;
                        }
                        t0 t0Var = new t0();
                        HashSet hashSet = new HashSet();
                        com.fyber.inneractive.sdk.config.remote.f fVar = iVar.d;
                        Set set = fVar != null ? fVar.f5282a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar2 = hVar.d;
                        Set set2 = fVar2 != null ? fVar2.f5282a : null;
                        com.fyber.inneractive.sdk.config.remote.f fVar3 = aVar2.c;
                        t0Var.f5289a = (Set) a(hashSet, set, set2, fVar3 != null ? fVar3.f5282a : null);
                        w0Var.d = t0Var;
                        z0 z0Var = new z0();
                        com.fyber.inneractive.sdk.config.remote.k kVar = iVar.g;
                        com.fyber.inneractive.sdk.config.remote.k kVar2 = hVar.f;
                        com.fyber.inneractive.sdk.config.remote.k kVar3 = aVar2.f;
                        Integer num9 = (Integer) a((Object) 1, kVar != null ? kVar.f5286a : null, kVar2 != null ? kVar2.f5286a : null, kVar3 != null ? kVar3.f5286a : null);
                        if (num9.intValue() <= 0 && num9.intValue() > 100) {
                            z0Var.f5298a = 1;
                        } else {
                            z0Var.f5298a = num9;
                        }
                        Integer num10 = (Integer) a((Object) 0, kVar != null ? kVar.b : null, kVar2 != null ? kVar2.b : null, kVar3 != null ? kVar3.b : null);
                        if (num10.intValue() < 0 && num10.intValue() > 100) {
                            z2 = false;
                            z0Var.b = 0;
                        } else {
                            z2 = false;
                            z0Var.b = num10;
                        }
                        Set<Vendor> set3 = (Set) a(new HashSet(), kVar != null ? kVar.c : null, kVar2 != null ? kVar2.c : null, kVar3 != null ? kVar3.c : null);
                        z0Var.c = set3;
                        w0Var.g = z0Var;
                        if (o0Var != null && set3 != null) {
                            for (Vendor vendor : set3) {
                                if (vendor != null && !o0Var.f5273a.contains(vendor)) {
                                    o0Var.f5273a.add(vendor);
                                }
                            }
                        }
                        v0Var.f5291a.add(w0Var);
                        hashMap3.put(w0Var.f5293a, w0Var);
                        it3 = it;
                        it4 = it2;
                        m0Var2 = m0Var;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap2.put(str, v0Var);
            eVar2 = eVar;
        }
        return m0Var2;
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.R;
            h hVar = iAConfigManager.E;
            if (hVar != null) {
                hVar.j();
            }
            com.fyber.inneractive.sdk.config.remote.e a2 = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.c;
            if (a2 != null && str2.equals(a2.f5281a.f5279a)) {
                return a(a2);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (a2 != null && !str2.equals(a2.f5281a.f5279a)) {
                throw new InvalidAppIdException();
            }
            a(str, (Throwable) null);
            return null;
        } catch (Throwable th) {
            a(str, th);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }
}
