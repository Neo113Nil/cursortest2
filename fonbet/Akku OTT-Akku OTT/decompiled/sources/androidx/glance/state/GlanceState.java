package androidx.glance.state;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.d;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ[\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/glance/state/GlanceState;", "Landroidx/glance/state/ConfigManager;", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "context", "Landroidx/glance/state/GlanceStateDefinition;", "definition", "", "fileKey", "Landroidx/datastore/core/DataStore;", "getDataStore", "(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValue", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "updateBlock", "updateValue", "(Landroid/content/Context;Landroidx/glance/state/GlanceStateDefinition;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteStore", "Lkotlinx/coroutines/sync/a;", "mutex", "Lkotlinx/coroutines/sync/a;", "", "dataStores", "Ljava/util/Map;", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nGlanceStateDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlanceStateDefinition.kt\nandroidx/glance/state/GlanceState\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,177:1\n107#2,10:178\n107#2,8:188\n116#2:203\n115#2:204\n361#3,7:196\n*S KotlinDebug\n*F\n+ 1 GlanceStateDefinition.kt\nandroidx/glance/state/GlanceState\n*L\n129#1:178,10\n142#1:188,8\n142#1:203\n142#1:204\n143#1:196,7\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceState implements ConfigManager {
    public static final GlanceState INSTANCE = new GlanceState();
    private static final a mutex = d.a();
    private static final Map<String, DataStore<?>> dataStores = new LinkedHashMap();
    public static final int $stable = 8;

    private GlanceState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (r10.d(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:26:0x0071, B:28:0x0079), top: B:25:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object getDataStore(Context context, GlanceStateDefinition<T> glanceStateDefinition, String str, Continuation<? super DataStore<T>> continuation) {
        GlanceState$getDataStore$1 glanceState$getDataStore$1;
        int i;
        a aVar;
        a aVar2;
        DataStore<?> dataStore;
        Map<String, DataStore<?>> map;
        try {
            if (continuation instanceof GlanceState$getDataStore$1) {
                glanceState$getDataStore$1 = (GlanceState$getDataStore$1) continuation;
                int i2 = glanceState$getDataStore$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    glanceState$getDataStore$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = glanceState$getDataStore$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = glanceState$getDataStore$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = mutex;
                        glanceState$getDataStore$1.L$0 = context;
                        glanceState$getDataStore$1.L$1 = glanceStateDefinition;
                        glanceState$getDataStore$1.L$2 = str;
                        glanceState$getDataStore$1.L$3 = aVar;
                        glanceState$getDataStore$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            map = (Map) glanceState$getDataStore$1.L$2;
                            aVar2 = (a) glanceState$getDataStore$1.L$1;
                            str = (String) glanceState$getDataStore$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                dataStore = (DataStore) obj;
                                map.put(str, dataStore);
                                Intrinsics.checkNotNull(dataStore, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
                                DataStore<?> dataStore2 = dataStore;
                                aVar2.c(null);
                                return dataStore2;
                            } catch (Throwable th) {
                                th = th;
                                aVar2.c(null);
                                throw th;
                            }
                        }
                        a aVar3 = (a) glanceState$getDataStore$1.L$3;
                        str = (String) glanceState$getDataStore$1.L$2;
                        glanceStateDefinition = (GlanceStateDefinition) glanceState$getDataStore$1.L$1;
                        Context context2 = (Context) glanceState$getDataStore$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                        context = context2;
                    }
                    Map<String, DataStore<?>> map2 = dataStores;
                    dataStore = map2.get(str);
                    if (dataStore == null) {
                        aVar2 = aVar;
                        Intrinsics.checkNotNull(dataStore, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
                        DataStore<?> dataStore22 = dataStore;
                        aVar2.c(null);
                        return dataStore22;
                    }
                    glanceState$getDataStore$1.L$0 = str;
                    glanceState$getDataStore$1.L$1 = aVar;
                    glanceState$getDataStore$1.L$2 = map2;
                    glanceState$getDataStore$1.L$3 = null;
                    glanceState$getDataStore$1.label = 2;
                    Object dataStore3 = glanceStateDefinition.getDataStore(context, str, glanceState$getDataStore$1);
                    if (dataStore3 != coroutine_suspended) {
                        aVar2 = aVar;
                        obj = dataStore3;
                        map = map2;
                        dataStore = (DataStore) obj;
                        map.put(str, dataStore);
                        Intrinsics.checkNotNull(dataStore, "null cannot be cast to non-null type androidx.datastore.core.DataStore<T of androidx.glance.state.GlanceState.getDataStore$lambda$2>");
                        DataStore<?> dataStore222 = dataStore;
                        aVar2.c(null);
                        return dataStore222;
                    }
                    return coroutine_suspended;
                }
            }
            Map<String, DataStore<?>> map22 = dataStores;
            dataStore = map22.get(str);
            if (dataStore == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.c(null);
            throw th;
        }
        glanceState$getDataStore$1 = new GlanceState$getDataStore$1(this, continuation);
        Object obj2 = glanceState$getDataStore$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceState$getDataStore$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.glance.state.ConfigManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteStore(Context context, GlanceStateDefinition<?> glanceStateDefinition, String str, Continuation<? super Unit> continuation) {
        GlanceState$deleteStore$1 glanceState$deleteStore$1;
        int i;
        a aVar;
        try {
            if (continuation instanceof GlanceState$deleteStore$1) {
                glanceState$deleteStore$1 = (GlanceState$deleteStore$1) continuation;
                int i2 = glanceState$deleteStore$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    glanceState$deleteStore$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = glanceState$deleteStore$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = glanceState$deleteStore$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = mutex;
                        glanceState$deleteStore$1.L$0 = context;
                        glanceState$deleteStore$1.L$1 = glanceStateDefinition;
                        glanceState$deleteStore$1.L$2 = str;
                        glanceState$deleteStore$1.L$3 = aVar;
                        glanceState$deleteStore$1.label = 1;
                        if (aVar.d(glanceState$deleteStore$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a aVar2 = (a) glanceState$deleteStore$1.L$3;
                        str = (String) glanceState$deleteStore$1.L$2;
                        glanceStateDefinition = (GlanceStateDefinition) glanceState$deleteStore$1.L$1;
                        Context context2 = (Context) glanceState$deleteStore$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar2;
                        context = context2;
                    }
                    dataStores.remove(str);
                    glanceStateDefinition.getLocation(context, str).delete();
                    aVar.c(null);
                    return Unit.INSTANCE;
                }
            }
            dataStores.remove(str);
            glanceStateDefinition.getLocation(context, str).delete();
            aVar.c(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            aVar.c(null);
            throw th;
        }
        glanceState$deleteStore$1 = new GlanceState$deleteStore$1(this, continuation);
        Object obj2 = glanceState$deleteStore$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceState$deleteStore$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.glance.state.ConfigManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object getValue(Context context, GlanceStateDefinition<T> glanceStateDefinition, String str, Continuation<? super T> continuation) {
        GlanceState$getValue$1 glanceState$getValue$1;
        int i;
        if (continuation instanceof GlanceState$getValue$1) {
            glanceState$getValue$1 = (GlanceState$getValue$1) continuation;
            int i2 = glanceState$getValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceState$getValue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceState$getValue$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceState$getValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    glanceState$getValue$1.label = 1;
                    obj = getDataStore(context, glanceStateDefinition, str, glanceState$getValue$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                InterfaceC1060e<T> data = ((DataStore) obj).getData();
                glanceState$getValue$1.label = 2;
                Object e = C1062g.e(data, glanceState$getValue$1);
                return e != coroutine_suspended ? coroutine_suspended : e;
            }
        }
        glanceState$getValue$1 = new GlanceState$getValue$1(this, continuation);
        Object obj2 = glanceState$getValue$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceState$getValue$1.label;
        if (i != 0) {
        }
        InterfaceC1060e<T> data2 = ((DataStore) obj2).getData();
        glanceState$getValue$1.label = 2;
        Object e2 = C1062g.e(data2, glanceState$getValue$1);
        if (e2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.glance.state.ConfigManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object updateValue(Context context, GlanceStateDefinition<T> glanceStateDefinition, String str, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        GlanceState$updateValue$1 glanceState$updateValue$1;
        int i;
        if (continuation instanceof GlanceState$updateValue$1) {
            glanceState$updateValue$1 = (GlanceState$updateValue$1) continuation;
            int i2 = glanceState$updateValue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glanceState$updateValue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = glanceState$updateValue$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = glanceState$updateValue$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    glanceState$updateValue$1.L$0 = function2;
                    glanceState$updateValue$1.label = 1;
                    obj = getDataStore(context, glanceStateDefinition, str, glanceState$updateValue$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function2 = (Function2) glanceState$updateValue$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                glanceState$updateValue$1.L$0 = null;
                glanceState$updateValue$1.label = 2;
                Object updateData = ((DataStore) obj).updateData(function2, glanceState$updateValue$1);
                return updateData != coroutine_suspended ? coroutine_suspended : updateData;
            }
        }
        glanceState$updateValue$1 = new GlanceState$updateValue$1(this, continuation);
        Object obj2 = glanceState$updateValue$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = glanceState$updateValue$1.label;
        if (i != 0) {
        }
        glanceState$updateValue$1.L$0 = null;
        glanceState$updateValue$1.label = 2;
        Object updateData2 = ((DataStore) obj2).updateData(function2, glanceState$updateValue$1);
        if (updateData2 != coroutine_suspended2) {
        }
    }
}
