package androidx.compose.foundation.text.contextmenu.builder;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "", "<init>", "()V", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "build$foundation", "()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "", "addFilter$foundation", "(Lkotlin/jvm/functions/Function1;)V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "addComponent$foundation", "(Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;)V", "separator", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableObjectList;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuBuilderScope {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectList<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean>> getHighSpeedVideoFpsRangesFor;
    private final androidx.collection.MutableObjectList<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent> getHighSpeedVideoFpsRanges;

    public TextContextMenuBuilderScope() {
        int i = 0;
        int i2 = 1;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        this.getHighSpeedVideoFpsRanges = new androidx.collection.MutableObjectList<>(i, i2, defaultConstructorMarker);
        this.getHighSpeedVideoFpsRangesFor = new androidx.collection.MutableObjectList<>(i, i2, defaultConstructorMarker);
    }

    public final void addFilter$foundation(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean> filter) {
        this.getHighSpeedVideoFpsRangesFor.add(filter);
    }

    public final void addComponent$foundation(androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent component) {
        this.getHighSpeedVideoFpsRanges.add(component);
    }

    public final void separator() {
        this.getHighSpeedVideoFpsRanges.add(androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator.INSTANCE);
    }

    public final androidx.compose.foundation.text.contextmenu.data.TextContextMenuData build$foundation() {
        androidx.collection.MutableObjectList mutableObjectList = new androidx.collection.MutableObjectList(0, 1, false ? 1 : 0);
        androidx.collection.MutableObjectList<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent> mutableObjectList2 = this.getHighSpeedVideoFpsRanges;
        java.lang.Object[] objArr = mutableObjectList2.content;
        int i = mutableObjectList2._size;
        int i2 = 0;
        boolean z = true;
        androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent textContextMenuComponent = null;
        while (i2 < i) {
            androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent textContextMenuComponent2 = (androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent) objArr[i2];
            if (!z || textContextMenuComponent2 != androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator.INSTANCE) {
                if (!androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2) || !androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent)) {
                    if (!androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScopeKt.isSeparator(textContextMenuComponent2)) {
                        androidx.collection.MutableObjectList<kotlin.jvm.functions.Function1<androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent, java.lang.Boolean>> mutableObjectList3 = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object[] objArr2 = mutableObjectList3.content;
                        int i3 = mutableObjectList3._size;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((java.lang.Boolean) ((kotlin.jvm.functions.Function1) objArr2[i4]).invoke(textContextMenuComponent2)).booleanValue()) {
                            }
                        }
                    }
                    mutableObjectList.add(textContextMenuComponent2);
                    z = false;
                    textContextMenuComponent = textContextMenuComponent2;
                }
                z = false;
                break;
            }
            i2++;
            z = z;
        }
        androidx.collection.MutableObjectList mutableObjectList4 = mutableObjectList;
        if (androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScopeKt.isSeparator((androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent) (mutableObjectList4.isEmpty() ? null : mutableObjectList4.content[mutableObjectList4._size - 1]))) {
            mutableObjectList.removeAt(mutableObjectList4._size - 1);
        }
        return new androidx.compose.foundation.text.contextmenu.data.TextContextMenuData(mutableObjectList.asList());
    }
}
