package com.startapp.sdk.internal;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.TopicsClientMetadata;
import com.startapp.sdk.common.utils.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3596a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f3597b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f3598c;

    /* renamed from: d, reason: collision with root package name */
    public final p5 f3599d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f3600e = new AtomicReference();

    public di(Context context, ib ibVar, ib ibVar2, p5 p5Var) {
        this.f3596a = context;
        this.f3597b = ibVar;
        this.f3598c = ibVar2;
        this.f3599d = p5Var;
    }

    public final void a() {
        int extensionVersion;
        int extensionVersion2;
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        if (Build.VERSION.SDK_INT >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion >= 4) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                if (extensionVersion2 >= 5) {
                    try {
                        this.f3599d.getClass();
                        TopicsClientMetadata b02 = MetaData.E().b0();
                        if (b02 == null || !si.a(b02.a())) {
                            return;
                        }
                        TopicsManager k3 = G1.b.k(this.f3596a.getSystemService(G1.b.m()));
                        G1.b.o();
                        adsSdkName = G1.b.e().setAdsSdkName(this.f3596a.getPackageName());
                        shouldRecordObservation = adsSdkName.setShouldRecordObservation(true);
                        build = shouldRecordObservation.build();
                        k3.getTopics(build, (Executor) this.f3598c.a(), new ci(this));
                    } catch (Throwable th) {
                        if (a(2)) {
                            d9.a(th);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        k8 k8Var = (k8) this.f3597b.a();
        k8Var.f3952a.post(new G0.m(12, this));
    }

    public final boolean a(int i3) {
        this.f3599d.getClass();
        TopicsClientMetadata b02 = MetaData.E().b0();
        ComponentInfoEventConfig b3 = b02 != null ? b02.b() : null;
        return b3 != null && b3.a((long) i3);
    }

    public static String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(str);
            sb.append('M');
            sb.append(((Pair) entry.getKey()).first);
            sb.append('T');
            sb.append(((Pair) entry.getKey()).second);
            String str2 = StringUtils.PROCESS_POSTFIX_DELIMITER;
            for (Integer num : (Set) entry.getValue()) {
                sb.append(str2);
                sb.append(num);
                str2 = StringUtils.COMMA;
            }
            str = ";";
        }
        return sb.length() > 0 ? sb.toString() : "NONE";
    }
}
