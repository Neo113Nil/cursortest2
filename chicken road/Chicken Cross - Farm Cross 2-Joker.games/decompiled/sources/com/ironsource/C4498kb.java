package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4498kb {
    public static final a d = new a(null);
    private static C4498kb e;

    /* renamed from: a, reason: collision with root package name */
    private final C4659tb f8288a;
    private final com.ironsource.mediationsdk.c b;
    private final Mb c;

    /* renamed from: com.ironsource.kb$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4498kb a() {
            return C4498kb.e;
        }

        private a() {
        }

        public final void a(C4498kb testInstance) {
            Intrinsics.checkNotNullParameter(testInstance, "testInstance");
            C4498kb.e = testInstance;
        }
    }

    static {
        C4659tb c4659tb = new C4659tb();
        com.ironsource.mediationsdk.c d2 = com.ironsource.mediationsdk.c.d();
        Intrinsics.checkNotNullExpressionValue(d2, "getInstance()");
        e = new C4498kb(c4659tb, d2, new Mb(null, null, null, null, null, 31, null));
    }

    public C4498kb(C4659tb tools, com.ironsource.mediationsdk.c adapterRepository, Mb metaDataManager) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adapterRepository, "adapterRepository");
        Intrinsics.checkNotNullParameter(metaDataManager, "metaDataManager");
        this.f8288a = tools;
        this.b = adapterRepository;
        this.c = metaDataManager;
    }

    public final void b(final boolean z) {
        this.f8288a.a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4498kb.b(C4498kb.this, z);
            }
        });
    }

    public final void c(final boolean z) {
        this.f8288a.a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4498kb.c(C4498kb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4498kb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f8288a.b(z);
        if (!this$0.f8288a.a()) {
            this$0.c.b(z);
        } else {
            this$0.f8288a.b();
            IronLog.API.error("LevelPlayPrivacySettings.setCOPPA() must be called before LevelPlay.init()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4498kb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f8288a.c(z);
        this$0.b.d(z);
    }

    public final void a(final Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        this.f8288a.a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4498kb.a(C4498kb.this, networkConsents);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4498kb this$0, Map networkConsents) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(networkConsents, "$networkConsents");
        this$0.f8288a.a((Map<String, Boolean>) networkConsents);
        this$0.b.a((Map<String, Boolean>) networkConsents);
    }

    public final void a(final boolean z) {
        this.f8288a.a(new Runnable() { // from class: com.ironsource.kb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C4498kb.a(C4498kb.this, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4498kb this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f8288a.a(z);
        this$0.c.a(z);
    }
}
