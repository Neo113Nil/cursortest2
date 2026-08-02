package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.facebook.login.u;
import com.facebook.login.v;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class y implements ServiceConnection {
    public final Context a;
    public final x b;
    public com.facebook.login.o c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;

    public y(Context context, String applicationId, String redirectURI, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(redirectURI, "redirectURI");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = 65536;
        this.i = 65537;
        this.j = applicationId;
        this.k = redirectURI;
        this.l = 20121101;
        this.m = str;
        this.b = new x(this);
    }

    public final void a(Bundle result) {
        if (this.d) {
            this.d = false;
            com.facebook.login.o oVar = this.c;
            if (oVar != null) {
                com.facebook.login.p this$0 = oVar.a;
                u.c request = oVar.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(request, "request");
                com.facebook.login.n nVar = this$0.c;
                View view = null;
                if (nVar != null) {
                    nVar.c = null;
                }
                this$0.c = null;
                v.b bVar = this$0.n().e;
                if (bVar != null) {
                    View view2 = com.facebook.login.v.this.e;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                        view2 = null;
                    }
                    view2.setVisibility(8);
                }
                if (result != null) {
                    List stringArrayList = result.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = CollectionsKt.emptyList();
                    }
                    Set<String> set = request.b;
                    if (set == null) {
                        set = SetsKt.emptySet();
                    }
                    String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        this$0.n().t();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        Intrinsics.checkNotNullParameter(request, "request");
                        Intrinsics.checkNotNullParameter(result, "result");
                        String string2 = result.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            this$0.v(result, request);
                            return;
                        }
                        v.b bVar2 = this$0.n().e;
                        if (bVar2 != null) {
                            View view3 = com.facebook.login.v.this.e;
                            if (view3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                            } else {
                                view = view3;
                            }
                            view.setVisibility(0);
                        }
                        String string3 = result.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        Intrinsics.checkNotNullExpressionValue(string3, "checkNotNull(result.getS…ocol.EXTRA_ACCESS_TOKEN))");
                        E.o(new com.facebook.login.q(result, this$0, request), string3);
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this$0.h("new_permissions", TextUtils.join(",", hashSet));
                    }
                    Intrinsics.checkNotNullParameter(hashSet, "<set-?>");
                    request.b = hashSet;
                }
                this$0.n().t();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.e = new Messenger(service);
        Bundle data = new Bundle();
        data.putString("com.facebook.platform.extra.APPLICATION_ID", this.j);
        String str = this.m;
        if (str != null) {
            data.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.k;
        if (str2 != null) {
            data.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Intrinsics.checkNotNullParameter(data, "data");
        Message obtain = Message.obtain((Handler) null, this.f);
        obtain.arg1 = this.l;
        obtain.setData(data);
        obtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
