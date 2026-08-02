package Kl0;

import android.content.ComponentName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends AbstractC7737t implements Function1<String, ComponentName> {

    /* renamed from: b, reason: collision with root package name */
    public static final k f16021b = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final ComponentName invoke(String str) {
        String packageName = str;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new ComponentName(packageName, "com.vk.push.authsdk.ipc.AuthService");
    }
}
