package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionObserverKt;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.C1124z0;
import kotlinx.coroutines.InterfaceC1096l;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.InterfaceC1121y;
import kotlinx.coroutines.flow.C1062g;
import kotlinx.coroutines.flow.C1076u;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.O;
import kotlinx.coroutines.flow.Q;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u0087\u00022\u00020\u0001:\n\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u0087\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0018\u0010\u000bJ*\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0002\b\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0002\b\u001cH\u0010¢\u0006\u0004\b%\u0010&J3\u0010+\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#H\u0010¢\u0006\u0004\b)\u0010*J\u0017\u0010/\u001a\u00020\t2\u0006\u0010,\u001a\u00020$H\u0010¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\tH\u0086@¢\u0006\u0004\b0\u0010\u000bJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u0016J\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u0016J\u001d\u00108\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0010¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b<\u0010:J\u0017\u0010?\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b>\u0010:J\u0017\u0010A\u001a\u00020\t2\u0006\u0010,\u001a\u00020$H\u0010¢\u0006\u0004\b@\u0010.J\u0017\u0010F\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bG\u0010EJ+\u0010O\u001a\u00020\t2\u0006\u0010C\u001a\u00020B2\u0006\u0010J\u001a\u00020I2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030KH\u0010¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\bP\u0010:J\u0019\u0010T\u001a\u0004\u0018\u00010I2\u0006\u0010C\u001a\u00020BH\u0010¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010UH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ$\u0010Y\u001a\u00020\t2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0[H\u0082\b¢\u0006\u0004\bY\u0010]J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b`\u0010aJ-\u0010f\u001a\u00020\t2\u0006\u0010c\u001a\u00020b2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010e\u001a\u00020XH\u0002¢\u0006\u0004\bf\u0010gJ\u001e\u0010i\u001a\u00020\t2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0082\b¢\u0006\u0004\bi\u0010jJ\u0015\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00190kH\u0002¢\u0006\u0004\bl\u0010mJ\u0015\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00190kH\u0002¢\u0006\u0004\bn\u0010mJ\u000f\u0010o\u001a\u00020\tH\u0002¢\u0006\u0004\bo\u0010\u0016J\u0017\u0010p\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bp\u0010:J\u0017\u0010q\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bq\u0010:J\u0017\u0010r\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\br\u0010:J\u0017\u0010s\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bs\u0010:J\u0011\u0010u\u001a\u0004\u0018\u00010tH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\tH\u0002¢\u0006\u0004\bw\u0010\u0016J\u0017\u0010x\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bx\u0010:J \u0010}\u001a\u00020\t2\u0006\u0010z\u001a\u00020y2\u0006\u0010|\u001a\u00020{H\u0082@¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u007f\u0010\u000bJX\u0010\u0087\u0001\u001a\u00020\t2C\u0010h\u001a?\b\u0001\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0015\u0012\u00130y¢\u0006\u000e\b\u0082\u0001\u0012\t\b\u0083\u0001\u0012\u0004\b\b(z\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\t0\u0084\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00010\u0080\u0001¢\u0006\u0003\b\u0086\u0001H\u0082@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u0089\u0001\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0089\u0001\u0010:J/\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u008b\u0001\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u008a\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J:\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190k2\r\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020B0k2\u0011\u0010\u008b\u0001\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u008a\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0011\u0010\u0091\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0016J'\u0010\u0092\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\t0[2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J:\u0010\u0094\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0004\u0012\u00020\t0[2\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u008b\u0001\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u008a\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001JC\u0010\u0097\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0096\u00012\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u008b\u0001\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u008a\u00012\f\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0082\b¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u009b\u0001\u001a\u00020\t2\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001R,\u0010\u009f\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001d\u0010§\u0001\u001a\b0\u0085\u0001j\u0003`¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001e\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R!\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¯\u0001R!\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001e\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010¯\u0001R\u001e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020B0\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¯\u0001R.\u0010º\u0001\u001a\u0019\u0012\u000e\u0012\f\u0012\u0007\u0012\u0005\u0018\u00010\u0085\u00010¹\u0001\u0012\u0004\u0012\u00020B0¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010½\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R$\u0010À\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020I0¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010»\u0001R$\u0010Á\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020B0¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010»\u0001R\"\u0010Â\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00ad\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010¯\u0001R!\u0010Ã\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R!\u0010Å\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010È\u0001\u001a\u00030Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ê\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0019\u0010Î\u0001\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ë\u0001R\u001f\u0010Ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ð\u00010Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R'\u0010Ô\u0001\u001a\u0012\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020$\u0018\u00010\u008a\u00010Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R)\u0010Ý\u0001\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\bÝ\u0001\u0010Þ\u0001\u0012\u0005\bß\u0001\u0010\u0016R\u001c\u0010á\u0001\u001a\u00070à\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0016\u0010\u0012\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010Û\u0001R&\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030Ð\u00010ä\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bç\u0001\u0010\u0016\u001a\u0006\bå\u0001\u0010æ\u0001R\u001c\u0010ì\u0001\u001a\n\u0012\u0005\u0012\u00030Ð\u00010é\u00018F¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001R\u0013\u0010î\u0001\u001a\u00020X8F¢\u0006\u0007\u001a\u0005\bí\u0001\u0010ZR\u001d\u0010ñ\u0001\u001a\b0\u009d\u0001j\u0003`ï\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010¢\u0001R\u0016\u0010ó\u0001\u001a\u00020X8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bò\u0001\u0010ZR\u0016\u0010õ\u0001\u001a\u00020X8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010ZR\u0016\u0010÷\u0001\u001a\u00020X8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bö\u0001\u0010ZR\u0019\u0010\u001a\u001a\u0005\u0018\u00010ø\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0016\u0010ü\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bû\u0001\u0010ZR\u0016\u0010þ\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bý\u0001\u0010ZR\u0016\u0010\u0080\u0002\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0001\u0010ZR\u0016\u0010\u0082\u0002\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0002\u0010ZR\u0016\u0010\u0084\u0002\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0002\u0010ZR\u0016\u0010\u0086\u0002\u001a\u00020X8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0002\u0010Z¨\u0006\u008c\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "addCompositionRegistrationObserver$runtime", "(Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "addCompositionRegistrationObserver", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "close", "join", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.CONTENT, "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime", "unregisterComposition", "invalidate$runtime", "invalidate", "invalidateScope$runtime", "invalidateScope", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "reportRemovedComposition$runtime", "reportRemovedComposition", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "Lkotlinx/coroutines/l;", "deriveStateLocked", "()Lkotlinx/coroutines/l;", "", "recordComposerModifications", "()Z", "Lkotlin/Function1;", "onEachInvalidComposition", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/x0;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/x0;)V", "", "e", "failedInitialComposition", "recoverable", "processCompositionError", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "block", "withTransparentSnapshot", "(Lkotlin/jvm/functions/Function0;)V", "", "knownCompositions", "()Ljava/util/List;", "knownCompositionsLocked", "clearKnownCompositionsLocked", "removeKnownCompositionLocked", "addKnownCompositionLocked", "registerCompositionLocked", "unregisterCompositionLocked", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "recordFailedCompositionLocked", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "Lkotlin/Function3;", "Lkotlinx/coroutines/K;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Landroidx/collection/MutableScatterSet;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "references", "performInsertValues", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "discardUnusedMovableContentState", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lkotlin/jvm/functions/Function1;", ExifInterface.GPS_DIRECTION_TRUE, "composing", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "", "value", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/x0;", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "movableContentRemoved", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/l;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/G;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/G;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Lkotlinx/coroutines/y;", "effectJob", "Lkotlinx/coroutines/y;", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/collection/MutableObjectList;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getRecomposeCoroutineContext$runtime", "Lkotlinx/coroutines/flow/e;", "getState", "()Lkotlinx/coroutines/flow/e;", "getState$annotations", "state", "Lkotlinx/coroutines/flow/O;", "getCurrentState", "()Lkotlinx/coroutines/flow/O;", "currentState", "getHasPendingWork", "hasPendingWork", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "compositeKeyHashCode", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getCollectingParameterInformation$runtime", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "Companion", "State", "RecomposerInfoImpl", "HotReloadable", "RecomposerErrorState", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 8 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 ObjectList.kt\nandroidx/collection/ObjectList\n+ 11 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 12 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 13 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 14 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 15 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 16 Extensions.kt\nandroidx/compose/runtime/collection/ExtensionsKt\n+ 17 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 18 CompositeKeyHashCode.jvm.kt\nandroidx/compose/runtime/CompositeKeyHashCode_jvmKt\n+ 19 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 20 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 21 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 22 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1894:1\n1502#1,3:1988\n1501#1,7:1991\n1509#1:2003\n1502#1,3:2025\n1501#1,7:2028\n1509#1:2040\n1502#1,3:2064\n1501#1,7:2067\n1509#1:2129\n25#2,5:1895\n33#2:1903\n33#2:1906\n33#2:1909\n33#2:1915\n33#2:1916\n33#2:1917\n33#2:1931\n33#2:1932\n33#2:1933\n33#2:1934\n33#2:1940\n33#2:1955\n33#2:1963\n33#2:1964\n33#2:1965\n33#2:1971\n33#2:1982\n33#2:1985\n33#2:1986\n33#2:1987\n33#2:2004\n33#2:2017\n33#2:2077\n33#2:2119\n33#2:2130\n33#2:2152\n33#2:2155\n33#2:2156\n33#2:2159\n33#2:2162\n33#2:2165\n33#2:2166\n33#2:2167\n33#2:2168\n33#2:2194\n33#2:2195\n33#2:2196\n33#2:2197\n33#2:2198\n33#2:2207\n33#2:2231\n33#2:2233\n1107#3:1900\n1085#3,2:1901\n519#4:1904\n424#4,8:1923\n519#4:1972\n519#4:2153\n519#4:2154\n648#4,2:2160\n643#4,2:2163\n424#4,8:2213\n1#5:1905\n1#5:2116\n1251#6,2:1907\n34#7,5:1910\n34#7,5:1918\n34#7,5:1958\n34#7,5:1966\n91#7:2018\n34#7,5:2019\n92#7:2024\n114#7,2:2041\n34#7,3:2043\n116#7,2:2046\n118#7,2:2055\n38#7:2057\n120#7:2058\n82#7,2:2078\n34#7,5:2080\n84#7:2085\n91#7:2086\n34#7,5:2087\n92#7:2092\n106#7:2097\n34#7,5:2098\n107#7:2103\n106#7:2104\n34#7,5:2105\n107#7:2110\n204#7,2:2111\n34#7,3:2113\n38#7:2117\n206#7:2118\n223#7,2:2120\n64#7,5:2122\n225#7:2127\n34#7,5:2208\n34#7,5:2221\n34#7,5:2226\n34#7,5:2259\n149#8,5:1935\n149#8,5:1998\n149#8,5:2035\n149#8,3:2074\n153#8:2128\n149#8,5:2147\n1863#9,2:1941\n1557#9:2093\n1628#9,3:2094\n287#10,6:1943\n287#10,6:1949\n287#10,4:2133\n292#10:2139\n287#10,6:2141\n919#11,2:1956\n919#11,2:2137\n318#12,9:1973\n327#12,2:1983\n317#13,6:2005\n317#13,6:2011\n381#14,7:2048\n4809#15:2059\n4788#15,4:2060\n23#16,2:2131\n25#16:2140\n84#17:2157\n30#18:2158\n357#19,4:2169\n329#19,6:2173\n339#19,3:2180\n342#19,9:2184\n361#19:2193\n1399#20:2179\n1270#20:2183\n1399#20:2244\n1270#20:2248\n45#21,5:2199\n45#21,3:2204\n49#21:2232\n231#22,3:2234\n200#22,7:2237\n211#22,3:2245\n214#22,9:2249\n234#22:2258\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n1234#1:1988,3\n1234#1:1991,7\n1234#1:2003\n1356#1:2025,3\n1356#1:2028,7\n1356#1:2040\n1379#1:2064,3\n1379#1:2067,7\n1379#1:2129\n225#1:1895,5\n318#1:1903\n370#1:1906\n457#1:1909\n481#1:1915\n484#1:1916\n496#1:1917\n509#1:1931\n517#1:1932\n770#1:1933\n797#1:1934\n844#1:1940\n901#1:1955\n925#1:1963\n938#1:1964\n954#1:1965\n1093#1:1971\n1105#1:1982\n1190#1:1985\n1205#1:1986\n1221#1:1987\n1239#1:2004\n1320#1:2017\n1383#1:2077\n1441#1:2119\n1463#1:2130\n1533#1:2152\n1574#1:2155\n1587#1:2156\n1620#1:2159\n1628#1:2162\n1638#1:2165\n1646#1:2166\n1654#1:2167\n1679#1:2168\n1692#1:2194\n1703#1:2195\n168#1:2196\n288#1:2197\n272#1:2198\n1056#1:2207\n1085#1:2231\n1326#1:2233\n233#1:1900\n233#1:1901,2\n352#1:1904\n507#1:1923,8\n1095#1:1972\n1535#1:2153\n1544#1:2154\n1622#1:2160,2\n1630#1:2163,2\n1059#1:2213,8\n1438#1:2116\n370#1:1907,2\n467#1:1910,5\n503#1:1918,5\n909#1:1958,5\n955#1:1966,5\n1321#1:2018\n1321#1:2019,5\n1321#1:2024\n1376#1:2041,2\n1376#1:2043,3\n1376#1:2046,2\n1376#1:2055,2\n1376#1:2057\n1376#1:2058\n1385#1:2078,2\n1385#1:2080,5\n1385#1:2085\n1397#1:2086\n1397#1:2087,5\n1397#1:2092\n1430#1:2097\n1430#1:2098,5\n1430#1:2103\n1430#1:2104\n1430#1:2105,5\n1430#1:2110\n1438#1:2111,2\n1438#1:2113,3\n1438#1:2117\n1438#1:2118\n1444#1:2120,2\n1444#1:2122,5\n1444#1:2127\n1057#1:2208,5\n1067#1:2221,5\n1080#1:2226,5\n1659#1:2259,5\n833#1:1935,5\n1234#1:1998,5\n1356#1:2035,5\n1379#1:2074,3\n1379#1:2128\n1507#1:2147,5\n859#1:1941,2\n1406#1:2093\n1406#1:2094,3\n881#1:1943,6\n890#1:1949,6\n1470#1:2133,4\n1470#1:2139\n1475#1:2141,6\n908#1:1956,2\n1470#1:2137,2\n1104#1:1973,9\n1104#1:1983,2\n1277#1:2005,6\n1294#1:2011,6\n1376#1:2048,7\n1378#1:2059\n1378#1:2060,4\n1470#1:2131,2\n1470#1:2140\n1598#1:2157\n1598#1:2158\n1684#1:2169,4\n1684#1:2173,6\n1684#1:2180,3\n1684#1:2184,9\n1684#1:2193\n1684#1:2179\n1684#1:2183\n1361#1:2244\n1361#1:2248\n1041#1:2199,5\n1051#1:2204,3\n1051#1:2232\n1361#1:2234,3\n1361#1:2237,7\n1361#1:2245,3\n1361#1:2249,9\n1361#1:2258\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final kotlinx.coroutines.flow.G<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final InterfaceC1121y effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final MutableScatterMap<Object, Object> movableContentRemoved;
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;
    private InterfaceC1120x0 runnerJob;
    private MutableScatterSet<Object> snapshotInvalidations;
    private final Object stateLock;
    private InterfaceC1096l<? super Unit> workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final kotlinx.coroutines.flow.G<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = Q.a(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u0007H\u0000¢\u0006\u0004\b&\u0010\u0003R\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R$\u0010.\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R$\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001000j\b\u0012\u0004\u0012\u00020\u0010`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "", "addRunning", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "removeRunning", "", "Landroidx/compose/runtime/RecomposerInfo;", "currentRunningRecomposers$runtime", "()Ljava/util/Set;", "currentRunningRecomposers", "", "value", "setHotReloadEnabled$runtime", "(Z)V", "setHotReloadEnabled", "saveStateAndDisposeForHotReload$runtime", "()Ljava/lang/Object;", "saveStateAndDisposeForHotReload", Constants.TOKEN, "loadStateAndComposeForHotReload$runtime", "(Ljava/lang/Object;)V", "loadStateAndComposeForHotReload", "", io.flutter.plugins.firebase.crashlytics.Constants.KEY, "invalidateGroupsWithKey$runtime", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime", "clearErrors", "Lkotlinx/coroutines/flow/O;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/O;", "runningRecomposers", "Lkotlinx/coroutines/flow/G;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/G;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1894:1\n1368#2:1895\n1454#2,5:1896\n1863#2,2:1901\n1863#2,2:1913\n1863#2,2:1915\n1611#2,9:1917\n1863#2:1926\n1864#2:1928\n1620#2:1929\n1611#2,9:1930\n1863#2:1939\n1864#2:1941\n1620#2:1942\n34#3,5:1903\n34#3,5:1908\n1#4:1927\n1#4:1940\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1757#1:1895\n1757#1:1896,5\n1765#1:1901,2\n1771#1:1913,2\n1776#1:1915,2\n1790#1:1917,9\n1790#1:1926\n1790#1:1928\n1790#1:1929\n1793#1:1930,9\n1793#1:1939\n1793#1:1941\n1793#1:1942\n1768#1:1903,5\n1769#1:1908,5\n1790#1:1927\n1793#1:1940\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((PersistentSet) info);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.c(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((PersistentSet) info);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.c(persistentSet, remove));
        }

        public final void clearErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState resetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (resetErrorState != null) {
                    arrayList.add(resetErrorState);
                }
            }
        }

        public final Set<RecomposerInfo> currentRunningRecomposers$runtime() {
            return (Set) Recomposer._runningRecomposers.getValue();
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final O<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime(int key) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(key);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime(Object token) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            Intrinsics.checkNotNull(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) token;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((HotReloadable) list.get(i)).resetContent();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((HotReloadable) list.get(i2)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime(boolean value) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(value));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "<init>", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "resetContent", "recompose", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HotReloadable {
        private Function2<? super Composer, ? super Integer, Unit> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m46getLambda$1091980426$runtime());
            }
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "", "<init>", "(ZLjava/lang/Throwable;)V", "getRecoverable", "()Z", "getCause", "()Ljava/lang/Throwable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Throwable th) {
            this.recoverable = z;
            this.cause = th;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Throwable getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "(Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "", io.flutter.plugins.firebase.crashlytics.Constants.KEY, "", "invalidateGroupsWithKey", "(I)V", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "saveStateAndDisposeForHotReload", "()Ljava/util/List;", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "()V", "Lkotlinx/coroutines/flow/e;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/e;", "state", "", "getHasPendingWork", "()Z", "hasPendingWork", "", "getChangeCount", "()J", "changeCount", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "currentError", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1894:1\n33#2:1895\n204#3,2:1896\n34#3,3:1898\n38#3:1902\n206#3:1903\n34#3,5:1904\n204#3,2:1909\n34#3,3:1911\n38#3:1915\n206#3:1916\n82#3,2:1917\n34#3,3:1919\n38#3:1923\n84#3:1924\n1#4:1901\n1#4:1914\n1#4:1922\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n394#1:1895\n403#1:1896,2\n403#1:1898,3\n403#1:1902\n403#1:1903\n404#1:1904,5\n410#1:1909,2\n410#1:1911,3\n410#1:1915\n410#1:1916\n411#1:1917,2\n411#1:1919,3\n411#1:1923\n411#1:1924\n403#1:1901\n410#1:1914\n*E\n"})
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public InterfaceC1060e<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int key) {
            List knownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((CompositionImpl) arrayList.get(i2)).invalidateGroupsWithKey(key);
            }
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public CompositionObserverHandle observe(CompositionRegistrationObserver observer) {
            return CompositionObserverKt.observe(Recomposer.this, observer);
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions = Recomposer.this.knownCompositions();
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i2));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private State(String str, int i) {
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0() { // from class: androidx.compose.runtime.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit broadcastFrameClock$lambda$2;
                broadcastFrameClock$lambda$2 = Recomposer.broadcastFrameClock$lambda$2(Recomposer.this);
                return broadcastFrameClock$lambda$2;
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m187constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m187constructorimpl$default(null, 1, null);
        this._state = Q.a(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        C1124z0 c1124z0 = new C1124z0((InterfaceC1120x0) coroutineContext.get(InterfaceC1120x0.a.a));
        c1124z0.invokeOnCompletion(new Function1() { // from class: androidx.compose.runtime.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit effectJob$lambda$10$lambda$9;
                effectJob$lambda$10$lambda$9 = Recomposer.effectJob$lambda$10$lambda$9(Recomposer.this, (Throwable) obj);
                return effectJob$lambda$10$lambda$9;
            }
        });
        this.effectJob = c1124z0;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(c1124z0);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        registerCompositionLocked(composition);
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        C1100n c1100n;
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        C1100n c1100n2 = new C1100n(1, IntrinsicsKt.intercepted(continuation));
        c1100n2.r();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                c1100n = c1100n2;
            } else {
                this.workContinuation = c1100n2;
                c1100n = null;
            }
        }
        if (c1100n != null) {
            Result.Companion companion = Result.INSTANCE;
            c1100n.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
        Object q = c1100n2.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit broadcastFrameClock$lambda$2(Recomposer recomposer) {
        InterfaceC1096l<Unit> deriveStateLocked;
        synchronized (recomposer.stateLock) {
            deriveStateLocked = recomposer.deriveStateLocked();
            if (recomposer._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                Throwable th = recomposer.closeCause;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    private final void clearKnownCompositionsLocked() {
        Iterator<T> it = knownCompositionsLocked().iterator();
        while (it.hasNext()) {
            unregisterCompositionLocked((ControlledComposition) it.next());
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final <T> T composing(ControlledComposition composition, MutableScatterSet<Object> modifiedValues, Function0<? extends T> block) {
        MutableSnapshot takeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                takeMutableSnapshot.restoreCurrent(makeCurrent);
                InlineMarker.finallyEnd(1);
            }
        } finally {
            InlineMarker.finallyStart(1);
            applyAndCheck(takeMutableSnapshot);
            InlineMarker.finallyEnd(1);
        }
    }

    private static final void deletedMovableContent$lambda$95$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime = movableContentStateReference2.getNestedReferences$runtime();
        if (nestedReferences$runtime != null) {
            int size = nestedReferences$runtime.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime.get(i);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$95$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1096l<Unit> deriveStateLocked() {
        State state;
        int i = 0;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC1096l<? super Unit> interfaceC1096l = this.workContinuation;
            if (interfaceC1096l != null) {
                interfaceC1096l.cancel(null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i, i2, defaultConstructorMarker);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.isNotEmpty() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked() && !MultiValueMap.m195isNotEmptyimpl(this.movableContentRemoved)) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        InterfaceC1096l interfaceC1096l2 = this.workContinuation;
        this.workContinuation = null;
        return interfaceC1096l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        ObjectList objectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m195isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList m200valuesimpl = MultiValueMap.m200valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m185clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m185clearimpl(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(m200valuesimpl.getSize());
                    Object[] objArr = m200valuesimpl.content;
                    int i2 = m200valuesimpl._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                        mutableObjectList.add(TuplesKt.to(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectList = mutableObjectList;
                } else {
                    objectList = ObjectListKt.emptyObjectList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectList.content;
        int i4 = objectList._size;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$10$lambda$9(final Recomposer recomposer, final Throwable th) {
        InterfaceC1096l<? super Unit> interfaceC1096l;
        InterfaceC1096l<? super Unit> interfaceC1096l2;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        synchronized (recomposer.stateLock) {
            try {
                InterfaceC1120x0 interfaceC1120x0 = recomposer.runnerJob;
                interfaceC1096l = null;
                if (interfaceC1120x0 != null) {
                    recomposer._state.setValue(State.ShuttingDown);
                    if (recomposer.isClosed) {
                        interfaceC1096l2 = recomposer.workContinuation;
                        if (interfaceC1096l2 != null) {
                            recomposer.workContinuation = null;
                            interfaceC1120x0.invokeOnCompletion(new Function1() { // from class: androidx.compose.runtime.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                                    effectJob$lambda$10$lambda$9$lambda$8$lambda$7 = Recomposer.effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer.this, th, (Throwable) obj);
                                    return effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                                }
                            });
                            interfaceC1096l = interfaceC1096l2;
                        }
                    } else {
                        interfaceC1120x0.cancel(cancellationException);
                    }
                    interfaceC1096l2 = null;
                    recomposer.workContinuation = null;
                    interfaceC1120x0.invokeOnCompletion(new Function1() { // from class: androidx.compose.runtime.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                            effectJob$lambda$10$lambda$9$lambda$8$lambda$7 = Recomposer.effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer.this, th, (Throwable) obj);
                            return effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                        }
                    });
                    interfaceC1096l = interfaceC1096l2;
                } else {
                    recomposer.closeCause = cancellationException;
                    recomposer._state.setValue(State.ShutDown);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC1096l != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC1096l.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        ExceptionsKt.addSuppressed(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th;
            recomposer._state.setValue(State.ShutDown);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked() || MultiValueMap.m195isNotEmptyimpl(this.movableContentRemoved);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0) {
                z = getHasBroadcastFrameClockAwaitersLocked();
            }
        }
        return z;
    }

    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator<InterfaceC1120x0> it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositions() {
        List<ControlledComposition> knownCompositionsLocked;
        synchronized (this.stateLock) {
            knownCompositionsLocked = knownCompositionsLocked();
        }
        return knownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ControlledComposition> knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<ControlledComposition> list2 = this._knownCompositions;
        List<ControlledComposition> emptyList = list2.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list2);
        this._knownCompositionsCache = emptyList;
        return emptyList;
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(list.get(i).getComposition(), composition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
    
        if (r4 >= r3) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).getSecond() == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        if (r11.getSecond() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0171, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017a, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0185, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r16.movableContentAwaitingInsert, r3);
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018e, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:
    
        if (((kotlin.Pair) r11).getSecond() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ab, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ae, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> references, MutableScatterSet<Object> modifiedValues) {
        ArrayList arrayList;
        int collectionSizeOrDefault;
        NestedMovableContent removeLast;
        HashMap hashMap = new HashMap(references.size());
        int size = references.size();
        for (int i = 0; i < size; i++) {
            MovableContentStateReference movableContentStateReference = references.get(i);
            ControlledComposition composition = movableContentStateReference.getComposition();
            Object obj = hashMap.get(composition);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(composition, obj);
            }
            ((ArrayList) obj).add(movableContentStateReference);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            if (controlledComposition.isComposing()) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            MutableSnapshot takeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) list.get(i2);
                                Object m197removeLastimpl = MultiValueMap.m197removeLastimpl(this.movableContentRemoved, movableContentStateReference2.getContent$runtime());
                                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) m197removeLastimpl;
                                if (movableContentStateReference3 != null) {
                                    this.movableContentNestedStatesAvailable.usedContainer(movableContentStateReference3);
                                }
                                arrayList.add(TuplesKt.to(movableContentStateReference2, m197removeLastimpl));
                            }
                            if (ComposeRuntimeFlags.isMovingNestedMovableContentEnabled) {
                                int size3 = arrayList.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        break;
                                    }
                                    Pair pair = (Pair) arrayList.get(i3);
                                    if (pair.getSecond() == null && this.movableContentNestedStatesAvailable.contains(((MovableContentStateReference) pair.getFirst()).getContent$runtime())) {
                                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            Pair pair2 = (Pair) it.next();
                                            if (pair2.getSecond() == null && (removeLast = this.movableContentNestedStatesAvailable.removeLast(((MovableContentStateReference) pair2.getFirst()).getContent$runtime())) != null) {
                                                MovableContentStateReference content = removeLast.getContent();
                                                MultiValueMap.m183addimpl(this.movableContentNestedExtractionsPending, removeLast.getContainer(), content);
                                                pair2 = TuplesKt.to(pair2.getFirst(), content);
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    int size4 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size4) {
                            break;
                        }
                        if (((Pair) arrayList.get(i4)).getSecond() != null) {
                            break;
                        }
                        i4++;
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit = Unit.INSTANCE;
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        return CollectionsKt.toList(hashMap.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition composition, final MutableScatterSet<Object> modifiedValues) {
        if (composition.isComposing() || composition.isDisposed()) {
            return null;
        }
        Set<ControlledComposition> set = this.compositionsRemoved;
        if (set != null && set.contains(composition)) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new Function0() { // from class: androidx.compose.runtime.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit performRecompose$lambda$68$lambda$67;
                                performRecompose$lambda$68$lambda$67 = Recomposer.performRecompose$lambda$68$lambda$67(MutableScatterSet.this, composition);
                                return performRecompose$lambda$68$lambda$67;
                            }
                        });
                    }
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            }
            boolean recompose = composition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (recompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performRecompose$lambda$68$lambda$67(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            controlledComposition.recordWriteOf(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Unit.INSTANCE;
    }

    private final void processCompositionError(Throwable e, ControlledComposition failedInitialComposition, boolean recoverable) {
        int i = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e);
                Unit unit = Unit.INSTANCE;
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m185clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e);
                if (failedInitialComposition != null) {
                    recordFailedCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z);
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition composition) {
        return new Function1() { // from class: androidx.compose.runtime.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit readObserverOf$lambda$85;
                readObserverOf$lambda$85 = Recomposer.readObserverOf$lambda$85(ControlledComposition.this, obj);
                return readObserverOf$lambda$85;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserverOf$lambda$85(ControlledComposition controlledComposition, Object obj) {
        controlledComposition.recordReadOf(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(Function3<? super kotlinx.coroutines.K, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object f = C1082i.f(new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.get$context()), null), this.broadcastFrameClock, continuation);
        return f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? f : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        CollectionsKt.emptyList();
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            List<ControlledComposition> knownCompositionsLocked = knownCompositionsLocked();
            Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            int i = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i, 1, null);
            try {
                int size = knownCompositionsLocked.size();
                while (i < size) {
                    knownCompositionsLocked.get(i).recordModificationsOf(wrapIntoSet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                    i++;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(wrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition composition) {
        List list = this.failedCompositions;
        if (list == null) {
            list = new ArrayList();
            this.failedCompositions = list;
        }
        if (!list.contains(composition)) {
            list.add(composition);
        }
        removeKnownCompositionLocked(composition);
    }

    private final void registerCompositionLocked(ControlledComposition composition) {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (composition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) composition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(InterfaceC1120x0 callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(composition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt.removeLast(list);
                if (controlledComposition instanceof CompositionImpl) {
                    ((CompositionImpl) controlledComposition).invalidateAll();
                    ((CompositionImpl) controlledComposition).setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            int size = list.size();
                            while (i < size) {
                                recordFailedCompositionLocked(list.get(i));
                                i++;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            try {
                int size2 = list.size();
                while (i < size2) {
                    recordFailedCompositionLocked(list.get(i));
                    i++;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (r5.withFrameNanos(r9, r0) != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0093 -> B:11:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runFrameLoop(MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, Continuation<? super Unit> continuation) {
        Recomposer$runFrameLoop$1 recomposer$runFrameLoop$1;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        final ArrayList arrayList3;
        final ArrayList arrayList4;
        MonotonicFrameClock monotonicFrameClock2;
        final ProduceFrameSignal produceFrameSignal2;
        Object obj;
        ArrayList arrayList5;
        ArrayList arrayList6;
        if (continuation instanceof Recomposer$runFrameLoop$1) {
            recomposer$runFrameLoop$1 = (Recomposer$runFrameLoop$1) continuation;
            int i2 = recomposer$runFrameLoop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recomposer$runFrameLoop$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = recomposer$runFrameLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recomposer$runFrameLoop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    obj = this.stateLock;
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$2 = arrayList;
                    recomposer$runFrameLoop$1.L$3 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r7 = (List) recomposer$runFrameLoop$1.L$3;
                    ?? r8 = (List) recomposer$runFrameLoop$1.L$2;
                    produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.L$1;
                    monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    arrayList6 = r7;
                    arrayList5 = r8;
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    obj = this.stateLock;
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$2 = arrayList;
                    recomposer$runFrameLoop$1.L$3 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                        monotonicFrameClock2 = monotonicFrameClock;
                        arrayList4 = arrayList2;
                        produceFrameSignal2 = produceFrameSignal;
                        arrayList3 = arrayList;
                        Function1 function1 = new Function1() { // from class: androidx.compose.runtime.B
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                InterfaceC1096l runFrameLoop$lambda$51;
                                runFrameLoop$lambda$51 = Recomposer.runFrameLoop$lambda$51(Recomposer.this, arrayList3, arrayList4, produceFrameSignal2, ((Long) obj3).longValue());
                                return runFrameLoop$lambda$51;
                            }
                        };
                        recomposer$runFrameLoop$1.L$0 = monotonicFrameClock2;
                        recomposer$runFrameLoop$1.L$1 = produceFrameSignal2;
                        recomposer$runFrameLoop$1.L$2 = arrayList3;
                        recomposer$runFrameLoop$1.L$3 = arrayList4;
                        recomposer$runFrameLoop$1.label = 2;
                        arrayList6 = arrayList4;
                        arrayList5 = arrayList3;
                    }
                    return coroutine_suspended;
                }
                ?? r72 = (List) recomposer$runFrameLoop$1.L$3;
                ?? r82 = (List) recomposer$runFrameLoop$1.L$2;
                produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.L$1;
                monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.L$0;
                ResultKt.throwOnFailure(obj2);
                arrayList4 = r72;
                arrayList3 = r82;
                Function1 function12 = new Function1() { // from class: androidx.compose.runtime.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        InterfaceC1096l runFrameLoop$lambda$51;
                        runFrameLoop$lambda$51 = Recomposer.runFrameLoop$lambda$51(Recomposer.this, arrayList3, arrayList4, produceFrameSignal2, ((Long) obj3).longValue());
                        return runFrameLoop$lambda$51;
                    }
                };
                recomposer$runFrameLoop$1.L$0 = monotonicFrameClock2;
                recomposer$runFrameLoop$1.L$1 = produceFrameSignal2;
                recomposer$runFrameLoop$1.L$2 = arrayList3;
                recomposer$runFrameLoop$1.L$3 = arrayList4;
                recomposer$runFrameLoop$1.label = 2;
                arrayList6 = arrayList4;
                arrayList5 = arrayList3;
            }
        }
        recomposer$runFrameLoop$1 = new Recomposer$runFrameLoop$1(this, continuation);
        Object obj22 = recomposer$runFrameLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recomposer$runFrameLoop$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1096l runFrameLoop$lambda$51(Recomposer recomposer, List list, List list2, ProduceFrameSignal produceFrameSignal, long j) {
        Object beginSection;
        int i;
        InterfaceC1096l<Unit> deriveStateLocked;
        if (recomposer.getHasBroadcastFrameClockAwaiters()) {
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Recomposer:animation");
            try {
                recomposer.broadcastFrameClock.sendFrame(j);
                Snapshot.INSTANCE.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
            }
        }
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer.recordComposerModifications();
            synchronized (recomposer.stateLock) {
                try {
                    List<ControlledComposition> list3 = recomposer.compositionsAwaitingApply;
                    int size = list3.size();
                    i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        list2.add(list3.get(i2));
                    }
                    recomposer.compositionsAwaitingApply.clear();
                    MutableVector<ControlledComposition> mutableVector = recomposer.compositionInvalidations;
                    ControlledComposition[] controlledCompositionArr = mutableVector.content;
                    int size2 = mutableVector.getSize();
                    for (int i3 = 0; i3 < size2; i3++) {
                        list.add(controlledCompositionArr[i3]);
                    }
                    recomposer.compositionInvalidations.clear();
                    produceFrameSignal.takeFrameRequestLocked();
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            MutableScatterSet<Object> mutableScatterSet = new MutableScatterSet<>(i, 1, null);
            try {
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ControlledComposition performRecompose = recomposer.performRecompose((ControlledComposition) list.get(i4), mutableScatterSet);
                    if (performRecompose != null) {
                        list2.add(performRecompose);
                    }
                }
                list.clear();
                if (!list2.isEmpty()) {
                    recomposer.changeCount++;
                }
                try {
                    int size4 = list2.size();
                    while (i < size4) {
                        ((ControlledComposition) list2.get(i)).applyChanges();
                        i++;
                    }
                    list2.clear();
                    synchronized (recomposer.stateLock) {
                        deriveStateLocked = recomposer.deriveStateLocked();
                    }
                    return deriveStateLocked;
                } catch (Throwable th2) {
                    list2.clear();
                    throw th2;
                }
            } catch (Throwable th3) {
                list.clear();
                throw th3;
            }
        } finally {
        }
    }

    private final void unregisterCompositionLocked(ControlledComposition composition) {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (composition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionUnregistered((ObservableComposition) composition);
                }
            }
        }
    }

    private final void withTransparentSnapshot(Function0<Unit> block) {
        Snapshot current = Snapshot.INSTANCE.getCurrent();
        Snapshot transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, true, false);
        try {
            Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
            try {
                block.invoke();
                InlineMarker.finallyStart(1);
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                InlineMarker.finallyEnd(1);
                InlineMarker.finallyStart(1);
                transparentObserverMutableSnapshot.dispose();
                InlineMarker.finallyEnd(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            transparentObserverMutableSnapshot.dispose();
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition composition, final MutableScatterSet<Object> modifiedValues) {
        return new Function1() { // from class: androidx.compose.runtime.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit writeObserverOf$lambda$86;
                writeObserverOf$lambda$86 = Recomposer.writeObserverOf$lambda$86(composition, modifiedValues, obj);
                return writeObserverOf$lambda$86;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeObserverOf$lambda$86(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, Object obj) {
        controlledComposition.recordWriteOf(obj);
        if (mutableScatterSet != null) {
            mutableScatterSet.add(obj);
        }
        return Unit.INSTANCE;
    }

    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime(final CompositionRegistrationObserver observer) {
        synchronized (this.stateLock) {
            try {
                MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
                int i = 0;
                if (mutableObjectList == null) {
                    mutableObjectList = new MutableObjectList<>(i, 1, null);
                    this.registrationObservers = mutableObjectList;
                }
                mutableObjectList.add(observer);
                List<ControlledComposition> list = this._knownCompositions;
                int size = list.size();
                while (i < size) {
                    ControlledComposition controlledComposition = list.get(i);
                    if (controlledComposition instanceof ObservableComposition) {
                        observer.onCompositionRegistered((ObservableComposition) controlledComposition);
                    }
                    i++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                MutableObjectList mutableObjectList2;
                Object obj = Recomposer.this.stateLock;
                Recomposer recomposer = Recomposer.this;
                CompositionRegistrationObserver compositionRegistrationObserver = observer;
                synchronized (obj) {
                    mutableObjectList2 = recomposer.registrationObservers;
                    if (mutableObjectList2 != null) {
                        mutableObjectList2.remove(compositionRegistrationObserver);
                    }
                }
            }
        };
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(Continuation<? super Unit> continuation) {
        Object collect = new C1076u(new Recomposer$awaitIdle$2(null), getCurrentState()).collect(kotlinx.coroutines.flow.internal.s.a, continuation);
        if (collect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            collect = Unit.INSTANCE;
        }
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.effectJob.cancel((CancellationException) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) {
        Throwable th;
        boolean z;
        Recomposer recomposer;
        boolean isComposing = composition.isComposing();
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.ShuttingDown) > 0) {
                    try {
                        boolean contains = knownCompositionsLocked().contains(composition);
                        z = !contains;
                        if (!contains) {
                            addKnownCompositionLocked(composition);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    z = true;
                }
                try {
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
                    try {
                        Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                        try {
                            composition.composeContent(content);
                            Unit unit = Unit.INSTANCE;
                            takeMutableSnapshot.restoreCurrent(makeCurrent);
                            applyAndCheck(takeMutableSnapshot);
                            if (!isComposing) {
                                companion.notifyObjectsInitialized();
                            }
                            try {
                                performInitialMovableContentInserts(composition);
                                try {
                                    composition.applyChanges();
                                    composition.applyLateChanges();
                                    if (isComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Throwable th3) {
                                    processCompositionError$default(this, th3, null, false, 6, null);
                                }
                            } catch (Throwable th4) {
                                processCompositionError(th4, composition, true);
                            }
                        } catch (Throwable th5) {
                            recomposer = this;
                            try {
                                takeMutableSnapshot.restoreCurrent(makeCurrent);
                                throw th5;
                            } catch (Throwable th6) {
                                th = th6;
                                try {
                                    applyAndCheck(takeMutableSnapshot);
                                    throw th;
                                } catch (Throwable th7) {
                                    th = th7;
                                    processCompositionError(th, composition, true);
                                    if (z) {
                                        synchronized (recomposer.stateLock) {
                                            removeKnownCompositionLocked(composition);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        recomposer = this;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    recomposer = this;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime(ControlledComposition composition, ShouldPauseCallback shouldPause, Function2<? super Composer, ? super Integer, Unit> content) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = composition.getAndSetShouldPauseCallback(shouldPause);
            try {
                composeInitial$runtime(composition, content);
                ScatterSet<RecomposeScopeImpl> scatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSet == null) {
                    scatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSet;
            } finally {
                composition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime(MovableContentStateReference reference) {
        InterfaceC1096l<Unit> deriveStateLocked;
        synchronized (this.stateLock) {
            try {
                MultiValueMap.m183addimpl(this.movableContentRemoved, reference.getContent$runtime(), reference);
                if (reference.getNestedReferences$runtime() != null) {
                    deletedMovableContent$lambda$95$recordNestedStatesOf(this, reference, reference);
                }
                deriveStateLocked = deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingParameterInformation$runtime */
    public boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingSourceInformation$runtime */
    public boolean getCollectingSourceInformation() {
        return ComposerKt.getComposeStackTraceEnabled();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCompositeKeyHashCode$runtime */
    public long getCompositeKeyHashCode() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime() {
        return null;
    }

    public final O<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean getHasPendingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0 && this.concurrentCompositionsOutstanding <= 0 && this.compositionsAwaitingApply.isEmpty() && !getHasBroadcastFrameClockAwaitersLocked()) {
                z = MultiValueMap.m195isNotEmptyimpl(this.movableContentRemoved);
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final InterfaceC1060e<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime(MovableContentStateReference reference) {
        InterfaceC1096l<Unit> deriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime(ControlledComposition composition) {
        InterfaceC1096l<Unit> interfaceC1096l;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                interfaceC1096l = null;
            } else {
                this.compositionInvalidations.add(composition);
                interfaceC1096l = deriveStateLocked();
            }
        }
        if (interfaceC1096l != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC1096l.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime(RecomposeScopeImpl scope) {
        InterfaceC1096l<Unit> deriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(scope);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
    }

    public final Object join(Continuation<? super Unit> continuation) {
        Object f = C1062g.f(getCurrentState(), new Recomposer$join$2(null), continuation);
        return f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? f : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime(MovableContentStateReference reference, MovableContentState data, Applier<?> applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.set(reference, data);
                ObjectList<MovableContentStateReference> m192getimpl = MultiValueMap.m192getimpl(this.movableContentNestedExtractionsPending, reference);
                if (m192getimpl.isNotEmpty()) {
                    ScatterMap<MovableContentStateReference, MovableContentState> extractNestedStates$runtime = data.extractNestedStates$runtime(applier, m192getimpl);
                    Object[] objArr = extractNestedStates$runtime.keys;
                    Object[] objArr2 = extractNestedStates$runtime.values;
                    long[] jArr = extractNestedStates$runtime.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj = objArr[i4];
                                        this.movableContentStatesAvailable.set((MovableContentStateReference) obj, (MovableContentState) objArr2[i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference reference) {
        MovableContentState remove;
        synchronized (this.stateLock) {
            remove = this.movableContentStatesAvailable.remove(reference);
        }
        return remove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime(ControlledComposition composition, ShouldPauseCallback shouldPause, ScatterSet<RecomposeScopeImpl> invalidScopes) {
        try {
            recordComposerModifications();
            composition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(invalidScopes));
            ShouldPauseCallback andSetShouldPauseCallback = composition.getAndSetShouldPauseCallback(shouldPause);
            try {
                ControlledComposition performRecompose = performRecompose(composition, null);
                if (performRecompose != null) {
                    performInitialMovableContentInserts(composition);
                    performRecompose.applyChanges();
                    performRecompose.applyLateChanges();
                }
                ScatterSet<RecomposeScopeImpl> scatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSet == null) {
                    scatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSet;
            } finally {
                composition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime(Set<CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime(ControlledComposition composition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime(RecomposeScopeImpl scope) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.pausedScopes.get();
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSet);
        }
        mutableScatterSet.add(scope);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime(ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set set = this.compositionsRemoved;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.compositionsRemoved = set;
                }
                set.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        InterfaceC1096l<Unit> interfaceC1096l;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC1096l = deriveStateLocked();
            } else {
                interfaceC1096l = null;
            }
        }
        if (interfaceC1096l != null) {
            Result.Companion companion = Result.INSTANCE;
            interfaceC1096l.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> continuation) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        return recompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : Unit.INSTANCE;
    }

    @ExperimentalComposeApi
    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, null), continuation);
        return recompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime(ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> onEachInvalidComposition) {
        MutableScatterSet mutableScatterSet;
        int i;
        synchronized (this.stateLock) {
            int i2 = 1;
            try {
                mutableScatterSet = this.snapshotInvalidations;
                i = 0;
                if (mutableScatterSet.isNotEmpty()) {
                    this.snapshotInvalidations = new MutableScatterSet(i, i2, null);
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
        if (!wrapIntoSet.isEmpty()) {
            List knownCompositionsLocked = knownCompositionsLocked();
            int size = knownCompositionsLocked.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ControlledComposition) knownCompositionsLocked.get(i3)).recordModificationsOf(wrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        T[] tArr = mutableVector.content;
        int size2 = mutableVector.getSize();
        while (i < size2) {
            onEachInvalidComposition.invoke(tArr[i]);
            i++;
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            try {
                if (deriveStateLocked() == null) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } else {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
    }
}
