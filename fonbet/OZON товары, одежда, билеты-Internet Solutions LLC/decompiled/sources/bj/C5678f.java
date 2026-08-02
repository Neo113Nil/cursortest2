package bj;

import F4.AbstractC3028h;
import Hi.h;
import Hi.j;
import Qi.InterfaceC3877a;
import Si.InterfaceC4010a;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bj.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5678f extends AbstractC3028h.b<Integer, InterfaceC4010a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Oi.b f56076a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Mi.a f56077b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3877a f56078c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final j f56079d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f56080e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56081f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<String> f56082g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final h f56083h;

    public C5678f(@NotNull Oi.b ozMediaFileManager, @NotNull Mi.a dispatcherProvider, @NotNull InterfaceC3877a logger, @NotNull j album, boolean z11, boolean z12, @NotNull Set<String> grantedPermissions, @NotNull h mediaFilter) {
        Intrinsics.checkNotNullParameter(ozMediaFileManager, "ozMediaFileManager");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(album, "album");
        Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
        Intrinsics.checkNotNullParameter(mediaFilter, "mediaFilter");
        this.f56076a = ozMediaFileManager;
        this.f56077b = dispatcherProvider;
        this.f56078c = logger;
        this.f56079d = album;
        this.f56080e = z11;
        this.f56081f = z12;
        this.f56082g = grantedPermissions;
        this.f56083h = mediaFilter;
    }

    @NotNull
    public final C5677e a() {
        return new C5677e(this.f56076a, this.f56077b.a(), this.f56078c, this.f56079d, this.f56080e, this.f56081f, this.f56082g, this.f56083h);
    }
}
