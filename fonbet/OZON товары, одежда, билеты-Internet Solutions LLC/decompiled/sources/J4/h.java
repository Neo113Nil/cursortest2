package J4;

import J4.s;
import O4.c;
import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f13876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13877b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final c.InterfaceC0397c f13878c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final s.e f13879d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13880e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13881f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final s.d f13882g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final Executor f13883h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final Executor f13884i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13885j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13886k;

    /* renamed from: l, reason: collision with root package name */
    private final LinkedHashSet f13887l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList f13888m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public final ArrayList f13889n;

    @SuppressLint({"LambdaLast"})
    public h(@NotNull Context context, String str, @NotNull c.InterfaceC0397c sqliteOpenHelperFactory, @NotNull s.e migrationContainer, ArrayList arrayList, boolean z11, @NotNull s.d journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z12, boolean z13, LinkedHashSet linkedHashSet, @NotNull ArrayList typeConverters, @NotNull ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f13876a = context;
        this.f13877b = str;
        this.f13878c = sqliteOpenHelperFactory;
        this.f13879d = migrationContainer;
        this.f13880e = arrayList;
        this.f13881f = z11;
        this.f13882g = journalMode;
        this.f13883h = queryExecutor;
        this.f13884i = transactionExecutor;
        this.f13885j = z12;
        this.f13886k = z13;
        this.f13887l = linkedHashSet;
        this.f13888m = typeConverters;
        this.f13889n = autoMigrationSpecs;
    }

    public final boolean a(int i11, int i12) {
        if ((i11 > i12 && this.f13886k) || !this.f13885j) {
            return false;
        }
        LinkedHashSet linkedHashSet = this.f13887l;
        return linkedHashSet == null || !linkedHashSet.contains(Integer.valueOf(i11));
    }
}
