package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.ironsource.C4561o2;
import com.ironsource.C4761z5;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000Ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\f\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b'\b\u0000\u0018\u00002\u00020\u0001:\u0004Ù\u0002Ú\u0002Bí\u0001\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012Y\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012Y\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u0010\u008e\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u008f\u0001\u001a\u00020\u0014H\u0002JK\u0010\u0090\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u0091\u0001\"\u0005\b\u0001\u0010\u0092\u00012\b\u0010\u0093\u0001\u001a\u0003H\u0091\u00012\"\u0010\u0094\u0001\u001a\u001d\u0012\u0005\u0012\u0003H\u0092\u0001\u0012\u0005\u0012\u0003H\u0091\u0001\u0012\u0004\u0012\u00020\u00140\u0095\u0001¢\u0006\u0003\b\u0096\u0001H\u0016¢\u0006\u0003\u0010\u0097\u0001J\t\u0010\u0098\u0001\u001a\u00020\u0005H\u0016J5\u0010\u0099\u0001\u001a\u0003H\u0092\u0001\"\u0005\b\u0000\u0010\u0092\u00012\u0007\u0010\u009a\u0001\u001a\u00020!2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0092\u00010\u009b\u0001H\u0087\bø\u0001\u0000¢\u0006\u0003\u0010\u009c\u0001J\u0014\u0010\u009d\u0001\u001a\u00020!2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010>H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020!2\u0007\u0010\u0093\u0001\u001a\u00020!H\u0017J\u0013\u0010\u009d\u0001\u001a\u00020!2\b\u0010\u0093\u0001\u001a\u00030\u009e\u0001H\u0017J\u0013\u0010\u009d\u0001\u001a\u00020!2\b\u0010\u0093\u0001\u001a\u00030\u009f\u0001H\u0017J\u0013\u0010\u009d\u0001\u001a\u00020!2\b\u0010\u0093\u0001\u001a\u00030 \u0001H\u0017J\u0013\u0010\u009d\u0001\u001a\u00020!2\b\u0010\u0093\u0001\u001a\u00030¡\u0001H\u0017J\u0012\u0010\u009d\u0001\u001a\u00020!2\u0007\u0010\u0093\u0001\u001a\u00020%H\u0017J\u0013\u0010\u009d\u0001\u001a\u00020!2\b\u0010\u0093\u0001\u001a\u00030¢\u0001H\u0017J\u0013\u0010\u009d\u0001\u001a\u00020!2\b\u0010\u0093\u0001\u001a\u00030£\u0001H\u0017J\u000f\u0010¤\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\b¥\u0001J\t\u0010¦\u0001\u001a\u00020\u0014H\u0002J\t\u0010§\u0001\u001a\u00020\u0014H\u0002J\t\u0010¨\u0001\u001a\u00020\u0014H\u0016JG\u0010©\u0001\u001a\u00020\u00142\u001d\u0010ª\u0001\u001a\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020>\u0018\u00010¬\u00010«\u00012\u0014\u0010\u00ad\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u00140\u009b\u0001¢\u0006\u0003\b®\u0001H\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J$\u0010±\u0001\u001a\u00020%2\u0007\u0010²\u0001\u001a\u00020%2\u0007\u0010³\u0001\u001a\u00020%2\u0007\u0010´\u0001\u001a\u00020%H\u0002J'\u0010µ\u0001\u001a\u0003H\u0092\u0001\"\u0005\b\u0000\u0010\u0092\u00012\u000e\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u0003H\u0092\u00010gH\u0017¢\u0006\u0003\u0010·\u0001J\t\u0010¸\u0001\u001a\u00020\u0014H\u0002J!\u0010¹\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010\u0092\u00012\u000f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0092\u00010\u009b\u0001H\u0016J<\u0010»\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`i2\u000b\b\u0002\u0010²\u0001\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0003\u0010¼\u0001J\u0012\u0010½\u0001\u001a\u00020\u00142\u0007\u0010\u009d\u0001\u001a\u00020!H\u0017J\t\u0010¾\u0001\u001a\u00020\u0014H\u0016J\u000f\u0010¿\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0003\bÀ\u0001JF\u0010Á\u0001\u001a\u00020\u00142\u001d\u0010ª\u0001\u001a\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020>\u0018\u00010¬\u00010«\u00012\u0016\u0010\u00ad\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u009b\u0001¢\u0006\u0003\b®\u0001H\u0002¢\u0006\u0003\u0010°\u0001J\u001b\u0010Â\u0001\u001a\u00020\u00142\u0007\u0010²\u0001\u001a\u00020%2\u0007\u0010Ã\u0001\u001a\u00020%H\u0002J\t\u0010Ä\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010Å\u0001\u001a\u00020\u00142\u0007\u0010Æ\u0001\u001a\u00020!H\u0002J\t\u0010Ç\u0001\u001a\u00020\u0014H\u0017J\t\u0010È\u0001\u001a\u00020\u0014H\u0002J\t\u0010É\u0001\u001a\u00020\u0014H\u0017J\t\u0010Ê\u0001\u001a\u00020\u0014H\u0016J\t\u0010Ë\u0001\u001a\u00020\u0014H\u0017J\t\u0010Ì\u0001\u001a\u00020\u0014H\u0017J\f\u0010Í\u0001\u001a\u0005\u0018\u00010Î\u0001H\u0017J\t\u0010Ï\u0001\u001a\u00020\u0014H\u0016J\t\u0010Ð\u0001\u001a\u00020\u0014H\u0002J\t\u0010Ñ\u0001\u001a\u00020\u0014H\u0002J\u001d\u0010Ò\u0001\u001a\u00020\u00142\u0007\u0010Æ\u0001\u001a\u00020!2\t\u0010Ó\u0001\u001a\u0004\u0018\u00010kH\u0002J\u001a\u0010Ô\u0001\u001a\u00020\u00142\u0007\u0010Õ\u0001\u001a\u00020%2\u0006\u0010S\u001a\u00020!H\u0002J\t\u0010Ö\u0001\u001a\u00020\u0014H\u0002J\u000e\u0010A\u001a\u00020!H\u0000¢\u0006\u0003\b×\u0001J\"\u0010Ø\u0001\u001a\u00020\u00142\f\u0010\u0093\u0001\u001a\u0007\u0012\u0002\b\u00030Ù\u00012\t\u0010Ú\u0001\u001a\u0004\u0018\u00010>H\u0017J*\u0010Û\u0001\u001a\u00020\u00142\u001f\u0010Ü\u0001\u001a\u001a\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030ß\u0001\u0012\u0007\u0012\u0005\u0018\u00010ß\u00010Þ\u00010Ý\u0001H\u0017J\u0012\u0010à\u0001\u001a\u00020%2\u0007\u0010á\u0001\u001a\u00020%H\u0002JX\u0010â\u0001\u001a\u00020\u00142\u0010\u0010\u00ad\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010>0Ù\u00012'\u0010ã\u0001\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`i2\t\u0010Ú\u0001\u001a\u0004\u0018\u00010>2\u0007\u0010ä\u0001\u001a\u00020!H\u0002J\u001f\u0010å\u0001\u001a\u00020>2\t\u0010æ\u0001\u001a\u0004\u0018\u00010>2\t\u0010ç\u0001\u001a\u0004\u0018\u00010>H\u0017J\u000b\u0010è\u0001\u001a\u0004\u0018\u00010>H\u0001J-\u0010é\u0001\u001a\u00020%2\u0007\u0010ê\u0001\u001a\u00020%2\u0007\u0010²\u0001\u001a\u00020%2\u0007\u0010³\u0001\u001a\u00020%2\u0007\u0010ë\u0001\u001a\u00020%H\u0002J\u000f\u0010ì\u0001\u001a\u00020%H\u0000¢\u0006\u0003\bí\u0001J\u001f\u0010î\u0001\u001a\u00020\u00142\u000e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u009b\u0001H\u0000¢\u0006\u0003\bï\u0001J\t\u0010ð\u0001\u001a\u00020\u0014H\u0002J!\u0010ð\u0001\u001a\u00020\u00142\u0010\u0010ñ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010>0ò\u0001H\u0002¢\u0006\u0003\u0010ó\u0001J\t\u0010ô\u0001\u001a\u00020\u0014H\u0002J\u0014\u0010õ\u0001\u001a\u00020\u00142\t\b\u0002\u0010ö\u0001\u001a\u00020!H\u0002J\t\u0010÷\u0001\u001a\u00020\u0014H\u0002J.\u0010ø\u0001\u001a\u00020!2\u001d\u0010ª\u0001\u001a\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020>\u0018\u00010¬\u00010«\u0001H\u0000¢\u0006\u0003\bù\u0001Jv\u0010ú\u0001\u001a\u0003Hû\u0001\"\u0005\b\u0000\u0010û\u00012\u000b\b\u0002\u0010ü\u0001\u001a\u0004\u0018\u00010\u00182\u000b\b\u0002\u0010ý\u0001\u001a\u0004\u0018\u00010\u00182\u000b\b\u0002\u0010á\u0001\u001a\u0004\u0018\u00010%2%\b\u0002\u0010W\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u000206\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020>\u0018\u00010¬\u00010Þ\u00010Ý\u00012\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u0003Hû\u00010\u009b\u0001H\u0002¢\u0006\u0003\u0010þ\u0001J\t\u0010ÿ\u0001\u001a\u00020\u0014H\u0002J_\u0010\u0080\u0002\u001a\u00020\u00142T\u0010\u0081\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J_\u0010\u0082\u0002\u001a\u00020\u00142T\u0010\u0081\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010\u0083\u0002\u001a\u00020\u0014H\u0002J\u0014\u0010\u0084\u0002\u001a\u00020\u00142\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010>H\u0002J\t\u0010\u0085\u0002\u001a\u00020\u0014H\u0002J\t\u0010\u0086\u0002\u001a\u00020\u0014H\u0002J_\u0010\u0087\u0002\u001a\u00020\u00142T\u0010\u0081\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\u0012\u0010\u0088\u0002\u001a\u00020\u00142\u0007\u0010\u0089\u0002\u001a\u00020KH\u0002J_\u0010\u008a\u0002\u001a\u00020\u00142T\u0010\u0081\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J$\u0010\u008b\u0002\u001a\u00020\u00142\u0007\u0010ü\u0001\u001a\u00020%2\u0007\u0010ý\u0001\u001a\u00020%2\u0007\u0010\u008c\u0002\u001a\u00020%H\u0002J\u0012\u0010\u008d\u0002\u001a\u00020\u00142\u0007\u0010\u008e\u0002\u001a\u00020%H\u0002J\u001a\u0010\u008f\u0002\u001a\u00020\u00142\u0006\u0010c\u001a\u00020%2\u0007\u0010\u008c\u0002\u001a\u00020%H\u0002J\u0019\u0010\u0090\u0002\u001a\u00020\u00142\u000e\u0010\u0091\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140\u009b\u0001H\u0016J\t\u0010\u0092\u0002\u001a\u00020\u0014H\u0002J_\u0010\u0093\u0002\u001a\u00020\u00142T\u0010\u0081\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002Jj\u0010\u0094\u0002\u001a\u00020\u00142\t\b\u0002\u0010ö\u0001\u001a\u00020!2T\u0010\u0081\u0002\u001aO\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u0015H\u0002J\t\u0010\u0095\u0002\u001a\u00020\u0014H\u0002J$\u0010\u0096\u0002\u001a\u00020\u00142\u0007\u0010\u0097\u0002\u001a\u00020%2\u0007\u0010\u0098\u0002\u001a\u00020%2\u0007\u0010\u0099\u0002\u001a\u00020%H\u0002J\u0012\u0010\u009a\u0002\u001a\u00020\u00142\u0007\u0010\u009b\u0002\u001a\u00020yH\u0016J\t\u0010\u009c\u0002\u001a\u00020\u0014H\u0002J\u000b\u0010\u009d\u0002\u001a\u0004\u0018\u00010>H\u0016J\u0012\u0010\u009e\u0002\u001a\u00020\u00142\u0007\u0010\u009f\u0002\u001a\u00020%H\u0002JP\u0010 \u0002\u001a\u0003H\u0092\u0001\"\u0005\b\u0000\u0010\u0092\u00012\u000e\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u0003H\u0092\u00010g2'\u0010\u009b\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`iH\u0002¢\u0006\u0003\u0010¡\u0002J\t\u0010¢\u0002\u001a\u00020\u0014H\u0017J\t\u0010£\u0002\u001a\u00020\u0014H\u0002J\t\u0010¤\u0002\u001a\u00020\u0014H\u0002J\t\u0010¥\u0002\u001a\u00020\u0014H\u0017J\u0013\u0010¦\u0002\u001a\u00020\u00142\b\u0010¦\u0002\u001a\u00030§\u0002H\u0017J\t\u0010¨\u0002\u001a\u00020\u0014H\u0017J\u001c\u0010©\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%2\b\u0010¦\u0002\u001a\u00030§\u0002H\u0017J1\u0010ª\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%2\t\u0010«\u0002\u001a\u0004\u0018\u00010>2\u0007\u0010Æ\u0001\u001a\u00020!2\t\u0010¬\u0002\u001a\u0004\u0018\u00010>H\u0002J\t\u0010\u00ad\u0002\u001a\u00020\u0014H\u0017J\u0012\u0010®\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%H\u0002J\u001d\u0010®\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%2\t\u0010¯\u0002\u001a\u0004\u0018\u00010>H\u0002J\u001d\u0010°\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%2\t\u0010¯\u0002\u001a\u0004\u0018\u00010>H\u0017J\t\u0010±\u0002\u001a\u00020\u0014H\u0016J&\u0010²\u0002\u001a\u00020\u00142\u0015\u0010³\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030´\u00020ò\u0001H\u0017¢\u0006\u0003\u0010µ\u0002J\u001d\u0010¶\u0002\u001a\u00020\u00142\u0007\u0010Æ\u0001\u001a\u00020!2\t\u0010¬\u0002\u001a\u0004\u0018\u00010>H\u0002J\u0012\u0010·\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%H\u0017J\u0012\u0010¸\u0002\u001a\u00020\u00012\u0007\u0010¶\u0001\u001a\u00020%H\u0017J\u001d\u0010¹\u0002\u001a\u00020\u00142\u0007\u0010¶\u0001\u001a\u00020%2\t\u0010¯\u0002\u001a\u0004\u0018\u00010>H\u0016J\t\u0010º\u0002\u001a\u00020\u0014H\u0016J\t\u0010»\u0002\u001a\u00020\u0014H\u0002J#\u0010¼\u0002\u001a\u00020!2\u0007\u0010\u009b\u0002\u001a\u0002062\t\u0010½\u0002\u001a\u0004\u0018\u00010>H\u0000¢\u0006\u0003\b¾\u0002J\u0014\u0010¿\u0002\u001a\u00020\u00142\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010>H\u0001J(\u0010À\u0002\u001a\u00020\u00142\u0007\u0010Á\u0002\u001a\u00020%2\t\u0010¯\u0002\u001a\u0004\u0018\u00010>2\t\u0010¬\u0002\u001a\u0004\u0018\u00010>H\u0002J\u0012\u0010Â\u0002\u001a\u00020\u00142\u0007\u0010Ã\u0002\u001a\u00020%H\u0002J(\u0010Ä\u0002\u001a\u00020\u00142\u0007\u0010Á\u0002\u001a\u00020%2\t\u0010¯\u0002\u001a\u0004\u0018\u00010>2\t\u0010¬\u0002\u001a\u0004\u0018\u00010>H\u0002J\u0012\u0010Å\u0002\u001a\u00020\u00142\u0007\u0010Á\u0002\u001a\u00020%H\u0002J\u001b\u0010Æ\u0002\u001a\u00020\u00142\u0007\u0010²\u0001\u001a\u00020%2\u0007\u0010\u008c\u0002\u001a\u00020%H\u0002J\u001b\u0010Ç\u0002\u001a\u00020\u00142\u0007\u0010²\u0001\u001a\u00020%2\u0007\u0010È\u0002\u001a\u00020%H\u0002J{\u0010É\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`i2'\u0010Ê\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`i2'\u0010Ë\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`iH\u0002J\u0014\u0010Ì\u0002\u001a\u00020\u00142\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010>H\u0016J\u0014\u0010Í\u0002\u001a\u00020\u00142\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010>H\u0001J\u0012\u0010Î\u0002\u001a\u00020%2\u0007\u0010²\u0001\u001a\u00020%H\u0002J\t\u0010Ï\u0002\u001a\u00020\u0014H\u0016J\t\u0010Ð\u0002\u001a\u00020\u0014H\u0002J\t\u0010Ñ\u0002\u001a\u00020\u0014H\u0002J\u0085\u0001\u0010Ò\u0002\u001a\u0003Hû\u0001\"\u0005\b\u0000\u0010û\u00012Z\u0010Ó\u0002\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\f2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u0003Hû\u00010\u009b\u0001H\u0082\b¢\u0006\u0003\u0010Ô\u0002J1\u0010Õ\u0002\u001a\u0003Hû\u0001\"\u0005\b\u0000\u0010û\u00012\u0006\u0010v\u001a\u00020w2\u000f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u0003Hû\u00010\u009b\u0001H\u0082\b¢\u0006\u0003\u0010Ö\u0002J\u0016\u0010×\u0002\u001a\u00020%*\u00020w2\u0007\u0010²\u0001\u001a\u00020%H\u0002J\u0018\u0010Ø\u0002\u001a\u0004\u0018\u00010>*\u00020w2\u0007\u0010á\u0001\u001a\u00020%H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'Ra\u0010\u000b\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R&\u00101\u001a\u00020%2\u0006\u00100\u001a\u00020%8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b2\u00103\u001a\u0004\b4\u0010'R\u0016\u00105\u001a\u0004\u0018\u0001068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020!8VX\u0097\u0004¢\u0006\f\u0012\u0004\b:\u00103\u001a\u0004\b;\u0010#R\u0016\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010E\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bF\u0010#R\u0014\u0010G\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010#R\u000e\u0010I\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u000e¢\u0006\u0002\n\u0000Ra\u0010L\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QRa\u0010R\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150=X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010S\u001a\u00020!2\u0006\u00100\u001a\u00020!8\u0016@RX\u0097\u000e¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00103\u001a\u0004\bU\u0010#R\u0014\u0010V\u001a\b\u0012\u0004\u0012\u0002060=X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010Y\u001a\u00020!2\u0006\u00100\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010#R\u001e\u0010[\u001a\u00020!2\u0006\u00100\u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010#Ra\u0010\u0016\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rj\u0002`\u00150\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010_\u001a\"\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010`j\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u0001`aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`iX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010k0=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010r\u001a&\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h\u0018\u00010fj\u0004\u0018\u0001`iX\u0082\u000e¢\u0006\u0002\n\u0000Rj\u0010s\u001a^\u0012\u0004\u0012\u00020%\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`i0`j.\u0012\u0004\u0012\u00020%\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0g\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010>0h0fj\u0002`i`aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020wX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010x\u001a\u0004\u0018\u00010y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0016\u0010|\u001a\u0004\u0018\u00010>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u000e\u0010\u007f\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0081\u0001\u001a\u00020!8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u00103\u001a\u0005\b\u0083\u0001\u0010#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010>*\u00020w8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Û\u0002"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "applier", "Landroidx/compose/runtime/Applier;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "changes", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "", "Landroidx/compose/runtime/Change;", "lateChanges", "composition", "Landroidx/compose/runtime/ControlledComposition;", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "getApplier", "()Landroidx/compose/runtime/Applier;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "areChildrenComposing", "", "getAreChildrenComposing$runtime_release", "()Z", "changeCount", "", "getChangeCount$runtime_release", "()I", "childrenComposing", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionToken", "<set-?>", "compoundKeyHash", "getCompoundKeyHash$annotations", "()V", "getCompoundKeyHash", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "defaultsInvalid", "getDefaultsInvalid$annotations", "getDefaultsInvalid", "downNodes", "Landroidx/compose/runtime/Stack;", "", "entersStack", "Landroidx/compose/runtime/IntStack;", "forceRecomposeScopes", "forciblyRecompose", "groupNodeCount", "groupNodeCountStack", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges$runtime_release", "implicitRootStart", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "insertUpFixups", "inserting", "getInserting$annotations", "getInserting", "invalidateStack", "invalidations", "Landroidx/compose/runtime/Invalidation;", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "nodeCountOverrides", "", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeExpected", "nodeIndex", "nodeIndexStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "pending", "Landroidx/compose/runtime/Pending;", "pendingStack", "pendingUps", "previousCount", "previousMoveFrom", "previousMoveTo", "previousRemove", "providerCache", "providerUpdates", "providersInvalid", "providersInvalidStack", "reader", "Landroidx/compose/runtime/SlotReader;", "recomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScopeIdentity", "getRecomposeScopeIdentity", "()Ljava/lang/Object;", "reusing", "reusingGroup", "skipping", "getSkipping$annotations", "getSkipping", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "startedGroup", "startedGroups", "writer", "writerHasAProvider", "writersReaderDelta", "node", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "abortRoot", "addRecomposeScope", "apply", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "buildContext", "cache", "invalid", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "changed", "", "", "", "", "", "", "changesApplied", "changesApplied$runtime_release", "cleanUpCompose", "clearUpdatedNodeCounts", "collectParameterInformation", "composeContent", "invalidationsRequested", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "content", "Landroidx/compose/runtime/Composable;", "composeContent$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "compoundKeyOf", "group", "recomposeGroup", "recomposeKey", "consume", "key", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "createFreshInsertTable", "createNode", "factory", "currentCompositionLocalScope", "(Ljava/lang/Integer;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "deactivateToEndGroup", "disableReusing", "dispose", "dispose$runtime_release", "doCompose", "doRecordDownsFor", "nearestCommonRoot", "enableReusing", "end", "isNode", "endDefaults", "endGroup", "endMovableGroup", "endNode", "endProviders", "endReplaceableGroup", "endRestartGroup", "Landroidx/compose/runtime/ScopeUpdateScope;", "endReusableGroup", "endRoot", "ensureWriter", "enterGroup", "newPending", "exitGroup", "expectedNodeCount", "finalizeCompose", "forceRecomposeScopes$runtime_release", "insertMovableContent", "Landroidx/compose/runtime/MovableContent;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "insertMovableContentReferences", "references", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertedGroupVirtualIndex", "index", "invokeMovableContentLambda", "locals", "force", "joinKey", "left", "right", "nextSlot", "nodeIndexOf", "groupLocation", "recomposeIndex", "parentKey", "parentKey$runtime_release", "prepareCompose", "prepareCompose$runtime_release", "realizeDowns", "nodes", "", "([Ljava/lang/Object;)V", "realizeMovement", "realizeOperationLocation", "forParent", "realizeUps", "recompose", "recompose$runtime_release", "recomposeMovableContent", "R", Constants.MessagePayloadKeys.FROM, "to", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "recomposeToGroupEnd", "record", "change", "recordApplierOperation", "recordDelete", "recordDown", "recordEndGroup", "recordEndRoot", "recordFixup", "recordInsert", LinkHeader.Parameters.Anchor, "recordInsertUpFixup", "recordMoveNode", "count", "recordReaderMoving", FirebaseAnalytics.Param.LOCATION, "recordRemoveNode", "recordSideEffect", "effect", "recordSlotEditing", "recordSlotEditingOperation", "recordSlotTableOperation", "recordUp", "recordUpsAndDowns", "oldGroup", "newGroup", "commonRoot", "recordUsed", "scope", "registerInsertUpFixup", "rememberedValue", "reportFreeMovableContent", "groupBeingRemoved", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "skipCurrentGroup", "skipGroup", "skipReaderToGroupEnd", "skipToGroupEnd", "sourceInformation", "", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "start", "objectKey", "data", "startDefaults", "startGroup", "dataKey", "startMovableGroup", "startNode", "startProviders", "values", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;)V", "startReaderGroup", "startReplaceableGroup", "startRestartGroup", "startReusableGroup", "startReusableNode", "startRoot", "tryImminentInvalidation", C4561o2.p, "tryImminentInvalidation$runtime_release", "updateCachedValue", "updateCompoundKeyWhenWeEnterGroup", "groupKey", "updateCompoundKeyWhenWeEnterGroupKeyHash", "keyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "updateNodeCount", "updateNodeCountOverrides", "newCount", "updateProviderMapGroup", "parentScope", "currentProviders", "updateRememberedValue", "updateValue", "updatedNodeCount", "useNode", "validateNodeExpected", "validateNodeNotExpected", "withChanges", "newChanges", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "groupCompoundKeyPart", "nodeAt", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private Stack<Object> downNodes;
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private IntStack groupNodeCountStack;
    private boolean implicitRootStart;
    private Anchor insertAnchor;
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertFixups;
    private SlotTable insertTable;
    private final Stack<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertUpFixups;
    private boolean inserting;
    private final Stack<RecomposeScopeImpl> invalidateStack;
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;
    private int[] nodeCountOverrides;
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private IntStack nodeIndexStack;
    private final CompositionContext parentContext;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider;
    private Pending pending;
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> providerCache;
    private final HashMap<Integer, PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates;
    private boolean providersInvalid;
    private final IntStack providersInvalidStack;
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;
    private final SlotTable slotTable;
    private Snapshot snapshot;
    private boolean startedGroup;
    private final IntStack startedGroups;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    public ComposerImpl(Applier<?> applier, CompositionContext parentContext, SlotTable slotTable, Set<RememberObserver> abandonSet, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes, List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges, ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(lateChanges, "lateChanges");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.applier = applier;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = abandonSet;
        this.changes = changes;
        this.lateChanges = lateChanges;
        this.composition = composition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new HashMap<>();
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.invalidateStack = new Stack<>();
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close();
        this.writer = openWriter;
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    /* renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    /* renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "<set-?>");
        this.insertTable = slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        start(key, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        start(RangingPosition.RSSI_MIN, null, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, Object dataKey) {
        start(key, dataKey, false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        int asInt;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        this.reader.close();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    public final void dispose$runtime_release() {
        Object beginSection = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(beginSection);
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    private final void startGroup(int key) {
        start(key, null, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroup(int key, Object dataKey) {
        start(key, dataKey, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        boolean inserting = getInserting();
        int i = Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        if (!inserting && (!this.reusing ? this.reader.getGroupKey() == 126 : this.reader.getGroupKey() == 125)) {
            i = 126;
        }
        start(i, null, true, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        start(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, true, null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(final Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        validateNodeExpected();
        if (getInserting()) {
            final int peek = this.nodeIndexStack.peek();
            SlotWriter slotWriter = this.writer;
            final Anchor anchor = slotWriter.anchor(slotWriter.getParent());
            this.groupNodeCount++;
            recordFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$createNode$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                    invoke2(applier, slotWriter2, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    Object invoke = factory.invoke();
                    slots.updateNode(anchor, invoke);
                    applier.insertTopDown(peek, invoke);
                    applier.down(invoke);
                }
            });
            recordInsertUpFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$createNode$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                    invoke2(applier, slotWriter2, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    Object node = slots.node(Anchor.this);
                    applier.up();
                    applier.insertBottomUp(peek, node);
                }
            });
            return;
        }
        ComposerKt.composeRuntimeError("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (!getInserting()) {
            recordDown(getNode(this.reader));
        } else {
            ComposerKt.composeRuntimeError("useNode() called while inserting".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, Object dataKey) {
        if (this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        start(key, null, false, dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(final V value, final Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Function3<Applier<?>, SlotWriter, RememberManager, Unit> function3 = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                block.invoke(applier.getCurrent(), value);
            }
        };
        if (getInserting()) {
            recordFixup(function3);
        } else {
            recordApplierOperation(function3);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object left, Object right) {
        Object key;
        key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    public final Object nextSlot() {
        if (!getInserting()) {
            return this.reusing ? Composer.INSTANCE.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.INSTANCE.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object value) {
        if (Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Character) && value == ((Character) nextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Byte) && value == ((Number) nextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Short) && value == ((Number) nextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && value == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && value == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && value == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Double) && value == ((Number) nextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && value == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) nextSlot();
        if (t != Composer.INSTANCE.getEmpty() && !invalid) {
            return t;
        }
        T invoke = block.invoke();
        updateValue(invoke);
        return invoke;
    }

    public final void updateValue(final Object value) {
        if (getInserting()) {
            this.writer.update(value);
            if (value instanceof RememberObserver) {
                record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$updateValue$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                        rememberManager.remembering((RememberObserver) value);
                    }
                });
                this.abandonSet.add(value);
                return;
            }
            return;
        }
        final int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
        if (value instanceof RememberObserver) {
            this.abandonSet.add(value);
        }
        recordSlotTableOperation(true, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$updateValue$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                RecomposeScopeImpl recomposeScopeImpl;
                CompositionImpl composition;
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                Object obj = value;
                if (obj instanceof RememberObserver) {
                    rememberManager.remembering((RememberObserver) obj);
                }
                Object obj2 = slots.set(groupSlotIndex, value);
                if (obj2 instanceof RememberObserver) {
                    rememberManager.forgetting((RememberObserver) obj2);
                } else {
                    if (!(obj2 instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) obj2).getComposition()) == null) {
                        return;
                    }
                    recomposeScopeImpl.release();
                    composition.setPendingInvalidScopes$runtime_release(true);
                }
            }
        });
    }

    public final void updateCachedValue(Object value) {
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(final Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$recordSideEffect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                rememberManager.sideEffect(effect);
            }
        });
    }

    static /* synthetic */ PersistentMap currentCompositionLocalScope$default(ComposerImpl composerImpl, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return composerImpl.currentCompositionLocalScope(num);
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope(Integer group) {
        PersistentMap persistentMap;
        if (group == null && (persistentMap = this.providerCache) != null) {
            return persistentMap;
        }
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    if (groupAux == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    }
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) groupAux;
                    this.providerCache = persistentMap2;
                    return persistentMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            int intValue = group != null ? group.intValue() : this.reader.getParent();
            while (intValue > 0) {
                if (this.reader.groupKey(intValue) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(intValue), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap3 = this.providerUpdates.get(Integer.valueOf(intValue));
                    if (persistentMap3 == null) {
                        Object groupAux2 = this.reader.groupAux(intValue);
                        if (groupAux2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        }
                        persistentMap3 = (PersistentMap) groupAux2;
                    }
                    this.providerCache = persistentMap3;
                    return persistentMap3;
                }
                intValue = this.reader.parent(intValue);
            }
        }
        PersistentMap persistentMap4 = this.parentProvider;
        this.providerCache = persistentMap4;
        return persistentMap4;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(final ProvidedValue<?>[] values) {
        PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup;
        boolean z;
        int asInt;
        Intrinsics.checkNotNullParameter(values, "values");
        final PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentCompositionLocalScope$default = currentCompositionLocalScope$default(this, null, 1, null);
        startGroup(201, ComposerKt.getProvider());
        startGroup(203, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ActualJvm_jvmKt.invokeComposableForResult(this, new Function2<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(Composer composer, int i) {
                PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf;
                composer.startReplaceableGroup(935231726);
                ComposerKt.sourceInformation(composer, "C1872@69334L42:Composer.kt#9igjgp");
                compositionLocalMapOf = ComposerKt.compositionLocalMapOf(values, currentCompositionLocalScope$default, composer, 8);
                composer.endReplaceableGroup();
                return compositionLocalMapOf;
            }
        });
        endGroup();
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope$default, persistentMap);
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            if (groupGet == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            if (groupGet2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            }
            PersistentMap persistentMap3 = (PersistentMap) groupGet2;
            if (!getSkipping() || !Intrinsics.areEqual(persistentMap3, persistentMap)) {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope$default, persistentMap);
                z = !Intrinsics.areEqual(updateProviderMapGroup, persistentMap2);
                if (z && !getInserting()) {
                    this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), updateProviderMapGroup);
                }
                IntStack intStack = this.providersInvalidStack;
                asInt = ComposerKt.asInt(this.providersInvalid);
                intStack.push(asInt);
                this.providersInvalid = z;
                this.providerCache = updateProviderMapGroup;
                start(202, ComposerKt.getCompositionLocalMap(), false, updateProviderMapGroup);
            }
            skipGroup();
            updateProviderMapGroup = persistentMap2;
        }
        z = false;
        if (z) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), updateProviderMapGroup);
        }
        IntStack intStack2 = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack2.push(asInt);
        this.providersInvalid = z;
        this.providerCache = updateProviderMapGroup;
        start(202, ComposerKt.getCompositionLocalMap(), false, updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope$default(this, null, 1, null));
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        Object nextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = nextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope$default(this, null, 1, null));
        endGroup();
        return compositionContextHolder.getRef();
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> key, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
        if (ComposerKt.contains(scope, key)) {
            return (T) ComposerKt.getValueOf(scope, key);
        }
        return key.getDefaultValueHolder$runtime_release().getValue();
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close();
        this.writer = openWriter;
    }

    private final void startReaderGroup(boolean isNode, final Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$startReaderGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.updateAux(data);
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    private final void start(int key, Object objectKey, boolean isNode, Object data) {
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(key, objectKey, data);
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (isNode) {
                this.writer.startNode(Composer.INSTANCE.getEmpty());
            } else if (data != null) {
                SlotWriter slotWriter = this.writer;
                if (objectKey == null) {
                    objectKey = Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(key, objectKey, data);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (objectKey == null) {
                    objectKey = Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(key, objectKey);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(isNode, null);
            return;
        }
        if (this.pending == null) {
            if (this.reader.getGroupKey() == key && Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey())) {
                startReaderGroup(isNode, data);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(key, objectKey);
            if (next != null) {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int slotPositionOf = pending3.slotPositionOf(next);
                final int groupIndex = slotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$start$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter3, RememberManager rememberManager) {
                            invoke2(applier, slotWriter3, rememberManager);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slots, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                            slots.moveGroup(groupIndex);
                        }
                    });
                }
                startReaderGroup(isNode, data);
            } else {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (isNode) {
                    this.writer.startNode(Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (objectKey == null) {
                        objectKey = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(key, objectKey, data);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (objectKey == null) {
                        objectKey = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(key, objectKey);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), isNode ? 0 : this.nodeIndex);
            }
        }
        enterGroup(isNode, pending);
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        this.pendingStack.push(this.pending);
        this.pending = newPending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pop = this.pendingStack.pop();
        if (pop != null && !inserting) {
            pop.setGroupIndex(pop.getGroupIndex() + 1);
        }
        this.pending = pop;
        this.nodeIndex = this.nodeIndexStack.pop() + expectedNodeCount;
        this.groupNodeCount = this.groupNodeCountStack.pop() + expectedNodeCount;
    }

    private final void end(boolean isNode) {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        int i2 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set fastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = keyInfos.get(i3);
                if (!fastToSet.contains(keyInfo)) {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i2);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i4 < size) {
                        KeyInfo keyInfo2 = used.get(i4);
                        if (keyInfo2 != keyInfo) {
                            int nodePositionOf = pending.nodePositionOf(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (nodePositionOf != i5) {
                                int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                list = used;
                                recordMoveNode(pending.getStartIndex() + nodePositionOf, i5 + pending.getStartIndex(), updatedNodeCountOf);
                                pending.registerMoveNode(nodePositionOf, i5, updatedNodeCountOf);
                            } else {
                                list = used;
                            }
                        } else {
                            list = used;
                            i3++;
                        }
                        i4++;
                        i5 += pending.updatedNodeCountOf(keyInfo2);
                        used = list;
                    }
                    i2 = 0;
                }
                i3++;
                i2 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i6 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            recordRemoveNode(i6, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                registerInsertUpFixup();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (isNode) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i2 = this.groupNodeCount;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        boolean z2 = false;
        int i3 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i3, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(currentGroup), parent, compoundKeyHash);
                this.providerCache = null;
                firstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i3 = currentGroup;
                z2 = true;
            } else {
                this.invalidateStack.push(firstInRange.getScope());
                firstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i3, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z;
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int updatedNodeCount = updatedNodeCount(group);
        if (updatedNodeCount != newCount) {
            int i = newCount - updatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (group != -1) {
                int updatedNodeCount2 = updatedNodeCount(group) + i;
                updateNodeCount(group, updatedNodeCount2);
                int i2 = size;
                while (true) {
                    if (-1 < i2) {
                        Pending peek = this.pendingStack.peek(i2);
                        if (peek != null && peek.updateNodeCount(group, updatedNodeCount2)) {
                            size = i2 - 1;
                            break;
                        }
                        i2--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int parent = this.reader.parent(group);
        while (parent != recomposeGroup && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            recomposeIndex = 0;
        }
        if (parent == group) {
            return recomposeIndex;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < updatedNodeCount && parent != groupLocation) {
            parent++;
            while (parent < groupLocation) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (groupLocation >= groupSize) {
                    recomposeIndex += updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int updatedNodeCount(int group) {
        int i;
        Integer num;
        if (group < 0) {
            HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
            if (hashMap == null || (num = hashMap.get(Integer.valueOf(group))) == null) {
                return 0;
            }
            return num.intValue();
        }
        int[] iArr = this.nodeCountOverrides;
        return (iArr == null || (i = iArr[group]) < 0) ? this.reader.nodeCount(group) : i;
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                HashMap<Integer, Integer> hashMap = this.nodeCountVirtualOverrides;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.nodeCountVirtualOverrides = hashMap;
                }
                hashMap.put(Integer.valueOf(group), Integer.valueOf(count));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                ArraysKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != nearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                recordUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, nearestCommonRootOf);
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            recordDown(nodeAt(this.reader, group));
        }
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int groupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
        return groupCompoundKeyPart == 126665345 ? groupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ groupCompoundKeyPart;
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i) {
        Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey != null) {
                return groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : groupObjectKey.hashCode();
            }
            return 0;
        }
        int groupKey = slotReader.groupKey(i);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i)) != null && !Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl scope, Object instance) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (this.groupNodeCount == 0) {
            RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
            if (currentRecomposeScope$runtime_release != null) {
                currentRecomposeScope$runtime_release.scopeSkipped();
            }
            if (this.invalidations.isEmpty()) {
                skipReaderToGroupEnd();
                return;
            } else {
                recomposeToGroupEnd();
                return;
            }
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (this.groupNodeCount == 0) {
            if (getInserting()) {
                return;
            }
            if (!changed) {
                skipReaderToGroupEnd();
                return;
            }
            int currentGroup = this.reader.getCurrentGroup();
            int currentEnd = this.reader.getCurrentEnd();
            for (final int i = currentGroup; i < currentEnd; i++) {
                this.reader.forEachData$runtime_release(i, new Function2<Integer, Object, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Object obj) {
                        invoke(num.intValue(), obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(final int i2, final Object obj) {
                        if (obj instanceof RememberObserver) {
                            ComposerImpl.this.reader.reposition(i);
                            ComposerImpl composerImpl = ComposerImpl.this;
                            final int i3 = i;
                            ComposerImpl.recordSlotTableOperation$default(composerImpl, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    invoke2(applier, slotWriter, rememberManager);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                                    Intrinsics.checkNotNullParameter(slots, "slots");
                                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                    if (Intrinsics.areEqual(obj, slots.slot(i3, i2))) {
                                        rememberManager.forgetting((RememberObserver) obj);
                                        slots.set(i2, Composer.INSTANCE.getEmpty());
                                    } else {
                                        ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                                        throw new KotlinNothingValueException();
                                    }
                                }
                            }, 1, null);
                            return;
                        }
                        if (obj instanceof RecomposeScopeImpl) {
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            CompositionImpl composition = recomposeScopeImpl.getComposition();
                            if (composition != null) {
                                composition.setPendingInvalidScopes$runtime_release(true);
                                recomposeScopeImpl.release();
                            }
                            ComposerImpl.this.reader.reposition(i);
                            ComposerImpl composerImpl2 = ComposerImpl.this;
                            final int i4 = i;
                            ComposerImpl.recordSlotTableOperation$default(composerImpl2, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$deactivateToEndGroup$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    invoke2(applier, slotWriter, rememberManager);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                                    Intrinsics.checkNotNullParameter(slots, "slots");
                                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                                    if (Intrinsics.areEqual(obj, slots.slot(i4, i2))) {
                                        slots.set(i2, Composer.INSTANCE.getEmpty());
                                    } else {
                                        ComposerKt.composeRuntimeError("Slot table is out of sync".toString());
                                        throw new KotlinNothingValueException();
                                    }
                                }
                            }, 1, null);
                        }
                    }
                });
            }
            ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
            this.reader.reposition(currentGroup);
            this.reader.skipToGroupEnd();
            return;
        }
        ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int key) {
        start(key, null, false, null);
        addRecomposeScope();
        return this;
    }

    private final void addRecomposeScope() {
        Invalidation removeLocation;
        RecomposeScopeImpl recomposeScopeImpl;
        if (!getInserting()) {
            removeLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
            Object next = this.reader.next();
            if (Intrinsics.areEqual(next, Composer.INSTANCE.getEmpty())) {
                recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) getComposition());
                updateValue(recomposeScopeImpl);
            } else if (next != null) {
                recomposeScopeImpl = (RecomposeScopeImpl) next;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            }
            recomposeScopeImpl.setRequiresRecompose(removeLocation != null);
            this.invalidateStack.push(recomposeScopeImpl);
            recomposeScopeImpl.start(this.compositionToken);
            return;
        }
        RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) getComposition());
        this.invalidateStack.push(recomposeScopeImpl2);
        updateValue(recomposeScopeImpl2);
        recomposeScopeImpl2.start(this.compositionToken);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        final Function1<Composition, Unit> end;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl pop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (pop != null) {
            pop.setRequiresRecompose(false);
        }
        if (pop != null && (end = pop.end(this.compositionToken)) != null) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    end.invoke(this.getComposition());
                }
            });
        }
        if (pop != null && !pop.getSkipped$runtime_release() && (pop.getUsed() || this.forceRecomposeScopes)) {
            if (pop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                pop.setAnchor(anchor);
            }
            pop.setDefaultsInvalid(false);
            recomposeScopeImpl = pop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(MovableContent<?> value, Object parameter) {
        Intrinsics.checkNotNullParameter(value, "value");
        invokeMovableContentLambda(value, currentCompositionLocalScope$default(this, null, 1, null), parameter, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(final MovableContent<Object> content, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> locals, final Object parameter, boolean force) {
        startMovableGroup(MovableContentKt.movableContentKey, content);
        changed(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        this.compoundKeyHash = MovableContentKt.movableContentKey;
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        boolean z = (getInserting() || Intrinsics.areEqual(this.reader.getGroupAux(), locals)) ? false : true;
        if (z) {
            this.providerUpdates.put(Integer.valueOf(this.reader.getCurrentGroup()), locals);
        }
        start(202, ComposerKt.getCompositionLocalMap(), false, locals);
        if (getInserting() && !force) {
            this.writerHasAProvider = true;
            this.providerCache = null;
            SlotWriter slotWriter = this.writer;
            this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt.emptyList(), currentCompositionLocalScope$default(this, null, 1, null)));
        } else {
            boolean z2 = this.providersInvalid;
            this.providersInvalid = z;
            ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(1378964644, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    ComposerKt.sourceInformation(composer, "C2821@107760L18:Composer.kt#9igjgp");
                    if ((i & 11) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        content.getContent().invoke(parameter, composer, 8);
                    }
                }
            }));
            this.providersInvalid = z2;
        }
        endGroup();
        this.compoundKeyHash = compoundKeyHash;
        endMovableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertMovableContentReferences$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i) {
        while (!slotWriter.indexInParent(i)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private static final int insertMovableContentReferences$currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i = parent + 1;
        int i2 = 0;
        while (i < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i)) {
                if (slotWriter.isNode(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += slotWriter.isNode(i) ? 1 : slotWriter.nodeCount(i);
                i += slotWriter.groupSize(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int insertMovableContentReferences$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int anchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < anchorIndex);
        insertMovableContentReferences$positionToParentOf(slotWriter, applier, anchorIndex);
        int insertMovableContentReferences$currentNodeIndex = insertMovableContentReferences$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    insertMovableContentReferences$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                insertMovableContentReferences$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == anchorIndex);
        return insertMovableContentReferences$currentNodeIndex;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3;
        final List collectNodesFrom;
        final SlotReader openReader;
        List list;
        int i;
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function32;
        Intrinsics.checkNotNullParameter(references, "references");
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list2 = this.lateChanges;
        List list3 = this.changes;
        try {
            this.changes = list2;
            function3 = ComposerKt.resetSlotsInstance;
            record(function3);
            int size = references.size();
            int i2 = 0;
            while (i2 < size) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = references.get(i2);
                final MovableContentStateReference component1 = pair.component1();
                final MovableContentStateReference component2 = pair.component2();
                final Anchor anchor = component1.getAnchor();
                int anchorIndex = component1.getSlotTable().anchorIndex(anchor);
                final Ref.IntRef intRef = new Ref.IntRef();
                realizeUps();
                record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                        int insertMovableContentReferences$positionToInsert;
                        Intrinsics.checkNotNullParameter(applier, "applier");
                        Intrinsics.checkNotNullParameter(slots, "slots");
                        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                        Ref.IntRef intRef2 = Ref.IntRef.this;
                        insertMovableContentReferences$positionToInsert = ComposerImpl.insertMovableContentReferences$positionToInsert(slots, anchor, applier);
                        intRef2.element = insertMovableContentReferences$positionToInsert;
                    }
                });
                if (component2 != null) {
                    collectNodesFrom = ComposerKt.collectNodesFrom(component2.getSlotTable(), component2.getAnchor());
                    if (!collectNodesFrom.isEmpty()) {
                        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "applier");
                                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                                int i3 = Ref.IntRef.this.element;
                                List<Object> list4 = collectNodesFrom;
                                int size2 = list4.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Object obj = list4.get(i4);
                                    int i5 = i3 + i4;
                                    applier.insertBottomUp(i5, obj);
                                    applier.insertTopDown(i5, obj);
                                }
                            }
                        });
                        int anchorIndex2 = this.slotTable.anchorIndex(anchor);
                        updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                    }
                    record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            invoke2(applier, slotWriter, rememberManager);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slots, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                            MovableContentState movableContentStateResolve$runtime_release = ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(component2);
                            if (movableContentStateResolve$runtime_release == null) {
                                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                                throw new KotlinNothingValueException();
                            }
                            List<Anchor> moveIntoGroupFrom = slots.moveIntoGroupFrom(1, movableContentStateResolve$runtime_release.getSlotTable(), 1);
                            if (moveIntoGroupFrom.isEmpty()) {
                                return;
                            }
                            CompositionImpl compositionImpl = (CompositionImpl) component1.getComposition();
                            int size2 = moveIntoGroupFrom.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                Object slot = slots.slot(moveIntoGroupFrom.get(i3), 0);
                                RecomposeScopeImpl recomposeScopeImpl = slot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) slot : null;
                                if (recomposeScopeImpl != null) {
                                    recomposeScopeImpl.adoptedBy(compositionImpl);
                                }
                            }
                        }
                    });
                    SlotTable slotTable = component2.getSlotTable();
                    openReader = slotTable.openReader();
                    try {
                        SlotReader slotReader = this.reader;
                        int[] iArr = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        try {
                            this.reader = openReader;
                            int anchorIndex3 = slotTable.anchorIndex(component2.getAnchor());
                            openReader.reposition(anchorIndex3);
                            this.writersReaderDelta = anchorIndex3;
                            final ArrayList arrayList = new ArrayList();
                            List list4 = this.changes;
                            try {
                                this.changes = arrayList;
                                i = size;
                                list = list4;
                                try {
                                    recomposeMovableContent(component2.getComposition(), component1.getComposition(), Integer.valueOf(openReader.getCurrentGroup()), component2.getInvalidations$runtime_release(), new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            ComposerImpl.this.invokeMovableContentLambda(component1.getContent$runtime_release(), component1.getLocals$runtime_release(), component1.getParameter(), true);
                                        }
                                    });
                                    Unit unit = Unit.INSTANCE;
                                    this.changes = list;
                                    if (!arrayList.isEmpty()) {
                                        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$5$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                                invoke2(applier, slotWriter, rememberManager);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                                Intrinsics.checkNotNullParameter(applier, "applier");
                                                Intrinsics.checkNotNullParameter(slots, "slots");
                                                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                                if (Ref.IntRef.this.element > 0) {
                                                    applier = new OffsetApplier(applier, Ref.IntRef.this.element);
                                                }
                                                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list5 = arrayList;
                                                int size2 = list5.size();
                                                for (int i3 = 0; i3 < size2; i3++) {
                                                    list5.get(i3).invoke(applier, slots, rememberManager);
                                                }
                                            }
                                        });
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    this.reader = slotReader;
                                    this.nodeCountOverrides = iArr;
                                    Unit unit3 = Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    this.changes = list;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list = list4;
                            }
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    if (Intrinsics.areEqual(component1.getSlotTable(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    openReader = component1.getSlotTable().openReader();
                    try {
                        openReader.reposition(anchorIndex);
                        this.writersReaderDelta = anchorIndex;
                        final ArrayList arrayList2 = new ArrayList();
                        recomposeMovableContent$default(this, null, null, null, null, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ComposerImpl composerImpl = ComposerImpl.this;
                                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list5 = arrayList2;
                                SlotReader slotReader2 = openReader;
                                MovableContentStateReference movableContentStateReference = component1;
                                List list6 = composerImpl.changes;
                                try {
                                    composerImpl.changes = list5;
                                    SlotReader slotReader3 = composerImpl.reader;
                                    int[] iArr2 = composerImpl.nodeCountOverrides;
                                    composerImpl.nodeCountOverrides = null;
                                    try {
                                        composerImpl.reader = slotReader2;
                                        composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter(), true);
                                        Unit unit4 = Unit.INSTANCE;
                                        composerImpl.reader = slotReader3;
                                        composerImpl.nodeCountOverrides = iArr2;
                                        Unit unit5 = Unit.INSTANCE;
                                    } catch (Throwable th3) {
                                        composerImpl.reader = slotReader3;
                                        composerImpl.nodeCountOverrides = iArr2;
                                        throw th3;
                                    }
                                } finally {
                                    composerImpl.changes = list6;
                                }
                            }
                        }, 15, null);
                        if (!arrayList2.isEmpty()) {
                            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    invoke2(applier, slotWriter, rememberManager);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                                    Intrinsics.checkNotNullParameter(applier, "applier");
                                    Intrinsics.checkNotNullParameter(slots, "slots");
                                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                    if (Ref.IntRef.this.element > 0) {
                                        applier = new OffsetApplier(applier, Ref.IntRef.this.element);
                                    }
                                    List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list5 = arrayList2;
                                    int size2 = list5.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        list5.get(i3).invoke(applier, slots, rememberManager);
                                    }
                                }
                            });
                        }
                        Unit unit4 = Unit.INSTANCE;
                        openReader.close();
                        i = size;
                    } finally {
                    }
                }
                function32 = ComposerKt.skipToGroupEndInstance;
                record(function32);
                i2++;
                size = i;
            }
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentReferences$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    ComposerImpl.insertMovableContentReferences$positionToParentOf(slots, applier, 0);
                    slots.endGroup();
                }
            });
            this.writersReaderDelta = 0;
            Unit unit5 = Unit.INSTANCE;
            this.changes = list3;
            cleanUpCompose();
        } catch (Throwable th3) {
            this.changes = list3;
            throw th3;
        }
    }

    private final <R> R withChanges(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> newChanges, Function0<? extends R> block) {
        List list = this.changes;
        try {
            this.changes = newChanges;
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.changes = list;
            InlineMarker.finallyEnd(1);
        }
    }

    private final <R> R withReader(SlotReader reader, Function0<? extends R> block) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = reader;
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
            InlineMarker.finallyEnd(1);
        }
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i, Object obj) {
        ControlledComposition controlledComposition3 = (i & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r9 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <R> R recomposeMovableContent(ControlledComposition from, ControlledComposition to, Integer index, List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations, Function0<? extends R> block) {
        R invoke;
        boolean z = this.implicitRootStart;
        boolean z2 = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<RecomposeScopeImpl, IdentityArraySet<Object>> pair = invalidations.get(i2);
                RecomposeScopeImpl component1 = pair.component1();
                IdentityArraySet<Object> component2 = pair.component2();
                if (component2 == null) {
                    tryImminentInvalidation$runtime_release(component1, null);
                } else {
                    Iterator<Object> it = component2.iterator();
                    while (it.hasNext()) {
                        tryImminentInvalidation$runtime_release(component1, it.next());
                    }
                }
            }
            if (from != null) {
                invoke = (R) from.delegateInvalidations(to, index != null ? index.intValue() : -1, block);
            }
            invoke = block.invoke();
            return invoke;
        } finally {
            this.implicitRootStart = z;
            this.isComposing = z2;
            this.nodeIndex = i;
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (getInserting()) {
            this.writer.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        start(key, null, false, sourceInformation);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        end(false);
    }

    public final void composeContent$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void prepareCompose$runtime_release(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!this.isComposing) {
            this.isComposing = true;
            try {
                block.invoke();
                return;
            } finally {
                this.isComposing = false;
            }
        }
        ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean recompose$runtime_release(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (this.changes.isEmpty()) {
            if (!invalidationsRequested.isNotEmpty() && this.invalidations.isEmpty() && !this.forciblyRecompose) {
                return false;
            }
            doCompose(invalidationsRequested, null);
            return !this.changes.isEmpty();
        }
        ComposerKt.composeRuntimeError("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    private final void doCompose(IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, final Function2<? super Composer, ? super Integer, Unit> content) {
        if (!this.isComposing) {
            Object beginSection = Trace.INSTANCE.beginSection("Compose:recompose");
            try {
                Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
                this.snapshot = currentSnapshot;
                this.compositionToken = currentSnapshot.getId();
                this.providerUpdates.clear();
                int size = invalidationsRequested.getSize();
                for (int i = 0; i < size; i++) {
                    Object obj = invalidationsRequested.getKeys()[i];
                    if (obj != null) {
                        IdentityArraySet identityArraySet = (IdentityArraySet) invalidationsRequested.getValues()[i];
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        Anchor anchor = recomposeScopeImpl.getAnchor();
                        if (anchor == null) {
                            return;
                        }
                        this.invalidations.add(new Invalidation(recomposeScopeImpl, anchor.getLocation(), identityArraySet));
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    }
                }
                List<Invalidation> list = this.invalidations;
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$lambda-37$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Integer.valueOf(((Invalidation) t).getLocation()), Integer.valueOf(((Invalidation) t2).getLocation()));
                        }
                    });
                }
                this.nodeIndex = 0;
                this.isComposing = true;
                try {
                    startRoot();
                    final Object nextSlot = nextSlot();
                    if (nextSlot != content && content != null) {
                        updateValue(content);
                    }
                    SnapshotStateKt.observeDerivedStateRecalculations(new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                            invoke2(state);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(State<?> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ComposerImpl.this.childrenComposing++;
                        }
                    }, new Function1<State<?>, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(State<?> state) {
                            invoke2(state);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(State<?> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ComposerImpl composerImpl = ComposerImpl.this;
                            composerImpl.childrenComposing--;
                        }
                    }, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$doCompose$2$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            boolean z;
                            Object obj2;
                            if (content != null) {
                                this.startGroup(200, ComposerKt.getInvocation());
                                ActualJvm_jvmKt.invokeComposable(this, content);
                                this.endGroup();
                                return;
                            }
                            z = this.forciblyRecompose;
                            if (z && (obj2 = nextSlot) != null && !Intrinsics.areEqual(obj2, Composer.INSTANCE.getEmpty())) {
                                this.startGroup(200, ComposerKt.getInvocation());
                                ComposerImpl composerImpl = this;
                                Object obj3 = nextSlot;
                                if (obj3 != null) {
                                    ActualJvm_jvmKt.invokeComposable(composerImpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj3, 2));
                                    this.endGroup();
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                            }
                            this.skipCurrentGroup();
                        }
                    });
                    endRoot();
                    this.isComposing = false;
                    this.invalidations.clear();
                    Unit unit = Unit.INSTANCE;
                    return;
                } catch (Throwable th) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    abortRoot();
                    throw th;
                }
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        ComposerKt.composeRuntimeError("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void record(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.changes.add(change);
    }

    private final void recordApplierOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeUps();
        realizeDowns();
        record(change);
    }

    private final void recordSlotEditingOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(change);
    }

    static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.recordSlotTableOperation(z, function3);
    }

    private final void recordSlotTableOperation(boolean forParent, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation(forParent);
        record(change);
    }

    private final void realizeUps() {
        final int i = this.pendingUps;
        if (i > 0) {
            this.pendingUps = 0;
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$realizeUps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    int i2 = i;
                    for (int i3 = 0; i3 < i2; i3++) {
                        applier.up();
                    }
                }
            });
        }
    }

    private final void realizeDowns(final Object[] nodes) {
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$realizeDowns$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                int length = nodes.length;
                for (int i = 0; i < length; i++) {
                    applier.down(nodes[i]);
                }
            }
        });
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    private final void recordDown(Object node) {
        this.downNodes.push(node);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerImpl.realizeOperationLocation(z);
    }

    private final void realizeOperationLocation(boolean forParent) {
        int parent = forParent ? this.reader.getParent() : this.reader.getCurrentGroup();
        final int i = parent - this.writersReaderDelta;
        if (!(i >= 0)) {
            ComposerKt.composeRuntimeError("Tried to seek backward".toString());
            throw new KotlinNothingValueException();
        }
        if (i > 0) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$realizeOperationLocation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.advanceBy(i);
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    private final void recordInsert(final Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            final SlotTable slotTable = this.insertTable;
            recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$recordInsert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.beginInsert();
                    SlotTable slotTable2 = SlotTable.this;
                    slots.moveFrom(slotTable2, anchor.toIndexFor(slotTable2));
                    slots.endInsert();
                }
            });
            return;
        }
        final List mutableList = CollectionsKt.toMutableList((Collection) this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        final SlotTable slotTable2 = this.insertTable;
        recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$recordInsert$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                SlotTable slotTable3 = SlotTable.this;
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = mutableList;
                SlotWriter openWriter = slotTable3.openWriter();
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(applier, openWriter, rememberManager);
                    }
                    Unit unit = Unit.INSTANCE;
                    openWriter.close();
                    slots.beginInsert();
                    SlotTable slotTable4 = SlotTable.this;
                    slots.moveFrom(slotTable4, anchor.toIndexFor(slotTable4));
                    slots.endInsert();
                } catch (Throwable th) {
                    openWriter.close();
                    throw th;
                }
            }
        });
    }

    private final void recordFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertFixups.add(change);
    }

    private final void recordInsertUpFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertUpFixups.push(change);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    private final void recordDelete() {
        Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> function3;
        reportFreeMovableContent(this.reader.getCurrentGroup());
        function3 = ComposerKt.removeCurrentGroupInstance;
        recordSlotEditingOperation(function3);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private static final int reportFreeMovableContent$reportGroup(final ComposerImpl composerImpl, int i, boolean z, int i2) {
        List filterToRange;
        if (composerImpl.reader.hasMark(i)) {
            Object groupObjectKey = composerImpl.reader.groupObjectKey(i);
            if (groupObjectKey == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
            }
            MovableContent movableContent = (MovableContent) groupObjectKey;
            Object groupGet = composerImpl.reader.groupGet(i, 0);
            final Anchor anchor = composerImpl.reader.anchor(i);
            filterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i, composerImpl.reader.groupSize(i) + i);
            ArrayList arrayList = new ArrayList(filterToRange.size());
            int size = filterToRange.size();
            for (int i3 = 0; i3 < size; i3++) {
                Invalidation invalidation = (Invalidation) filterToRange.get(i3);
                arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
            }
            final MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(Integer.valueOf(i)));
            composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
            composerImpl.recordSlotEditing();
            composerImpl.record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    SlotTable slotTable = new SlotTable();
                    Anchor anchor2 = anchor;
                    SlotWriter openWriter = slotTable.openWriter();
                    try {
                        openWriter.beginInsert();
                        slots.moveTo(anchor2, 1, openWriter);
                        openWriter.endInsert();
                        Unit unit = Unit.INSTANCE;
                        openWriter.close();
                        ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, new MovableContentState(slotTable));
                    } catch (Throwable th) {
                        openWriter.close();
                        throw th;
                    }
                }
            });
            if (z) {
                composerImpl.realizeMovement();
                composerImpl.realizeUps();
                composerImpl.realizeDowns();
                int nodeCount = composerImpl.reader.isNode(i) ? 1 : composerImpl.reader.nodeCount(i);
                if (nodeCount <= 0) {
                    return 0;
                }
                composerImpl.recordRemoveNode(i2, nodeCount);
                return 0;
            }
            return composerImpl.reader.nodeCount(i);
        }
        if (composerImpl.reader.containsMark(i)) {
            int groupSize = composerImpl.reader.groupSize(i) + i;
            int i4 = i + 1;
            int i5 = 0;
            while (i4 < groupSize) {
                boolean isNode = composerImpl.reader.isNode(i4);
                if (isNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordDown(composerImpl.reader.node(i4));
                }
                i5 += reportFreeMovableContent$reportGroup(composerImpl, i4, isNode || z, isNode ? 0 : i2 + i5);
                if (isNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
                i4 += composerImpl.reader.groupSize(i4);
            }
            return i5;
        }
        return composerImpl.reader.nodeCount(i);
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, false, 0);
        realizeMovement();
    }

    private final void recordReaderMoving(int location) {
        this.writersReaderDelta = location - (this.reader.getCurrentGroup() - this.writersReaderDelta);
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        Function3 function3;
        if (this.reader.getGroupsSize() <= 0 || this.startedGroups.peekOr(-1) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            function3 = ComposerKt.startRootGroup;
            recordSlotTableOperation$default(this, false, function3, 1, null);
            this.startedGroup = true;
        }
        final Anchor anchor = slotReader.anchor(parent);
        this.startedGroups.push(parent);
        recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$recordSlotEditing$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                slots.ensureStarted(Anchor.this);
            }
        }, 1, null);
    }

    private final void recordEndGroup() {
        Function3 function3;
        int parent = this.reader.getParent();
        if (this.startedGroups.peekOr(-1) <= parent) {
            if (this.startedGroups.peekOr(-1) == parent) {
                this.startedGroups.pop();
                function3 = ComposerKt.endGroupInstance;
                recordSlotTableOperation$default(this, false, function3, 1, null);
                return;
            }
            return;
        }
        ComposerKt.composeRuntimeError("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    private final void recordEndRoot() {
        Function3 function3;
        if (this.startedGroup) {
            function3 = ComposerKt.endGroupInstance;
            recordSlotTableOperation$default(this, false, function3, 1, null);
            this.startedGroup = false;
        }
    }

    private final void finalizeCompose() {
        realizeUps();
        if (this.pendingStack.isEmpty()) {
            if (this.startedGroups.isEmpty()) {
                cleanUpCompose();
                return;
            } else {
                ComposerKt.composeRuntimeError("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        ComposerKt.composeRuntimeError("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void recordRemoveNode(int nodeIndex, int count) {
        if (count > 0) {
            if (nodeIndex >= 0) {
                if (this.previousRemove == nodeIndex) {
                    this.previousCount += count;
                    return;
                }
                realizeMovement();
                this.previousRemove = nodeIndex;
                this.previousCount = count;
                return;
            }
            ComposerKt.composeRuntimeError(("Invalid remove index " + nodeIndex).toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void recordMoveNode(int from, int to, int count) {
        if (count > 0) {
            int i = this.previousCount;
            if (i > 0 && this.previousMoveFrom == from - i && this.previousMoveTo == to - i) {
                this.previousCount = i + count;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = from;
            this.previousMoveTo = to;
            this.previousCount = count;
        }
    }

    private final void realizeMovement() {
        final int i = this.previousCount;
        this.previousCount = 0;
        if (i > 0) {
            final int i2 = this.previousRemove;
            if (i2 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$realizeMovement$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        Intrinsics.checkNotNullParameter(applier, "applier");
                        Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                        applier.remove(i2, i);
                    }
                });
                return;
            }
            final int i3 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i4 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$realizeMovement$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    applier.move(i3, i4, i);
                }
            });
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class CompositionContextHolder implements RememberObserver {
        private final CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        public CompositionContextHolder(CompositionContextImpl ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.ref = ref;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020+0/¢\u0006\u0002\b0H\u0010¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\b6J\u0006\u00107\u001a\u00020+J\r\u00108\u001a\u00020+H\u0010¢\u0006\u0002\b9J-\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020AH\u0010¢\u0006\u0002\bBJ\u001d\u0010C\u001a\u00020+2\u0006\u00104\u001a\u0002052\u0006\u0010D\u001a\u00020EH\u0010¢\u0006\u0002\bFJ\u0017\u0010G\u001a\u0004\u0018\u00010E2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\bHJ\u001b\u0010I\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bQJ\r\u0010R\u001a\u00020+H\u0010¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020+2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bWJ.\u0010X\u001a\u00020+2&\u0010@\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRk\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00132&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\n\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010 ¨\u0006Y"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "getCollectingParameterInformation$runtime_release", "()Z", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", "reference", "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recordInspectionTable", C4761z5.R, "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        private final MutableState compositionLocalScope = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        public CompositionContextImpl(int i, boolean z) {
            this.compoundHashKey = i;
            this.collectingParameterInformation = z;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getEffectCoroutineContext$runtime_release */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope.getValue();
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            setCompositionLocalScope(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
            Intrinsics.checkNotNullParameter(table, "table");
            HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(data, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey == null) {
            if (data != null && groupKey == 207 && !Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(data.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(groupKey);
                return;
            }
        }
        if (dataKey instanceof Enum) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) dataKey).ordinal());
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(dataKey.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash) {
        this.compoundKeyHash = keyHash ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey == null) {
            if (data != null && groupKey == 207 && !Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
                updateCompoundKeyWhenWeExitGroupKeyHash(data.hashCode());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(groupKey);
                return;
            }
        }
        if (dataKey instanceof Enum) {
            updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) dataKey).ordinal());
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(dataKey.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(groupKey) ^ getCompoundKeyHash(), 3);
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlot();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object value) {
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentScope, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentMap build = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        changed(build);
        changed(currentProviders);
        endGroup();
        return build;
    }
}
