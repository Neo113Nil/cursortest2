package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ]*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002^]B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 J3\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001b\u0010#J;\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J?\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0002¢\u0006\u0004\b\u001d\u0010(J?\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u001d\u0010)J?\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010*JQ\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u00012\u0006\u0010,\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010.J]\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00012\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001d\u00100J-\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u00101JA\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0002¢\u0006\u0004\b\u001b\u00102J9\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0002¢\u0006\u0004\b\u000f\u00103J\u0017\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u00104J[\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u0002052\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'H\u0002¢\u0006\u0004\b%\u00106J\u000f\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u0010\u0012J#\u0010%\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b%\u00108J%\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u0004\u0018\u00018\u00012\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b>\u0010?JQ\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010A\u001a\u0002052\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\bC\u0010DJ;\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\bF\u0010GJM\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\bH\u0010IJ3\u0010J\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010KJW\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010LJG\u0010M\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\bM\u0010NJ_\u00107\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010OJ;\u0010J\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010PJO\u0010M\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00028\u00002\u0006\u0010E\u001a\u00028\u00012\u0006\u0010;\u001a\u00020\u00042\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'¢\u0006\u0004\bM\u0010IJ`\u0010U\u001a\u00020S2O\u0010T\u001aK\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\u0004\u0012\u00020S0QH\u0000¢\u0006\u0004\bU\u0010VJp\u0010\u000f\u001a\u00020S2O\u0010\u0017\u001aK\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bR\u0012\u0004\u0012\u00020S0Q2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010WR\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010XR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010XR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010YR4\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b[\u0010\\"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "entryCount$runtime", "()I", "positionMask", "", "hasEntryAt$runtime", "(I)Z", "p0", "entryKeyIndex$runtime", "(I)I", "nodeIndex$runtime", "getHighResolutionOutputSizeshNQ4ISI", "(I)Ljava/lang/Object;", "getHighSpeedVideoSizes", "nodeIndex", "nodeAtIndex$runtime", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p1", "p2", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p3", "getHighSpeedVideoFpsRanges", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p4", "p5", "p6", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "p7", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "keyHash", "key", "shift", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "otherNode", "intersectionCounter", "mutator", "mutablePutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "", "visitor", "accept$runtime", "(Lkotlin/jvm/functions/Function5;)V", "(Lkotlin/jvm/functions/Function5;II)V", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "[Ljava/lang/Object;", "getBuffer$runtime", "()[Ljava/lang/Object;", "Companion", "ModificationResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrieNode<K, V> {
    private int Camera2StreamConfigurationMap;
    private java.lang.Object[] buffer;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode EMPTY = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode(0, 0, new java.lang.Object[0]);

    public TrieNode(int i, int i2, java.lang.Object[] objArr, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership mutabilityOwnership) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = mutabilityOwnership;
        this.buffer = objArr;
    }

    public TrieNode(int i, int i2, java.lang.Object[] objArr) {
        this(i, i2, objArr, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJH\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u000b\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\nH\u0086\b¢\u0006\u0004\b\f\u0010\rR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Lkotlin/Function1;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "replaceNode", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", com.visa.cbp.getEncExpo.warmup, "getSizeDelta", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<K, V> replaceNode(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>> operation) {
            setNode(operation.invoke(getNode()));
            return this;
        }
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<K, V> getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<>(this, 1);
    }

    /* renamed from: getBuffer$runtime, reason: from getter */
    public final java.lang.Object[] getBuffer() {
        return this.buffer;
    }

    public final int entryCount$runtime() {
        return java.lang.Integer.bitCount(this.Camera2StreamConfigurationMap);
    }

    public final boolean hasEntryAt$runtime(int positionMask) {
        return (positionMask & this.Camera2StreamConfigurationMap) != 0;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(int p0) {
        return (p0 & this.getHighSpeedVideoSizes) != 0;
    }

    public final int entryKeyIndex$runtime(int positionMask) {
        return java.lang.Integer.bitCount((positionMask - 1) & this.Camera2StreamConfigurationMap) * 2;
    }

    public final int nodeIndex$runtime(int positionMask) {
        return (this.buffer.length - 1) - java.lang.Integer.bitCount((positionMask - 1) & this.getHighSpeedVideoSizes);
    }

    private final K getHighResolutionOutputSizeshNQ4ISI(int p0) {
        return (K) this.buffer[p0];
    }

    private final V getHighSpeedVideoSizes(int p0) {
        return (V) this.buffer[p0 + 1];
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime(int nodeIndex) {
        java.lang.Object obj = this.buffer[nodeIndex];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode) obj;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighResolutionOutputSizeshNQ4ISI(int p0, K p1, V p2) {
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.getHighResolutionOutputSizeshNQ4ISI(this.buffer, entryKeyIndex$runtime(p0), p1, p2);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(p0 | this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoFpsRanges(int p0, K p1, V p2, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p3) {
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI;
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI2;
        int entryKeyIndex$runtime = entryKeyIndex$runtime(p0);
        if (this.getHighResolutionOutputSizeshNQ4ISI == p3) {
            highResolutionOutputSizeshNQ4ISI2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.getHighResolutionOutputSizeshNQ4ISI(this.buffer, entryKeyIndex$runtime, p1, p2);
            this.buffer = highResolutionOutputSizeshNQ4ISI2;
            this.Camera2StreamConfigurationMap = p0 | this.Camera2StreamConfigurationMap;
            return this;
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.getHighResolutionOutputSizeshNQ4ISI(this.buffer, entryKeyIndex$runtime, p1, p2);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(p0 | this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, highResolutionOutputSizeshNQ4ISI, p3);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoSizes(int p0, V p1, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> p2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == p2.getOwnership()) {
            this.buffer[p0 + 1] = p1;
            return this;
        }
        p2.setModCount$runtime(p2.getModCount() + 1);
        java.lang.Object[] objArr = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[p0 + 1] = p1;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, copyOf, p2.getOwnership());
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoSizes(int p0, int p1, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p2) {
        java.lang.Object[] objArr = p2.buffer;
        if (objArr.length == 2 && p2.getHighSpeedVideoSizes == 0) {
            if (this.buffer.length == 1) {
                p2.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
                return p2;
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap ^ p1, p1 ^ this.getHighSpeedVideoSizes, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$replaceNodeWithEntry(this.buffer, p0, entryKeyIndex$runtime(p1), objArr[0], objArr[1]));
        }
        java.lang.Object[] objArr2 = this.buffer;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[p0] = p2;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, copyOf);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighResolutionOutputSizeshNQ4ISI(int p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p1, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p2) {
        java.lang.Object[] objArr = this.buffer;
        if (objArr.length == 1 && p1.buffer.length == 2 && p1.getHighSpeedVideoSizes == 0) {
            p1.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
            return p1;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == p2) {
            objArr[p0] = p1;
            return this;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[p0] = p1;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, copyOf, p2);
    }

    private final java.lang.Object[] getHighSpeedVideoFpsRangesFor(int p0, int p1, int p2, K p3, V p4, int p5, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p6) {
        K highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(p0);
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$replaceEntryWithNode(this.buffer, p0, nodeIndex$runtime(p1) + 1, getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.hashCode() : 0, highResolutionOutputSizeshNQ4ISI, getHighSpeedVideoSizes(p0), p2, p3, p4, p5 + 5, p6));
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoSizes(int p0, K p1, V p2, int p3, K p4, V p5, int p6, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p7) {
        java.lang.Object[] objArr;
        if (p6 > 30) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, new java.lang.Object[]{p1, p2, p4, p5}, p7);
        }
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(p0, p6);
        int indexSegment2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(p3, p6);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new java.lang.Object[]{p1, p2, p4, p5};
            } else {
                objArr = new java.lang.Object[]{p4, p5, p1, p2};
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>((1 << indexSegment) | (1 << indexSegment2), 0, objArr, p7);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 1 << indexSegment, new java.lang.Object[]{getHighSpeedVideoSizes(p0, p1, p2, p3, p4, p5, p6 + 5, p7)}, p7);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoSizes(int p0, int p1) {
        java.lang.Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(p1 ^ this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(objArr, p0));
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighResolutionOutputSizeshNQ4ISI(int p0, int p1, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> p2) {
        p2.setSize(p2.size() - 1);
        p2.setOperationResult$runtime(getHighSpeedVideoSizes(p0));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == p2.getOwnership()) {
            this.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(this.buffer, p0);
            this.Camera2StreamConfigurationMap ^= p1;
            return this;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(p1 ^ this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(this.buffer, p0), p2.getOwnership());
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoFpsRangesFor(int p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> p1) {
        p1.setSize(p1.size() - 1);
        p1.setOperationResult$runtime(getHighSpeedVideoSizes(p0));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == p1.getOwnership()) {
            this.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(this.buffer, p0);
            return this;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(this.buffer, p0), p1.getOwnership());
    }

    private final boolean getHighSpeedVideoFpsRangesFor(K p0) {
        kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(p0, this.buffer[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return true;
        }
        return false;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoFpsRanges(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p0, int p1, int p2, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter p3, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> p4) {
        if (getHighSpeedVideoFpsRangesFor(p1)) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(p1));
            if (p0.getHighSpeedVideoFpsRangesFor(p1)) {
                return nodeAtIndex$runtime.mutablePutAll(p0.nodeAtIndex$runtime(p0.nodeIndex$runtime(p1)), p2 + 5, p3, p4);
            }
            if (!p0.hasEntryAt$runtime(p1)) {
                return nodeAtIndex$runtime;
            }
            int entryKeyIndex$runtime = p0.entryKeyIndex$runtime(p1);
            K highResolutionOutputSizeshNQ4ISI = p0.getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime);
            V highSpeedVideoSizes = p0.getHighSpeedVideoSizes(entryKeyIndex$runtime);
            int size = p4.size();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutablePut = nodeAtIndex$runtime.mutablePut(highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.hashCode() : 0, highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes, p2 + 5, p4);
            if (p4.size() == size) {
                p3.setCount(p3.getCount() + 1);
            }
            return mutablePut;
        }
        if (p0.getHighSpeedVideoFpsRangesFor(p1)) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime2 = p0.nodeAtIndex$runtime(p0.nodeIndex$runtime(p1));
            if (!hasEntryAt$runtime(p1)) {
                return nodeAtIndex$runtime2;
            }
            int entryKeyIndex$runtime2 = entryKeyIndex$runtime(p1);
            K highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime2);
            int i = p2 + 5;
            if (!nodeAtIndex$runtime2.containsKey(highResolutionOutputSizeshNQ4ISI2 != null ? highResolutionOutputSizeshNQ4ISI2.hashCode() : 0, highResolutionOutputSizeshNQ4ISI2, i)) {
                return nodeAtIndex$runtime2.mutablePut(highResolutionOutputSizeshNQ4ISI2 != null ? highResolutionOutputSizeshNQ4ISI2.hashCode() : 0, highResolutionOutputSizeshNQ4ISI2, getHighSpeedVideoSizes(entryKeyIndex$runtime2), i, p4);
            }
            p3.setCount(p3.getCount() + 1);
            return nodeAtIndex$runtime2;
        }
        int entryKeyIndex$runtime3 = entryKeyIndex$runtime(p1);
        K highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime3);
        V highSpeedVideoSizes2 = getHighSpeedVideoSizes(entryKeyIndex$runtime3);
        int entryKeyIndex$runtime4 = p0.entryKeyIndex$runtime(p1);
        K highResolutionOutputSizeshNQ4ISI4 = p0.getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime4);
        return getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI3 != null ? highResolutionOutputSizeshNQ4ISI3.hashCode() : 0, highResolutionOutputSizeshNQ4ISI3, highSpeedVideoSizes2, highResolutionOutputSizeshNQ4ISI4 != null ? highResolutionOutputSizeshNQ4ISI4.hashCode() : 0, highResolutionOutputSizeshNQ4ISI4, p0.getHighSpeedVideoSizes(entryKeyIndex$runtime4), p2 + 5, p4.getOwnership());
    }

    private final int Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoSizes == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = java.lang.Integer.bitCount(this.Camera2StreamConfigurationMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime(i).Camera2StreamConfigurationMap();
        }
        return bitCount;
    }

    private final boolean getHighSpeedVideoFpsRanges(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p0) {
        if (this == p0) {
            return true;
        }
        if (this.getHighSpeedVideoSizes != p0.getHighSpeedVideoSizes || this.Camera2StreamConfigurationMap != p0.Camera2StreamConfigurationMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != p0.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsKey(int keyHash, K key, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode = this;
        while (true) {
            int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
            if (trieNode.hasEntryAt$runtime(indexSegment)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(key, trieNode.getHighResolutionOutputSizeshNQ4ISI(trieNode.entryKeyIndex$runtime(indexSegment)));
            }
            if (!trieNode.getHighSpeedVideoFpsRangesFor(indexSegment)) {
                return false;
            }
            trieNode = trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(indexSegment));
            if (shift == 30) {
                return trieNode.getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>) key);
            }
            shift += 5;
        }
    }

    public final V get(int keyHash, K key, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode = this;
        while (true) {
            int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
            if (trieNode.hasEntryAt$runtime(indexSegment)) {
                int entryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(indexSegment);
                if (kotlin.jvm.internal.Intrinsics.areEqual(key, trieNode.getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime))) {
                    return trieNode.getHighSpeedVideoSizes(entryKeyIndex$runtime);
                }
                return null;
            }
            if (!trieNode.getHighSpeedVideoFpsRangesFor(indexSegment)) {
                return null;
            }
            trieNode = trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(indexSegment));
            if (shift == 30) {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, trieNode.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (!kotlin.jvm.internal.Intrinsics.areEqual(key, trieNode.getHighResolutionOutputSizeshNQ4ISI(first))) {
                        if (first != last) {
                            first += step2;
                        }
                    }
                    return trieNode.getHighSpeedVideoSizes(first);
                }
                return null;
            }
            shift += 5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutablePutAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> otherNode, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter intersectionCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> mutator) {
        if (this == otherNode) {
            intersectionCounter.plusAssign(Camera2StreamConfigurationMap());
            return this;
        }
        int i = 0;
        if (shift > 30) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.getHighSpeedVideoSizes == 0);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.Camera2StreamConfigurationMap == 0);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(otherNode.getHighSpeedVideoSizes == 0);
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(otherNode.Camera2StreamConfigurationMap == 0);
            java.lang.Object[] objArr = this.buffer;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            int length = this.buffer.length;
            kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, otherNode.buffer.length), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                while (true) {
                    if (!getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>) otherNode.buffer[first])) {
                        java.lang.Object[] objArr2 = otherNode.buffer;
                        copyOf[length] = objArr2[first];
                        copyOf[length + 1] = objArr2[first + 1];
                        length += 2;
                    } else {
                        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                    }
                    if (first == last) {
                        break;
                    }
                    first += step2;
                }
            }
            if (length == this.buffer.length) {
                return this;
            }
            if (length == otherNode.buffer.length) {
                return otherNode;
            }
            if (length == copyOf.length) {
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, copyOf, ownership);
            }
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(copyOf, length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, copyOf2, ownership);
        }
        int i2 = this.getHighSpeedVideoSizes | otherNode.getHighSpeedVideoSizes;
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = otherNode.Camera2StreamConfigurationMap;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        int i7 = i5;
        while (i6 != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i6);
            if (kotlin.jvm.internal.Intrinsics.areEqual(getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime(lowestOneBit)), otherNode.getHighResolutionOutputSizeshNQ4ISI(otherNode.entryKeyIndex$runtime(lowestOneBit)))) {
                i7 |= lowestOneBit;
            } else {
                i2 |= lowestOneBit;
            }
            i6 ^= lowestOneBit;
        }
        if ((i2 & i7) != 0) {
            androidx.compose.runtime.PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode = (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, mutator.getOwnership()) && this.Camera2StreamConfigurationMap == i7 && this.getHighSpeedVideoSizes == i2) ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(i7, i2, new java.lang.Object[(java.lang.Integer.bitCount(i7) * 2) + java.lang.Integer.bitCount(i2)]);
        int i8 = i2;
        int i9 = 0;
        while (i8 != 0) {
            int lowestOneBit2 = java.lang.Integer.lowestOneBit(i8);
            java.lang.Object[] objArr3 = trieNode.buffer;
            objArr3[(objArr3.length - 1) - i9] = getHighSpeedVideoFpsRanges(otherNode, lowestOneBit2, shift, intersectionCounter, mutator);
            i9++;
            i8 ^= lowestOneBit2;
        }
        while (i7 != 0) {
            int lowestOneBit3 = java.lang.Integer.lowestOneBit(i7);
            int i10 = i * 2;
            if (!otherNode.hasEntryAt$runtime(lowestOneBit3)) {
                int entryKeyIndex$runtime = entryKeyIndex$runtime(lowestOneBit3);
                trieNode.buffer[i10] = getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime);
                trieNode.buffer[i10 + 1] = getHighSpeedVideoSizes(entryKeyIndex$runtime);
            } else {
                int entryKeyIndex$runtime2 = otherNode.entryKeyIndex$runtime(lowestOneBit3);
                trieNode.buffer[i10] = otherNode.getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime2);
                trieNode.buffer[i10 + 1] = otherNode.getHighSpeedVideoSizes(entryKeyIndex$runtime2);
                if (hasEntryAt$runtime(lowestOneBit3)) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
            }
            i++;
            i7 ^= lowestOneBit3;
        }
        return getHighSpeedVideoFpsRanges(trieNode) ? this : otherNode.getHighSpeedVideoFpsRanges(trieNode) ? otherNode : trieNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<K, V> put(int keyHash, K key, V value, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<K, V> put;
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime))) {
                if (getHighSpeedVideoSizes(entryKeyIndex$runtime) == value) {
                    return null;
                }
                java.lang.Object[] objArr = this.buffer;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                copyOf[entryKeyIndex$runtime + 1] = value;
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<>(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, copyOf), 0);
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode(this.Camera2StreamConfigurationMap ^ indexSegment, this.getHighSpeedVideoSizes | indexSegment, getHighSpeedVideoFpsRangesFor(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift, null)).getHighSpeedVideoFpsRangesFor();
        }
        if (getHighSpeedVideoFpsRangesFor(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift != 30) {
                put = nodeAtIndex$runtime.put(keyHash, key, value, shift + 5);
                if (put == null) {
                    return null;
                }
            } else {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, nodeAtIndex$runtime.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (!kotlin.jvm.internal.Intrinsics.areEqual(key, nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI(first))) {
                        if (first != last) {
                            first += step2;
                        }
                    }
                    if (value == nodeAtIndex$runtime.getHighSpeedVideoSizes(first)) {
                        put = null;
                    } else {
                        java.lang.Object[] objArr2 = nodeAtIndex$runtime.buffer;
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
                        copyOf2[first + 1] = value;
                        put = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<>(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode(0, 0, copyOf2), 0);
                    }
                    if (put == null) {
                        return null;
                    }
                }
                highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.getHighResolutionOutputSizeshNQ4ISI(nodeAtIndex$runtime.buffer, 0, key, value);
                put = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode(0, 0, highResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor();
                if (put == null) {
                }
            }
            put.setNode(getHighSpeedVideoSizes(nodeIndex$runtime, indexSegment, put.getNode()));
            return put;
        }
        return getHighResolutionOutputSizeshNQ4ISI(indexSegment, (int) key, (K) value).getHighSpeedVideoFpsRangesFor();
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutablePut(int keyHash, K key, V value, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutablePut;
        java.lang.Object[] highResolutionOutputSizeshNQ4ISI;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime))) {
                mutator.setOperationResult$runtime(getHighSpeedVideoSizes(entryKeyIndex$runtime));
                if (getHighSpeedVideoSizes(entryKeyIndex$runtime) != value) {
                    return getHighSpeedVideoSizes(entryKeyIndex$runtime, (int) value, (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, int>) mutator);
                }
            } else {
                mutator.setSize(mutator.size() + 1);
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = mutator.getOwnership();
                if (this.getHighResolutionOutputSizeshNQ4ISI == ownership) {
                    this.buffer = getHighSpeedVideoFpsRangesFor(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift, ownership);
                    this.Camera2StreamConfigurationMap ^= indexSegment;
                    this.getHighSpeedVideoSizes |= indexSegment;
                    return this;
                }
                return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap ^ indexSegment, this.getHighSpeedVideoSizes | indexSegment, getHighSpeedVideoFpsRangesFor(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift, ownership), ownership);
            }
        } else if (getHighSpeedVideoFpsRangesFor(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift != 30) {
                mutablePut = nodeAtIndex$runtime.mutablePut(keyHash, key, value, shift + 5, mutator);
            } else {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, nodeAtIndex$runtime.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (!kotlin.jvm.internal.Intrinsics.areEqual(key, nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI(first))) {
                        if (first != last) {
                            first += step2;
                        }
                    }
                    mutator.setOperationResult$runtime(nodeAtIndex$runtime.getHighSpeedVideoSizes(first));
                    if (nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI == mutator.getOwnership()) {
                        nodeAtIndex$runtime.buffer[first + 1] = value;
                        mutablePut = nodeAtIndex$runtime;
                    } else {
                        mutator.setModCount$runtime(mutator.getModCount() + 1);
                        java.lang.Object[] objArr = nodeAtIndex$runtime.buffer;
                        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                        copyOf[first + 1] = value;
                        mutablePut = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, copyOf, mutator.getOwnership());
                    }
                }
                mutator.setSize(mutator.size() + 1);
                highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.getHighResolutionOutputSizeshNQ4ISI(nodeAtIndex$runtime.buffer, 0, key, value);
                mutablePut = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, highResolutionOutputSizeshNQ4ISI, mutator.getOwnership());
                break;
            }
            if (nodeAtIndex$runtime != mutablePut) {
                return getHighResolutionOutputSizeshNQ4ISI(nodeIndex$runtime, (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode) mutablePut, mutator.getOwnership());
            }
        } else {
            mutator.setSize(mutator.size() + 1);
            return getHighSpeedVideoFpsRanges(indexSegment, key, value, mutator.getOwnership());
        }
        return this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> remove(int keyHash, K key, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> remove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime))) {
                return getHighSpeedVideoSizes(entryKeyIndex$runtime, indexSegment);
            }
        } else if (getHighSpeedVideoFpsRangesFor(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift != 30) {
                remove = nodeAtIndex$runtime.remove(keyHash, key, shift + 5);
            } else {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, nodeAtIndex$runtime.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (!kotlin.jvm.internal.Intrinsics.areEqual(key, nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI(first))) {
                        if (first != last) {
                            first += step2;
                        }
                    }
                    java.lang.Object[] objArr = nodeAtIndex$runtime.buffer;
                    remove = objArr.length == 2 ? null : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(objArr, first));
                }
                remove = nodeAtIndex$runtime;
                break;
            }
            return getHighSpeedVideoFpsRangesFor(nodeAtIndex$runtime, remove, nodeIndex$runtime, indexSegment);
        }
        return this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableRemove(int keyHash, K key, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime))) {
                return getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime, indexSegment, mutator);
            }
        } else if (getHighSpeedVideoFpsRangesFor(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift != 30) {
                mutableRemove = nodeAtIndex$runtime.mutableRemove(keyHash, key, shift + 5, mutator);
            } else {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, nodeAtIndex$runtime.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (!kotlin.jvm.internal.Intrinsics.areEqual(key, nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI(first))) {
                        if (first != last) {
                            first += step2;
                        }
                    }
                    mutableRemove = nodeAtIndex$runtime.getHighSpeedVideoFpsRangesFor(first, mutator);
                }
                mutableRemove = nodeAtIndex$runtime;
                break;
            }
            return Camera2StreamConfigurationMap(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, mutator.getOwnership());
        }
        return this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> remove(int keyHash, K key, V value, int shift) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> remove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime)) && kotlin.jvm.internal.Intrinsics.areEqual(value, getHighSpeedVideoSizes(entryKeyIndex$runtime))) {
                return getHighSpeedVideoSizes(entryKeyIndex$runtime, indexSegment);
            }
        } else if (getHighSpeedVideoFpsRangesFor(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift != 30) {
                remove = nodeAtIndex$runtime.remove(keyHash, key, value, shift + 5);
            } else {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, nodeAtIndex$runtime.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (true) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(key, nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI(first)) || !kotlin.jvm.internal.Intrinsics.areEqual(value, nodeAtIndex$runtime.getHighSpeedVideoSizes(first))) {
                            if (first == last) {
                                break;
                            }
                            first += step2;
                        } else {
                            java.lang.Object[] objArr = nodeAtIndex$runtime.buffer;
                            remove = objArr.length == 2 ? null : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(0, 0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeEntryAtIndex(objArr, first));
                        }
                    }
                }
                remove = nodeAtIndex$runtime;
            }
            return getHighSpeedVideoFpsRangesFor(nodeAtIndex$runtime, remove, nodeIndex$runtime, indexSegment);
        }
        return this;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableRemove(int keyHash, K key, V value, int shift, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> mutator) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> mutableRemove;
        int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime)) && kotlin.jvm.internal.Intrinsics.areEqual(value, getHighSpeedVideoSizes(entryKeyIndex$runtime))) {
                return getHighResolutionOutputSizeshNQ4ISI(entryKeyIndex$runtime, indexSegment, mutator);
            }
        } else if (getHighSpeedVideoFpsRangesFor(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift != 30) {
                mutableRemove = nodeAtIndex$runtime.mutableRemove(keyHash, key, value, shift + 5, mutator);
            } else {
                kotlin.ranges.IntProgression step = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, nodeAtIndex$runtime.buffer.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
                    while (true) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(key, nodeAtIndex$runtime.getHighResolutionOutputSizeshNQ4ISI(first)) || !kotlin.jvm.internal.Intrinsics.areEqual(value, nodeAtIndex$runtime.getHighSpeedVideoSizes(first))) {
                            if (first == last) {
                                break;
                            }
                            first += step2;
                        } else {
                            mutableRemove = nodeAtIndex$runtime.getHighSpeedVideoFpsRangesFor(first, mutator);
                            break;
                        }
                    }
                }
                mutableRemove = nodeAtIndex$runtime;
            }
            return Camera2StreamConfigurationMap(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, mutator.getOwnership());
        }
        return this;
    }

    public final void accept$runtime(kotlin.jvm.functions.Function5<? super androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> visitor) {
        getHighSpeedVideoFpsRangesFor(visitor, 0, 0);
    }

    private final void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function5<? super androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V>, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> p0, int p1, int p2) {
        p0.invoke(this, java.lang.Integer.valueOf(p2), java.lang.Integer.valueOf(p1), java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
        int i = this.getHighSpeedVideoSizes;
        while (i != 0) {
            int lowestOneBit = java.lang.Integer.lowestOneBit(i);
            nodeAtIndex$runtime(nodeIndex$runtime(lowestOneBit)).getHighSpeedVideoFpsRangesFor(p0, (java.lang.Integer.numberOfTrailingZeros(lowestOneBit) << p2) + p1, p2 + 5);
            i -= lowestOneBit;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode getEMPTY$runtime() {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> Camera2StreamConfigurationMap(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p1, int p2, int p3, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership p4) {
        if (p1 != null) {
            return (this.getHighResolutionOutputSizeshNQ4ISI == p4 || p0 != p1) ? getHighResolutionOutputSizeshNQ4ISI(p2, (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode) p1, p4) : this;
        }
        java.lang.Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == p4) {
            this.buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeNodeAtIndex(objArr, p2);
            this.getHighSpeedVideoSizes ^= p3;
            return this;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap, p3 ^ this.getHighSpeedVideoSizes, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeNodeAtIndex(objArr, p2), p4);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> p1, int p2, int p3) {
        if (p1 != null) {
            return p0 != p1 ? getHighSpeedVideoSizes(p2, p3, p1) : this;
        }
        java.lang.Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<>(this.Camera2StreamConfigurationMap, p3 ^ this.getHighSpeedVideoSizes, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.access$removeNodeAtIndex(objArr, p2));
    }
}
