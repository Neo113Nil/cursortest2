package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import h5.C6801B;
import i5.C7009b;
import i5.InterfaceC7008a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private UUID f45245a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private e f45246b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private HashSet f45247c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private a f45248d;

    /* renamed from: e, reason: collision with root package name */
    private int f45249e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private ExecutorService f45250f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private C7009b f45251g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private z f45252h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private C6801B f45253i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private h5.z f45254j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public List<String> f45255a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public List<Uri> f45256b;

        /* renamed from: c, reason: collision with root package name */
        public Network f45257c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f45255a = list;
            this.f45256b = list;
        }
    }

    public WorkerParameters(@NonNull UUID uuid, @NonNull e eVar, @NonNull Collection collection, @NonNull a aVar, int i11, @NonNull ExecutorService executorService, @NonNull C7009b c7009b, @NonNull z zVar, @NonNull C6801B c6801b, @NonNull h5.z zVar2) {
        this.f45245a = uuid;
        this.f45246b = eVar;
        this.f45247c = new HashSet(collection);
        this.f45248d = aVar;
        this.f45249e = i11;
        this.f45250f = executorService;
        this.f45251g = c7009b;
        this.f45252h = zVar;
        this.f45253i = c6801b;
        this.f45254j = zVar2;
    }

    @NonNull
    public final Executor a() {
        return this.f45250f;
    }

    @NonNull
    public final i b() {
        return this.f45254j;
    }

    @NonNull
    public final UUID c() {
        return this.f45245a;
    }

    @NonNull
    public final e d() {
        return this.f45246b;
    }

    public final Network e() {
        return this.f45248d.f45257c;
    }

    @NonNull
    public final u f() {
        return this.f45253i;
    }

    public final int g() {
        return this.f45249e;
    }

    @NonNull
    public final HashSet h() {
        return this.f45247c;
    }

    @NonNull
    public final InterfaceC7008a i() {
        return this.f45251g;
    }

    @NonNull
    public final List<String> j() {
        return this.f45248d.f45255a;
    }

    @NonNull
    public final List<Uri> k() {
        return this.f45248d.f45256b;
    }

    @NonNull
    public final z l() {
        return this.f45252h;
    }
}
