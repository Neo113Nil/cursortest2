package financial.atomic.c;

/* loaded from: classes17.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final financial.atomic.transact.Transact f6739a;

    public a(financial.atomic.transact.Transact transact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transact, "");
        this.f6739a = transact;
    }

    public final financial.atomic.transact.Transact getTransact() {
        return this.f6739a;
    }

    public final java.lang.Object handoff$transact_release(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.Objects.toString(jSONObject);
        java.lang.String string = jSONObject.getString("type");
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, financial.atomic.transact.Transact.Event.STORAGE_GET.getValue())) {
            java.lang.Object storageGet = financial.atomic.c.c.storageGet(this.f6739a, jSONObject, continuation);
            return storageGet == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? storageGet : kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, financial.atomic.transact.Transact.Event.STORAGE_PUT.getValue())) {
            java.lang.Object storagePut = financial.atomic.c.c.storagePut(this.f6739a, jSONObject, continuation);
            return storagePut == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? storagePut : kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, financial.atomic.transact.Transact.Event.SHOW_VIEW.getValue())) {
            java.lang.Object show$default = financial.atomic.transact.Transact.show$default(this.f6739a, false, continuation, 1, null);
            return show$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? show$default : kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(string, financial.atomic.transact.Transact.Event.HIDE_VIEW.getValue())) {
            java.lang.Object hide$default = financial.atomic.transact.Transact.hide$default(this.f6739a, false, continuation, 1, null);
            return hide$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? hide$default : kotlin.Unit.INSTANCE;
        }
        financial.atomic.transact.Transact.Event event = financial.atomic.transact.Transact.Event.CLEANUP_APPLICATION;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(string, event.getValue())) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object emit = this.f6739a.emit((java.lang.Enum) event, (financial.atomic.transact.Transact.Event) jSONObject, (kotlin.coroutines.Continuation<? super financial.atomic.transact.Emitter.Event<financial.atomic.transact.Transact.Event>>) continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object init$transact_release(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
