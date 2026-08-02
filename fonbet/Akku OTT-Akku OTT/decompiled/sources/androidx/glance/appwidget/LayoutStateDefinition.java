package androidx.glance.appwidget;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.glance.appwidget.proto.LayoutProto;
import androidx.glance.appwidget.proto.LayoutProtoSerializer;
import androidx.glance.state.GlanceStateDefinition;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/glance/appwidget/LayoutStateDefinition;", "Landroidx/glance/state/GlanceStateDefinition;", "Landroidx/glance/appwidget/proto/LayoutProto$LayoutConfig;", "()V", "getDataStore", "Landroidx/datastore/core/DataStore;", "context", "Landroid/content/Context;", "fileKey", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocation", "Ljava/io/File;", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LayoutStateDefinition implements GlanceStateDefinition<LayoutProto.LayoutConfig> {
    public static final LayoutStateDefinition INSTANCE = new LayoutStateDefinition();

    private LayoutStateDefinition() {
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public Object getDataStore(final Context context, final String str, Continuation<? super DataStore<LayoutProto.LayoutConfig>> continuation) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, LayoutProtoSerializer.INSTANCE, null, null, null, new Function0<File>() { // from class: androidx.glance.appwidget.LayoutStateDefinition$getDataStore$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                return DataStoreFile.dataStoreFile(context, str);
            }
        }, 14, null);
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public File getLocation(Context context, String fileKey) {
        return DataStoreFile.dataStoreFile(context, fileKey);
    }
}
