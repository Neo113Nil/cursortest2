package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001e\u001a\u00020\u001d2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010 J\u001d\u0010#\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b#\u0010$JG\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0014\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b%\u0010&JO\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060'H\u0002¢\u0006\u0004\b%\u0010)J\u001f\u0010\u001a\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010+J1\u0010%\u001a\u00020\u001d2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0004\b%\u0010,JI\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b\u0013\u0010/J%\u0010#\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b#\u00100J]\u0010\u0016\u001a\u00020\u001d2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0016\u0010(\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010.\u001a\u00020\n2\u000e\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u00102Jm\u0010%\u001a\u00020\u001d2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0015\u001a\u00020\n2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010(\u001a\u00020\n2\u0016\u0010.\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u00101\u001a\u00020\n2\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b%\u00104J\u0018\u00105\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u00106J;\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u00108J?\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00020-H\u0002¢\u0006\u0004\b%\u00109J1\u0010\u001e\u001a\u00020\u001d2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010:JA\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00020-H\u0002¢\u0006\u0004\b\u0016\u00109J\u001d\u0010;\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b;\u0010$J!\u0010>\u001a\u00020\u00192\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190<¢\u0006\u0004\b>\u0010?J7\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010@J3\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190<2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020-H\u0002¢\u0006\u0004\b\u0016\u0010AJC\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190<2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00020-H\u0002¢\u0006\u0004\b\u0013\u0010BJw\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190<2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010.\u001a\u00020-2\u0014\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060C2\u0014\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060CH\u0002¢\u0006\u0004\b\u0016\u0010DJ \u0010E\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bE\u0010FJG\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b%\u0010/J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0096\u0002¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000JH\u0016¢\u0006\u0004\bK\u0010LJ\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010*\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010MJ%\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060N2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010MR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010OR \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010QR\"\u0010\u000b\u001a\u00020\n8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010R\u001a\u0004\bS\u0010\u000f\"\u0004\bT\u0010UR\u0016\u0010\u0016\u001a\u00020V8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010WR8\u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010ZR4\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010ZR$\u0010]\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b]\u0010R\u001a\u0004\b^\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "E", "Lkotlin/collections/AbstractMutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "getModCount$runtime", "()I", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "p0", "getHighSpeedVideoFpsRangesFor", "([Ljava/lang/Object;)[Ljava/lang/Object;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "p2", "", "getHighSpeedVideoFpsRanges", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "Camera2StreamConfigurationMap", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "", "p3", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "(ILjava/lang/Object;)V", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "p4", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "(ILjava/util/Collection;)Z", "p5", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "p6", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "get", "(I)Ljava/lang/Object;", "removeAt", "([Ljava/lang/Object;III)Ljava/lang/Object;", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "([Ljava/lang/Object;II)V", "removeAll", "Lkotlin/Function1;", "predicate", "removeAllWithPredicate", "(Lkotlin/jvm/functions/Function1;)Z", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)I", "", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;Ljava/util/List;Ljava/util/List;)I", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getHighSpeedVideoSizes", "[Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getRootShift$runtime", "setRootShift$runtime", "(I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "root", "getRoot$runtime", "()[Ljava/lang/Object;", "tail", "getTail$runtime", io.ktor.http.ContentDisposition.Parameters.Size, "getSize"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersistentVectorBuilder<E> extends kotlin.collections.AbstractMutableList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<E> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Object[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> Camera2StreamConfigurationMap;
    private java.lang.Object[] getHighSpeedVideoSizes;
    private java.lang.Object[] root;
    private int rootShift;
    private int size;
    private java.lang.Object[] tail;

    public PersistentVectorBuilder(androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<? extends E> persistentList, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        this.Camera2StreamConfigurationMap = persistentList;
        this.getHighSpeedVideoSizes = objArr;
        this.getHighSpeedVideoFpsRangesFor = objArr2;
        this.rootShift = i;
        this.root = this.getHighSpeedVideoSizes;
        this.tail = this.getHighSpeedVideoFpsRangesFor;
        this.size = this.Camera2StreamConfigurationMap.size();
    }

    /* renamed from: getRootShift$runtime, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    public final void setRootShift$runtime(int i) {
        this.rootShift = i;
    }

    /* renamed from: getRoot$runtime, reason: from getter */
    public final java.lang.Object[] getRoot() {
        return this.root;
    }

    /* renamed from: getTail$runtime, reason: from getter */
    public final java.lang.Object[] getTail() {
        return this.tail;
    }

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public final int getModCount$runtime() {
        return this.modCount;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> build() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector persistentVector;
        if (this.root == this.getHighSpeedVideoSizes && this.tail == this.getHighSpeedVideoFpsRangesFor) {
            persistentVector = this.Camera2StreamConfigurationMap;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership();
            java.lang.Object[] objArr = this.root;
            this.getHighSpeedVideoSizes = objArr;
            java.lang.Object[] objArr2 = this.tail;
            this.getHighSpeedVideoFpsRangesFor = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    persistentVector = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.persistentVectorOf();
                } else {
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, size());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                    persistentVector = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(copyOf);
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
                persistentVector = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(objArr, this.tail, size(), this.rootShift);
            }
        }
        this.Camera2StreamConfigurationMap = persistentVector;
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E element) {
        this.modCount++;
        int size = size();
        if (size > 32) {
            size -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size);
        }
        if (size < 32) {
            java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.tail);
            highSpeedVideoFpsRangesFor[size] = element;
            this.tail = highSpeedVideoFpsRangesFor;
            this.size = size() + 1;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[33];
            objArr[0] = element;
            objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges(this.root, this.tail, objArr);
        }
        return true;
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.Object[] p0, java.lang.Object[] p1, java.lang.Object[] p2) {
        int size = size();
        int i = this.rootShift;
        if ((size >> 5) > (1 << i)) {
            java.lang.Object[] objArr = new java.lang.Object[33];
            objArr[0] = p0;
            objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            this.root = getHighResolutionOutputSizeshNQ4ISI(objArr, p1, i + 5);
            this.tail = p2;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (p0 == null) {
            this.root = p1;
            this.tail = p2;
            this.size = size() + 1;
        } else {
            this.root = getHighResolutionOutputSizeshNQ4ISI(p0, p1, i);
            this.tail = p2;
            this.size = size() + 1;
        }
    }

    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] p0, java.lang.Object[] p1, int p2) {
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(size() - 1, p2);
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        if (p2 == 5) {
            highSpeedVideoFpsRangesFor[indexSegment] = p1;
            return highSpeedVideoFpsRangesFor;
        }
        highSpeedVideoFpsRangesFor[indexSegment] = getHighResolutionOutputSizeshNQ4ISI((java.lang.Object[]) highSpeedVideoFpsRangesFor[indexSegment], p1, p2 - 5);
        return highSpeedVideoFpsRangesFor;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        this.modCount++;
        int size = size();
        if (size > 32) {
            size -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size);
        }
        java.util.Iterator<? extends E> it = elements.iterator();
        if (32 - size >= elements.size()) {
            java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.tail);
            while (size < 32 && it.hasNext()) {
                highSpeedVideoFpsRangesFor[size] = it.next();
                size++;
            }
            this.tail = highSpeedVideoFpsRangesFor;
            this.size = size() + elements.size();
        } else {
            int size2 = ((elements.size() + size) - 1) / 32;
            java.lang.Object[][] objArr = new java.lang.Object[size2][];
            java.lang.Object[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.tail);
            while (size < 32 && it.hasNext()) {
                highSpeedVideoFpsRangesFor2[size] = it.next();
                size++;
            }
            objArr[0] = highSpeedVideoFpsRangesFor2;
            for (int i = 1; i < size2; i++) {
                java.lang.Object[] objArr2 = new java.lang.Object[33];
                objArr2[32] = this.getHighResolutionOutputSizeshNQ4ISI;
                for (int i2 = 0; i2 < 32 && it.hasNext(); i2++) {
                    objArr2[i2] = it.next();
                }
                objArr[i] = objArr2;
            }
            this.root = Camera2StreamConfigurationMap(this.root, size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()), objArr);
            java.lang.Object[] objArr3 = new java.lang.Object[33];
            objArr3[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i3 = 0; i3 < 32 && it.hasNext(); i3++) {
                objArr3[i3] = it.next();
            }
            this.tail = objArr3;
            this.size = size() + elements.size();
        }
        return true;
    }

    private final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, java.lang.Object[][] p2) {
        java.lang.Object[] highSpeedVideoFpsRangesFor;
        java.util.Iterator<java.lang.Object[]> it = kotlin.jvm.internal.ArrayIteratorKt.iterator(p2);
        int i = this.rootShift;
        if ((p1 >> 5) < (1 << i)) {
            highSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(p0, p1, i, it);
        } else {
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        }
        while (it.hasNext()) {
            int i2 = this.rootShift + 5;
            this.rootShift = i2;
            java.lang.Object[] objArr = new java.lang.Object[33];
            objArr[0] = highSpeedVideoFpsRangesFor;
            objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap(objArr, 1 << i2, i2, it);
            highSpeedVideoFpsRangesFor = objArr;
        }
        return highSpeedVideoFpsRangesFor;
    }

    private final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, int p2, java.util.Iterator<java.lang.Object[]> p3) {
        if (!p3.hasNext()) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (p2 < 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (p2 == 0) {
            return p3.next();
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p1, p2);
        int i = p2 - 5;
        highSpeedVideoFpsRangesFor[indexSegment] = Camera2StreamConfigurationMap((java.lang.Object[]) highSpeedVideoFpsRangesFor[indexSegment], p1, i, p3);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || !p3.hasNext()) {
                break;
            }
            highSpeedVideoFpsRangesFor[indexSegment] = Camera2StreamConfigurationMap((java.lang.Object[]) highSpeedVideoFpsRangesFor[indexSegment], 0, i, p3);
        }
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        this.modCount++;
        int rootSize = size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
        if (index >= rootSize) {
            Camera2StreamConfigurationMap(this.root, index - rootSize, (int) element);
            return;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        java.lang.Object[] objArr = this.root;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor(objArr, this.rootShift, index, element, objectRef), 0, (int) objectRef.getValue());
    }

    private final java.lang.Object[] getHighSpeedVideoFpsRangesFor(java.lang.Object[] p0, int p1, int p2, java.lang.Object p3, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p4) {
        java.lang.Object obj;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            p4.setValue(p0[31]);
            java.lang.Object[] copyInto = kotlin.collections.ArraysKt.copyInto(p0, getHighSpeedVideoFpsRangesFor(p0), indexSegment + 1, indexSegment, 31);
            copyInto[indexSegment] = p3;
            return copyInto;
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        int i = p1 - 5;
        java.lang.Object obj2 = highSpeedVideoFpsRangesFor[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        highSpeedVideoFpsRangesFor[indexSegment] = getHighSpeedVideoFpsRangesFor((java.lang.Object[]) obj2, i, p2, p3, p4);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || (obj = highSpeedVideoFpsRangesFor[indexSegment]) == null) {
                break;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            highSpeedVideoFpsRangesFor[indexSegment] = getHighSpeedVideoFpsRangesFor((java.lang.Object[]) obj, i, 0, p4.getValue(), p4);
        }
        return highSpeedVideoFpsRangesFor;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int index, java.util.Collection<? extends E> elements) {
        java.lang.Object[] copyInto;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i = (index >> 5) << 5;
        int size = (((size() - i) + elements.size()) - 1) / 32;
        if (size == 0) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(index >= (size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size())));
            int i2 = index & 31;
            int size2 = elements.size();
            java.lang.Object[] objArr = this.tail;
            java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(objArr);
            int i3 = (((size2 + index) - 1) & 31) + 1;
            int size3 = size();
            if (size3 > 32) {
                size3 -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size3);
            }
            java.lang.Object[] copyInto2 = kotlin.collections.ArraysKt.copyInto(objArr, highSpeedVideoFpsRangesFor, i3, i2, size3);
            java.util.Iterator<? extends E> it = elements.iterator();
            while (i2 < 32 && it.hasNext()) {
                copyInto2[i2] = it.next();
                i2++;
            }
            this.tail = copyInto2;
            this.size = size() + elements.size();
            return true;
        }
        java.lang.Object[][] objArr2 = new java.lang.Object[size][];
        int size4 = size();
        if (size4 > 32) {
            size4 -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size4);
        }
        int i4 = size4;
        int size5 = size() + elements.size();
        if (size5 > 32) {
            size5 -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size5);
        }
        if (index >= (size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()))) {
            copyInto = new java.lang.Object[33];
            copyInto[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap(elements, index, this.tail, i4, objArr2, size, copyInto);
        } else if (size5 > i4) {
            int i5 = size5 - i4;
            copyInto = getHighResolutionOutputSizeshNQ4ISI(this.tail, i5);
            getHighResolutionOutputSizeshNQ4ISI(elements, index, i5, objArr2, size, copyInto);
        } else {
            java.lang.Object[] objArr3 = this.tail;
            java.lang.Object[] objArr4 = new java.lang.Object[33];
            objArr4[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = i4 - size5;
            copyInto = kotlin.collections.ArraysKt.copyInto(objArr3, objArr4, 0, i6, i4);
            int i7 = 32 - i6;
            java.lang.Object[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.tail, i7);
            int i8 = size - 1;
            objArr2[i8] = highResolutionOutputSizeshNQ4ISI;
            getHighResolutionOutputSizeshNQ4ISI(elements, index, i7, objArr2, i8, highResolutionOutputSizeshNQ4ISI);
        }
        this.root = Camera2StreamConfigurationMap(this.root, i, objArr2);
        this.tail = copyInto;
        this.size = size() + elements.size();
        return true;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(java.util.Collection<? extends E> p0, int p1, int p2, java.lang.Object[][] p3, int p4, java.lang.Object[] p5) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2 = this.root;
        if (objArr2 == null) {
            throw new java.lang.IllegalStateException("root is null".toString());
        }
        int i = p1 >> 5;
        if (objArr2 == null) {
            throw new java.lang.IllegalStateException("root is null".toString());
        }
        java.util.ListIterator<java.lang.Object[]> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size())) >> 5);
        java.lang.Object[] objArr3 = p5;
        int i2 = p4;
        while (highResolutionOutputSizeshNQ4ISI.previousIndex() != i) {
            java.lang.Object[] previous = highResolutionOutputSizeshNQ4ISI.previous();
            kotlin.collections.ArraysKt.copyInto(previous, objArr3, 0, 32 - p2, 32);
            objArr3 = getHighResolutionOutputSizeshNQ4ISI(previous, p2);
            i2--;
            p3[i2] = objArr3;
        }
        java.lang.Object[] previous2 = highResolutionOutputSizeshNQ4ISI.previous();
        int rootSize = p4 - ((((size() > 32 ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()) : 0) >> 5) - 1) - i);
        if (rootSize < p4) {
            java.lang.Object[] objArr4 = p3[rootSize];
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr4);
            objArr = objArr4;
        } else {
            objArr = p5;
        }
        Camera2StreamConfigurationMap(p0, p1, previous2, 32, p3, rootSize, objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int index) {
        java.lang.Object[] objArr;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        if ((size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size())) <= index) {
            objArr = this.tail;
        } else {
            objArr = this.root;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            for (int i = this.rootShift; i > 0; i -= 5) {
                java.lang.Object obj = objArr[androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, i)];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                objArr = (java.lang.Object[]) obj;
            }
        }
        return (E) objArr[index & 31];
    }

    @Override // kotlin.collections.AbstractMutableList
    public final E removeAt(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        this.modCount++;
        int rootSize = size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
        if (index >= rootSize) {
            return (E) getHighSpeedVideoFpsRanges(this.root, rootSize, this.rootShift, index - rootSize);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(this.tail[0]);
        java.lang.Object[] objArr = this.root;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(objArr, this.rootShift, index, objectRef), rootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    private final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object[] p0, int p1, int p2, int p3) {
        int size = size() - p1;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(p3 < size);
        if (size == 1) {
            java.lang.Object obj = this.tail[0];
            getHighSpeedVideoFpsRanges(p0, p1, p2);
            return obj;
        }
        java.lang.Object[] objArr = this.tail;
        java.lang.Object obj2 = objArr[p3];
        java.lang.Object[] copyInto = kotlin.collections.ArraysKt.copyInto(objArr, getHighSpeedVideoFpsRangesFor(objArr), p3, p3 + 1, size);
        copyInto[size - 1] = null;
        this.root = p0;
        this.tail = copyInto;
        this.size = (p1 + size) - 1;
        this.rootShift = p2;
        return obj2;
    }

    private final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, int p2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p3) {
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        int i = 31;
        if (p1 == 0) {
            java.lang.Object obj = p0[indexSegment];
            java.lang.Object[] copyInto = kotlin.collections.ArraysKt.copyInto(p0, getHighSpeedVideoFpsRangesFor(p0), indexSegment, indexSegment + 1, 32);
            copyInto[31] = p3.getValue();
            p3.setValue(obj);
            return copyInto;
        }
        if (p0[31] == null) {
            i = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment((size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size())) - 1, p1);
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        int i2 = p1 - 5;
        int i3 = indexSegment + 1;
        if (i3 <= i) {
            while (true) {
                java.lang.Object obj2 = highSpeedVideoFpsRangesFor[i];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                highSpeedVideoFpsRangesFor[i] = Camera2StreamConfigurationMap((java.lang.Object[]) obj2, i2, 0, p3);
                if (i == i3) {
                    break;
                }
                i--;
            }
        }
        java.lang.Object obj3 = highSpeedVideoFpsRangesFor[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
        highSpeedVideoFpsRangesFor[indexSegment] = Camera2StreamConfigurationMap((java.lang.Object[]) obj3, i2, p2, p3);
        return highSpeedVideoFpsRangesFor;
    }

    private final void getHighSpeedVideoFpsRanges(java.lang.Object[] p0, int p1, int p2) {
        if (p2 == 0) {
            this.root = null;
            if (p0 == null) {
                p0 = new java.lang.Object[0];
            }
            this.tail = p0;
            this.size = p1;
            this.rootShift = p2;
            return;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(p0);
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0, p2, p1, objectRef);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highResolutionOutputSizeshNQ4ISI);
        java.lang.Object value = objectRef.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        this.tail = (java.lang.Object[]) value;
        this.size = p1;
        if (highResolutionOutputSizeshNQ4ISI[1] == null) {
            this.root = (java.lang.Object[]) highResolutionOutputSizeshNQ4ISI[0];
            this.rootShift = p2 - 5;
        } else {
            this.root = highResolutionOutputSizeshNQ4ISI;
            this.rootShift = p2;
        }
    }

    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] p0, int p1, int p2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p3) {
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2 - 1, p1);
        if (p1 == 5) {
            p3.setValue(p0[indexSegment]);
            highResolutionOutputSizeshNQ4ISI = null;
        } else {
            java.lang.Object obj = p0[indexSegment];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((java.lang.Object[]) obj, p1 - 5, p2, p3);
        }
        if (highResolutionOutputSizeshNQ4ISI == null && indexSegment == 0) {
            return null;
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        highSpeedVideoFpsRangesFor[indexSegment] = highResolutionOutputSizeshNQ4ISI;
        return highSpeedVideoFpsRangesFor;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(final java.util.Collection<?> elements) {
        return removeAllWithPredicate(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean contains;
                contains = elements.contains(obj);
                return java.lang.Boolean.valueOf(contains);
            }
        });
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> p0, int p1, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p2) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0, this.tail, p1, p2);
        if (highSpeedVideoFpsRangesFor == p1) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(p2.getValue() == this.tail);
            return p1;
        }
        java.lang.Object value = p2.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        java.lang.Object[] objArr = (java.lang.Object[]) value;
        kotlin.collections.ArraysKt.fill(objArr, (java.lang.Object) null, highSpeedVideoFpsRangesFor, p1);
        this.tail = objArr;
        this.size = size() - (p1 - highSpeedVideoFpsRangesFor);
        return highSpeedVideoFpsRangesFor;
    }

    private final int getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> p0, java.lang.Object[] p1, int p2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p3) {
        java.lang.Object[] objArr = p1;
        int i = p2;
        boolean z = false;
        for (int i2 = 0; i2 < p2; i2++) {
            java.lang.Object obj = p1[i2];
            if (p0.invoke(obj).booleanValue()) {
                if (!z) {
                    objArr = getHighSpeedVideoFpsRangesFor(p1);
                    z = true;
                    i = i2;
                }
            } else if (z) {
                objArr[i] = obj;
                i++;
            }
        }
        p3.setValue(objArr);
        return i;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final E set(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        if ((size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size())) <= index) {
            java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.tail);
            if (highSpeedVideoFpsRangesFor != this.tail) {
                this.modCount++;
            }
            int i = index & 31;
            E e = (E) highSpeedVideoFpsRangesFor[i];
            highSpeedVideoFpsRangesFor[i] = element;
            this.tail = highSpeedVideoFpsRangesFor;
            return e;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        java.lang.Object[] objArr = this.root;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        this.root = Camera2StreamConfigurationMap(objArr, this.rootShift, index, element, objectRef);
        return (E) objectRef.getValue();
    }

    private final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, int p2, E p3, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p4) {
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        if (p1 == 0) {
            if (highSpeedVideoFpsRangesFor != p0) {
                this.modCount++;
            }
            p4.setValue(highSpeedVideoFpsRangesFor[indexSegment]);
            highSpeedVideoFpsRangesFor[indexSegment] = p3;
            return highSpeedVideoFpsRangesFor;
        }
        java.lang.Object obj = highSpeedVideoFpsRangesFor[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        highSpeedVideoFpsRangesFor[indexSegment] = Camera2StreamConfigurationMap((java.lang.Object[]) obj, p1 - 5, p2, p3, p4);
        return highSpeedVideoFpsRangesFor;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorMutableIterator(this, index);
    }

    private final java.util.ListIterator<java.lang.Object[]> getHighResolutionOutputSizeshNQ4ISI(int p0) {
        java.lang.Object[] objArr = this.root;
        if (objArr == null) {
            throw new java.lang.IllegalStateException("Invalid root".toString());
        }
        int rootSize = (size() <= 32 ? 0 : androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size())) >> 5;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(p0, rootSize);
        int i = this.rootShift;
        if (i == 0) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SingleElementListIterator(objArr, p0);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator(objArr, p0, rootSize, i / 5);
    }

    private final void Camera2StreamConfigurationMap(java.util.Collection<? extends E> p0, int p1, java.lang.Object[] p2, int p3, java.lang.Object[][] p4, int p5, java.lang.Object[] p6) {
        java.lang.Object[] objArr;
        if (p5 <= 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p2);
        p4[0] = highSpeedVideoFpsRangesFor;
        int i = p1 & 31;
        int size = ((p1 + p0.size()) - 1) & 31;
        int i2 = (p3 - i) + size;
        if (i2 < 32) {
            kotlin.collections.ArraysKt.copyInto(highSpeedVideoFpsRangesFor, p6, size + 1, i, p3);
        } else {
            if (p5 == 1) {
                objArr = highSpeedVideoFpsRangesFor;
            } else {
                objArr = new java.lang.Object[33];
                objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
                p5--;
                p4[p5] = objArr;
            }
            int i3 = p3 - (i2 - 31);
            kotlin.collections.ArraysKt.copyInto(highSpeedVideoFpsRangesFor, p6, 0, i3, p3);
            kotlin.collections.ArraysKt.copyInto(highSpeedVideoFpsRangesFor, objArr, size + 1, i, i3);
            p6 = objArr;
        }
        java.util.Iterator<? extends E> it = p0.iterator();
        while (i < 32 && it.hasNext()) {
            highSpeedVideoFpsRangesFor[i] = it.next();
            i++;
        }
        for (int i4 = 1; i4 < p5; i4++) {
            java.lang.Object[] objArr2 = new java.lang.Object[33];
            objArr2[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            for (int i5 = 0; i5 < 32 && it.hasNext(); i5++) {
                objArr2[i5] = it.next();
            }
            p4[i4] = objArr2;
        }
        for (int i6 = 0; i6 < 32 && it.hasNext(); i6++) {
            p6[i6] = it.next();
        }
    }

    private final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, int p2) {
        if (p2 < 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (p2 == 0) {
            return p0;
        }
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p1, p2);
        java.lang.Object obj = p0[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((java.lang.Object[]) obj, p1, p2 - 5);
        if (indexSegment < 31) {
            int i = indexSegment + 1;
            if (p0[i] != null) {
                if (p0.length == 33 && p0[32] == this.getHighResolutionOutputSizeshNQ4ISI) {
                    kotlin.collections.ArraysKt.fill(p0, (java.lang.Object) null, i, 32);
                }
                java.lang.Object[] objArr = new java.lang.Object[33];
                objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
                p0 = kotlin.collections.ArraysKt.copyInto(p0, objArr, 0, 0, i);
            }
        }
        if (Camera2StreamConfigurationMap == p0[indexSegment]) {
            return p0;
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(p0);
        highSpeedVideoFpsRangesFor[indexSegment] = Camera2StreamConfigurationMap;
        return highSpeedVideoFpsRangesFor;
    }

    private final void Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, E p2) {
        int size = size();
        if (size > 32) {
            size -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size);
        }
        java.lang.Object[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.tail);
        if (size < 32) {
            kotlin.collections.ArraysKt.copyInto(this.tail, highSpeedVideoFpsRangesFor, p1 + 1, p1, size);
            highSpeedVideoFpsRangesFor[p1] = p2;
            this.root = p0;
            this.tail = highSpeedVideoFpsRangesFor;
            this.size = size() + 1;
            return;
        }
        java.lang.Object[] objArr = this.tail;
        java.lang.Object obj = objArr[31];
        kotlin.collections.ArraysKt.copyInto(objArr, highSpeedVideoFpsRangesFor, p1 + 1, p1, 31);
        highSpeedVideoFpsRangesFor[p1] = p2;
        java.lang.Object[] objArr2 = new java.lang.Object[33];
        objArr2[0] = obj;
        objArr2[32] = this.getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges(p0, highSpeedVideoFpsRangesFor, objArr2);
    }

    private final java.lang.Object[] getHighSpeedVideoFpsRangesFor(java.lang.Object[] p0) {
        if (p0 == null) {
            java.lang.Object[] objArr = new java.lang.Object[33];
            objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
            return objArr;
        }
        if (p0.length == 33 && p0[32] == this.getHighResolutionOutputSizeshNQ4ISI) {
            return p0;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[33];
        objArr2[32] = this.getHighResolutionOutputSizeshNQ4ISI;
        return kotlin.collections.ArraysKt.copyInto$default(p0, objArr2, 0, 0, kotlin.ranges.RangesKt.coerceAtMost(p0.length, 32), 6, (java.lang.Object) null);
    }

    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] p0, int p1) {
        if (p0.length == 33 && p0[32] == this.getHighResolutionOutputSizeshNQ4ISI) {
            return kotlin.collections.ArraysKt.copyInto(p0, p0, p1, 0, 32 - p1);
        }
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
        return kotlin.collections.ArraysKt.copyInto(p0, objArr, p1, 0, 32 - p1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> p0, java.lang.Object[] p1, int p2, int p3, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p4, java.util.List<java.lang.Object[]> p5, java.util.List<java.lang.Object[]> p6) {
        java.lang.Object[] objArr;
        if (p1.length == 33 && p1[32] == this.getHighResolutionOutputSizeshNQ4ISI) {
            p5.add(p1);
        }
        java.lang.Object value = p4.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        java.lang.Object[] objArr2 = (java.lang.Object[]) value;
        java.lang.Object[] objArr3 = objArr2;
        for (int i = 0; i < p2; i++) {
            java.lang.Object obj = p1[i];
            if (!p0.invoke(obj).booleanValue()) {
                if (p3 == 32) {
                    if (!p5.isEmpty()) {
                        objArr = p5.remove(p5.size() - 1);
                    } else {
                        objArr = new java.lang.Object[33];
                        objArr[32] = this.getHighResolutionOutputSizeshNQ4ISI;
                    }
                    objArr3 = objArr;
                    p3 = 0;
                }
                objArr3[p3] = obj;
                p3++;
            }
        }
        p4.setValue(objArr3);
        if (objArr2 != p4.getValue()) {
            p6.add(objArr2);
        }
        return p3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r0 != r11) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r20, r11, r12) != r11) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r15 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAllWithPredicate(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        java.lang.Object[] Camera2StreamConfigurationMap;
        int i;
        int size = size();
        if (size > 32) {
            size -= androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size);
        }
        int i2 = size;
        java.lang.Object[] objArr = null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        boolean z = false;
        if (this.root != null) {
            java.util.ListIterator<java.lang.Object[]> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(0);
            int i3 = 32;
            while (i3 == 32 && highResolutionOutputSizeshNQ4ISI.hasNext()) {
                i3 = getHighSpeedVideoFpsRangesFor(predicate, highResolutionOutputSizeshNQ4ISI.next(), 32, objectRef);
            }
            if (i3 == 32) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(!highResolutionOutputSizeshNQ4ISI.hasNext());
                int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(predicate, i2, objectRef);
                if (highResolutionOutputSizeshNQ4ISI2 == 0) {
                    getHighSpeedVideoFpsRanges(this.root, size(), this.rootShift);
                }
            } else {
                int previousIndex = highResolutionOutputSizeshNQ4ISI.previousIndex() << 5;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int i4 = i3;
                while (highResolutionOutputSizeshNQ4ISI.hasNext()) {
                    i4 = getHighResolutionOutputSizeshNQ4ISI(predicate, highResolutionOutputSizeshNQ4ISI.next(), 32, i4, objectRef, arrayList2, arrayList);
                    previousIndex = previousIndex;
                }
                int i5 = previousIndex;
                int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(predicate, this.tail, i2, i4, objectRef, arrayList2, arrayList);
                java.lang.Object value = objectRef.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                java.lang.Object[] objArr2 = (java.lang.Object[]) value;
                kotlin.collections.ArraysKt.fill(objArr2, (java.lang.Object) null, highResolutionOutputSizeshNQ4ISI3, 32);
                if (arrayList.isEmpty()) {
                    Camera2StreamConfigurationMap = this.root;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap);
                } else {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.root, i5, this.rootShift, arrayList.iterator());
                }
                int size2 = i5 + (arrayList.size() << 5);
                if ((size2 & 31) != 0) {
                    androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException("invalid size");
                }
                if (size2 == 0) {
                    this.rootShift = 0;
                } else {
                    int i6 = size2 - 1;
                    while (true) {
                        i = this.rootShift;
                        if ((i6 >> i) != 0) {
                            break;
                        }
                        this.rootShift = i - 5;
                        java.lang.Object[] objArr3 = Camera2StreamConfigurationMap[0];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr3, "");
                        Camera2StreamConfigurationMap = objArr3;
                    }
                    objArr = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, i6, i);
                }
                this.root = objArr;
                this.tail = objArr2;
                this.size = size2 + highResolutionOutputSizeshNQ4ISI3;
                z = true;
            }
        }
        if (z) {
            this.modCount++;
        }
        return z;
    }
}
