package Bl0;

import android.content.SharedPreferences;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Bl0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2641b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3960c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final d0 f3961a;

    /* renamed from: b, reason: collision with root package name */
    public final C2645f f3962b;

    public C2641b(d0 sharedPreferenceProvider, C2645f uuidFactory) {
        Intrinsics.checkNotNullParameter(sharedPreferenceProvider, "sharedPreferenceProvider");
        Intrinsics.checkNotNullParameter(uuidFactory, "uuidFactory");
        this.f3961a = sharedPreferenceProvider;
        this.f3962b = uuidFactory;
    }

    public final String a() {
        this.f3962b.getClass();
        String value = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(value, "randomUUID().toString()");
        SharedPreferences sharedPreferences = this.f3961a.f3969a;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("USER_ID_KEY", value);
        edit.apply();
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
