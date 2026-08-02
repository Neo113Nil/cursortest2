package com.paypal.oslo.feature.home.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "section", "", "index", "sectionItemTestTag", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/home/domain/model/Section;I)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TestTagKt {
    public static final androidx.compose.ui.Modifier sectionItemTestTag(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.home.domain.model.Section<?> section, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        java.lang.String id = section.getId();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(id);
        sb.append("_item_");
        sb.append(i);
        return modifier.then(androidx.compose.ui.platform.TestTagKt.testTag(companion, sb.toString()));
    }
}
