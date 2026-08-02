package am0;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: am0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5033a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36840a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4008j f36841b;

    /* renamed from: am0.a$a, reason: collision with other inner class name */
    public static final class C0710a {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f36842a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f36843b;

        /* renamed from: c, reason: collision with root package name */
        public final String f36844c;

        public C0710a(Integer num, Integer num2, String str) {
            this.f36842a = num;
            this.f36843b = num2;
            this.f36844c = str;
        }
    }

    /* renamed from: am0.a$b */
    public static final class b extends AbstractC7737t implements Function0<C0710a> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C0710a invoke() {
            C5033a c5033a = C5033a.this;
            ApplicationInfo applicationInfo = c5033a.f36840a.getPackageManager().getApplicationInfo(c5033a.f36840a.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(co…ageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            return new C0710a((bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_icon")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_icon")) : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_color")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_color")) : null, bundle != null ? bundle.getString("ru.rustore.sdk.pushclient.default_notification_channel_id") : null);
        }
    }

    public C5033a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36840a = context;
        this.f36841b = k.b(new b());
    }
}
