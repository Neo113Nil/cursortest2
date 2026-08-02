package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BC\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/views/SearchContactListenerSuite;", "", "Lkotlin/Function1;", "", "", "onSearchTextChanged", "Lkotlin/Function0;", "onClear", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/jvm/functions/Function1;", "getOnSearchTextChanged", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "getOnClear", "()Lkotlin/jvm/functions/Function0;", "getOnClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchContactListenerSuite {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClear;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onSearchTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public SearchContactListenerSuite(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        this.onSearchTextChanged = function1;
        this.onClear = function0;
        this.onClick = function02;
    }

    public /* synthetic */ SearchContactListenerSuite(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : function02);
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnSearchTextChanged() {
        return this.onSearchTextChanged;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClear() {
        return this.onClear;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public SearchContactListenerSuite() {
        this(null, null, null, 7, null);
    }
}
