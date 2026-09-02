package com.goldenboot.saga.zone;

import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@ReceiverAdministrator
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/goldenboot/saga/zone/ScopedTransformer;", "", "", "Lcom/goldenboot/saga/zone/DimenCommand;", "editCommands", "Lcom/goldenboot/saga/zone/DpadBuilder;", "growPayload", "(Ljava/util/List;)V", "Lcom/goldenboot/saga/zone/PaletteHolder;", "imeAction", "evictLayout", "(I)V", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ScopedTransformer {
    void evictLayout(int imeAction);

    void growPayload(List<? extends DimenCommand> editCommands);
}
