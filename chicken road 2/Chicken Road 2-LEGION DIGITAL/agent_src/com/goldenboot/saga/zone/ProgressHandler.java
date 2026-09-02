package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ProgressHandler;", "Landroidx/compose/ui/layout/PanelUtil;", "", "slotId", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "content", "", "Lcom/goldenboot/saga/zone/BreadcrumbMerger;", "extractPosition", "(Ljava/lang/Object;Lcom/goldenboot/saga/zone/IconExporter;)Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ProgressHandler extends androidx.compose.ui.layout.PanelUtil {
    List<BreadcrumbMerger> extractPosition(Object slotId, IconExporter content);
}
