package Gj0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Intent f10280a;

    public a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f10280a = intent;
    }

    public final Boolean a(@NotNull String argName) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        Bundle extras = this.f10280a.getExtras();
        if (extras == null || !extras.containsKey(argName)) {
            return null;
        }
        return Boolean.valueOf(extras.getBoolean(argName));
    }

    public final Integer b(@NotNull String argName) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        Bundle extras = this.f10280a.getExtras();
        if (extras == null || !extras.containsKey(argName)) {
            return null;
        }
        return Integer.valueOf(extras.getInt(argName));
    }

    public final String c() {
        String lastPathSegment;
        Uri data = this.f10280a.getData();
        if (data == null || (lastPathSegment = data.getLastPathSegment()) == null || h.K(lastPathSegment)) {
            return null;
        }
        return lastPathSegment;
    }

    public final String d(@NotNull String paramName) {
        String queryParameter;
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Uri data = this.f10280a.getData();
        if (data == null || (queryParameter = data.getQueryParameter(paramName)) == null || h.K(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    public final boolean e() {
        Intent intent = this.f10280a;
        Uri data = intent.getData();
        Set<String> queryParameterNames = data != null ? data.getQueryParameterNames() : null;
        return ((queryParameterNames == null || queryParameterNames.isEmpty()) && intent.getExtras() == null) ? false : true;
    }
}
