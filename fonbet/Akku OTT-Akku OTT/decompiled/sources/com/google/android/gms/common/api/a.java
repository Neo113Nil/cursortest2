package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.InterfaceC0832f;
import com.google.android.gms.common.api.internal.InterfaceC0841o;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.InterfaceC0869k;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a<O extends d> {
    public final AbstractC0110a a;
    public final g b;
    public final String c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0110a<T extends f, O> extends e<T, O> {
        @NonNull
        @Deprecated
        public T buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull C0863e c0863e, @NonNull O o, @NonNull h.a aVar, @NonNull h.b bVar) {
            return buildClient(context, looper, c0863e, (C0863e) o, (InterfaceC0832f) aVar, (InterfaceC0841o) bVar);
        }

        @NonNull
        public T buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull C0863e c0863e, @NonNull O o, @NonNull InterfaceC0832f interfaceC0832f, @NonNull InterfaceC0841o interfaceC0841o) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        @NonNull
        public static final c g = new c();

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0111a extends d {
            @NonNull
            Account getAccount();
        }

        public interface b extends d {
            @Nullable
            GoogleSignInAccount h();
        }

        public static final class c implements d {
        }
    }

    @VisibleForTesting
    public static abstract class e<T extends b, O> {
        public static final int API_PRIORITY_GAMES = 1;
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;
        public static final int API_PRIORITY_PLUS = 2;

        @NonNull
        public List<Scope> getImpliedScopes(@Nullable O o) {
            return Collections.EMPTY_LIST;
        }

        public int getPriority() {
            return Integer.MAX_VALUE;
        }
    }

    public interface f extends b {
        void connect(@NonNull AbstractC0861c.InterfaceC0112c interfaceC0112c);

        void disconnect();

        void disconnect(@NonNull String str);

        @NonNull
        C0854d[] getAvailableFeatures();

        @NonNull
        String getEndpointPackageName();

        @Nullable
        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(@Nullable InterfaceC0869k interfaceC0869k, @Nullable Set<Scope> set);

        @NonNull
        Set<Scope> getScopesForConnectionlessNonSignIn();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(@NonNull AbstractC0861c.e eVar);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(@NonNull String str, @NonNull AbstractC0110a<C, O> abstractC0110a, @NonNull g<C> gVar) {
        this.c = str;
        this.a = abstractC0110a;
        this.b = gVar;
    }
}
