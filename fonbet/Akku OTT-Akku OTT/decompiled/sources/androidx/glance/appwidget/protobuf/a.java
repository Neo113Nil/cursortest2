package androidx.glance.appwidget.protobuf;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {
    public static int a(int i, int i2, int i3, int i4) {
        return CodedOutputStream.computeUInt32SizeNoTag(i) + i2 + i3 + i4;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
