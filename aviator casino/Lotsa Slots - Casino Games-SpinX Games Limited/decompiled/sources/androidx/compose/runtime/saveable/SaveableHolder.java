package androidx.compose.runtime.saveable;

/* compiled from: RememberSaveable.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BE\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0002JK\u0010\u001e\u001a\u00020\u001a2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r¢\u0006\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", "T", "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "saver", "Landroidx/compose/runtime/saveable/Saver;", "", "registry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", com.ironsource.X3.i.W, "", "value", "inputs", "", "(Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaveableStateRegistry;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", "entry", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "[Ljava/lang/Object;", "Ljava/lang/Object;", "valueProvider", "Lkotlin/Function0;", "canBeSaved", "", "getValueIfInputsDidntChange", "([Ljava/lang/Object;)Ljava/lang/Object;", "onAbandoned", "", "onForgotten", "onRemembered", "register", "update", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaveableHolder<T> implements androidx.compose.runtime.saveable.SaverScope, androidx.compose.runtime.RememberObserver {
    private androidx.compose.runtime.saveable.SaveableStateRegistry.Entry entry;
    private java.lang.Object[] inputs;
    private java.lang.String key;
    private androidx.compose.runtime.saveable.SaveableStateRegistry registry;
    private androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver;
    private T value;
    private final kotlin.jvm.functions.Function0<java.lang.Object> valueProvider = new kotlin.jvm.functions.Function0<java.lang.Object>(this) { // from class: androidx.compose.runtime.saveable.SaveableHolder$valueProvider$1
        final /* synthetic */ androidx.compose.runtime.saveable.SaveableHolder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.runtime.saveable.Saver saver;
            java.lang.Object obj;
            saver = ((androidx.compose.runtime.saveable.SaveableHolder) this.this$0).saver;
            androidx.compose.runtime.saveable.SaveableHolder<T> saveableHolder = this.this$0;
            androidx.compose.runtime.saveable.SaveableHolder<T> saveableHolder2 = saveableHolder;
            obj = ((androidx.compose.runtime.saveable.SaveableHolder) saveableHolder).value;
            if (obj != null) {
                return saver.save(saveableHolder2, obj);
            }
            throw new java.lang.IllegalArgumentException("Value should be initialized".toString());
        }
    };

    public SaveableHolder(androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver, androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry, java.lang.String str, T t, java.lang.Object[] objArr) {
        this.saver = saver;
        this.registry = saveableStateRegistry;
        this.key = str;
        this.value = t;
        this.inputs = objArr;
    }

    public final void update(androidx.compose.runtime.saveable.Saver<T, java.lang.Object> saver, androidx.compose.runtime.saveable.SaveableStateRegistry registry, java.lang.String key, T value, java.lang.Object[] inputs) {
        boolean z;
        boolean z2 = true;
        if (this.registry != registry) {
            this.registry = registry;
            z = true;
        } else {
            z = false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.key, key)) {
            z2 = z;
        } else {
            this.key = key;
        }
        this.saver = saver;
        this.value = value;
        this.inputs = inputs;
        androidx.compose.runtime.saveable.SaveableStateRegistry.Entry entry = this.entry;
        if (entry == null || !z2) {
            return;
        }
        if (entry != null) {
            entry.unregister();
        }
        this.entry = null;
        register();
    }

    private final void register() {
        androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = this.registry;
        if (this.entry != null) {
            throw new java.lang.IllegalArgumentException(("entry(" + this.entry + ") is not null").toString());
        }
        if (saveableStateRegistry != null) {
            androidx.compose.runtime.saveable.RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, this.valueProvider.invoke());
            this.entry = saveableStateRegistry.registerProvider(this.key, this.valueProvider);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public boolean canBeSaved(java.lang.Object value) {
        androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = this.registry;
        return saveableStateRegistry == null || saveableStateRegistry.canBeSaved(value);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        register();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        androidx.compose.runtime.saveable.SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        androidx.compose.runtime.saveable.SaveableStateRegistry.Entry entry = this.entry;
        if (entry != null) {
            entry.unregister();
        }
    }

    public final T getValueIfInputsDidntChange(java.lang.Object[] inputs) {
        if (java.util.Arrays.equals(inputs, this.inputs)) {
            return this.value;
        }
        return null;
    }
}
