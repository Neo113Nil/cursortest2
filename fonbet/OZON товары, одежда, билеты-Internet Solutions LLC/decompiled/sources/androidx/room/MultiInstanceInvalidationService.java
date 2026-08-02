package androidx.room;

import J4.m;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import androidx.room.b;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private int f45030a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f45031b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f45032c = new b();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f45033d = new a();

    public static final class a extends b.a {
        a() {
            attachInterface(this, androidx.room.b.f45037b);
        }
    }

    public static final class b extends RemoteCallbackList<m> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(m mVar, Object cookie) {
            m callback = mVar;
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.getF45031b().remove((Integer) cookie);
        }
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final b getF45032c() {
        return this.f45032c;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final LinkedHashMap getF45031b() {
        return this.f45031b;
    }

    /* renamed from: c, reason: from getter */
    public final int getF45030a() {
        return this.f45030a;
    }

    public final void d(int i11) {
        this.f45030a = i11;
    }

    @Override // android.app.Service
    @NotNull
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f45033d;
    }
}
