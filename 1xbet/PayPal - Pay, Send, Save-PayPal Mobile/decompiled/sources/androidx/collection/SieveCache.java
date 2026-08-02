package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0016\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u009a\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n\u0012<\b\u0002\u0010\u000f\u001a6\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\b\u0012\t\u0012\u00070\r¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u00020\r2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\r2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00028\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J-\u0010\u001f\u001a\u00020\u00042\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010!J\u000f\u0010\"\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\"\u0010\u0013J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010\u001bJ\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00028\u0000H\u0002¢\u0006\u0004\b)\u0010*J7\u0010,\u001a\u00020\u000e2\"\u0010+\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J,\u0010.\u001a\u00020\u000e2\u0017\u0010+\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\nH\u0080\bø\u0001\u0000¢\u0006\u0004\b.\u0010/J,\u00100\u001a\u00020\u000e2\u0017\u0010+\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u0010/J,\u00101\u001a\u00020\u000e2\u0017\u0010+\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u0010/J\u001a\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010 J\u0017\u00105\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00106J\r\u00108\u001a\u00020\r¢\u0006\u0004\b8\u0010\u0018J\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u0018J\u0018\u0010:\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b:\u0010;J\u001e\u0010:\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000<H\u0086\n¢\u0006\u0004\b:\u0010>J\u001e\u0010:\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0086\n¢\u0006\u0004\b:\u0010@J \u0010:\u001a\u00020\u000e2\u000e\u0010=\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000AH\u0086\n¢\u0006\u0004\b:\u0010BJ\u001e\u0010:\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000CH\u0086\n¢\u0006\u0004\b:\u0010DJ\u001e\u0010:\u001a\u00020\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0086\n¢\u0006\u0004\b:\u0010FJ\r\u0010G\u001a\u00020\r¢\u0006\u0004\bG\u0010\u0018J$\u0010J\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010HH\u0086\n¢\u0006\u0004\bJ\u0010KJ$\u0010J\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\n¢\u0006\u0004\bJ\u0010LJ,\u0010J\u001a\u00020\u000e2\u001a\u0010N\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0AH\u0086\n¢\u0006\u0004\bJ\u0010OJ$\u0010J\u001a\u00020\u000e2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010MH\u0086\n¢\u0006\u0004\bJ\u0010QJ*\u0010J\u001a\u00020\u000e2\u0018\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0CH\u0086\n¢\u0006\u0004\bJ\u0010DJ$\u0010J\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010RH\u0086\n¢\u0006\u0004\bJ\u0010SJ*\u0010J\u001a\u00020\u000e2\u0018\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0EH\u0086\n¢\u0006\u0004\bJ\u0010FJ\u001f\u0010T\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001¢\u0006\u0004\bT\u0010UJ!\u0010V\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010H¢\u0006\u0004\bV\u0010KJ!\u0010V\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\bV\u0010LJ)\u0010V\u001a\u00020\u000e2\u001a\u0010N\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0A¢\u0006\u0004\bV\u0010OJ'\u0010V\u001a\u00020\u000e2\u0018\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0C¢\u0006\u0004\bV\u0010DJ!\u0010V\u001a\u00020\u000e2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010R¢\u0006\u0004\bV\u0010SJ'\u0010V\u001a\u00020\u000e2\u0018\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010M0E¢\u0006\u0004\bV\u0010FJ\u0017\u0010W\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\bW\u00103J\u001d\u0010W\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001¢\u0006\u0004\bW\u0010XJ'\u0010Y\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0004\bY\u0010-J\u0019\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010ZJ\u0015\u0010[\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b[\u00106J\u0017\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\u0004H\u0000¢\u0006\u0004\b]\u00106J \u0010^\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0086\n¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020`H\u0016¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bc\u00106R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010dR\u0016\u0010e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010dR\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010dR\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0011\u0010g\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bf\u0010 R\u0017\u0010\u001f\u001a\u00020\u00048G¢\u0006\f\u0012\u0004\bi\u0010\u0013\u001a\u0004\bh\u0010 R'\u00107\u001a\u0015\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010jR\u0016\u0010k\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010dR\u0016\u0010m\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010dR\u0016\u0010o\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010dR$\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b=\u0010p\u0012\u0004\bq\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\br\u0010 R\u001c\u0010t\u001a\u00020s8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bt\u0010u\u0012\u0004\bv\u0010\u0013R\u0016\u0010l\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010uRH\u0010n\u001a6\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u000b\u0012\t\u0018\u00018\u0001¢\u0006\u0002\b\b\u0012\t\u0012\u00070\r¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010wR\u0011\u0010y\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bx\u0010 R0\u0010z\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010}\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010dR$\u0010~\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010A8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\b~\u0010p\u0012\u0004\b\u007f\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/SieveCache;", "", "K", "V", "", "maxSize", "initialCapacity", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "sizeOf", "Lkotlin/Function1;", "createValueFromKey", "Lkotlin/Function4;", "", "", "onEntryRemoved", "<init>", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "adjustStorage$collection", "()V", "predicate", "all", "(Lkotlin/jvm/functions/Function2;)Z", "any", "()Z", "key", "contains", "(Ljava/lang/Object;)Z", "containsKey", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "()I", "(Lkotlin/jvm/functions/Function2;)I", "dropDeletes$collection", "other", "equals", "evictAll", "p0", "getHighSpeedVideoSizes", "(I)I", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)I", "block", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function1;)V", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "getHighSpeedVideoFpsRangesFor", "(I)V", "Camera2StreamConfigurationMap", "isEmpty", "isNotEmpty", "minusAssign", "(Ljava/lang/Object;)V", "Landroidx/collection/ObjectList;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "(Landroidx/collection/ObjectList;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "none", "Landroidx/collection/ScatterMap;", "from", "plusAssign", "(Landroidx/collection/ScatterMap;)V", "(Landroidx/collection/SieveCache;)V", "Lkotlin/Pair;", "pairs", "([Lkotlin/Pair;)V", "pair", "(Lkotlin/Pair;)V", "", "(Ljava/util/Map;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeIf", "(I)Ljava/lang/Object;", "resize", "newCapacity", "resizeStorage$collection", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "trimToSize", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getCapacity", "capacity", "getCount", "getCount$annotations", "Lkotlin/jvm/functions/Function1;", "getInputFormats", "getHighSpeedVideoSizesFor", "getOutputFormats", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration", "[Ljava/lang/Object;", "getKeys$annotations", "getMaxSize", "", "metadata", "[J", "getMetadata$annotations", "Lkotlin/jvm/functions/Function4;", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "getOutputStallDurationlomOqCM", "Lkotlin/jvm/functions/Function2;", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "values", "getValues$annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SieveCache<K, V> {
    private final kotlin.jvm.functions.Function1<K, V> Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getOutputFormats;
    private int getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function4<K, V, V, java.lang.Boolean, kotlin.Unit> getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long[] getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private int getOutputSizes;
    private final kotlin.jvm.functions.Function2<K, V, java.lang.Integer> getOutputStallDurationlomOqCM;
    public java.lang.Object[] keys;
    public long[] metadata;
    public java.lang.Object[] values;

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SieveCache(int i, int i2, kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Integer> function2, kotlin.jvm.functions.Function1<? super K, ? extends V> function1, kotlin.jvm.functions.Function4<? super K, ? super V, ? super V, ? super java.lang.Boolean, kotlin.Unit> function4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        this.getOutputStallDurationlomOqCM = function2;
        this.Camera2StreamConfigurationMap = function1;
        this.getInputSizeshNQ4ISI = function4;
        this.metadata = androidx.collection.ScatterMapKt.EmptyGroup;
        this.keys = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS;
        this.getHighSpeedVideoSizesFor = androidx.collection.SieveCacheKt.getEmptyNodes();
        this.getOutputMinFrameDuration = Integer.MAX_VALUE;
        this.getOutputSizes = Integer.MAX_VALUE;
        this.getOutputFormats = Integer.MAX_VALUE;
        if (i <= 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        Camera2StreamConfigurationMap(androidx.collection.ScatterMapKt.unloadedCapacity(i2));
    }

    public /* synthetic */ SieveCache(int i, int i2, androidx.collection.SieveCache.AnonymousClass1 anonymousClass1, androidx.collection.SieveCache.AnonymousClass2 anonymousClass2, androidx.collection.SieveCache.AnonymousClass3 anonymousClass3, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 6 : i2, (i3 & 4) != 0 ? new kotlin.jvm.functions.Function2<K, V, java.lang.Integer>() { // from class: androidx.collection.SieveCache.1
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Integer invoke(K k, V v) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
                return 1;
            }
        } : anonymousClass1, (i3 & 8) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.collection.SieveCache.2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Void invoke(K k) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
                return null;
            }
        } : anonymousClass2, (i3 & 16) != 0 ? new kotlin.jvm.functions.Function4<K, V, V, java.lang.Boolean, kotlin.Unit>() { // from class: androidx.collection.SieveCache.3
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Boolean bool) {
                getHighSpeedVideoFpsRangesFor(obj, obj2, obj3, bool.booleanValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(K k, V v, V v2, boolean z) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
            }
        } : anonymousClass3);
    }

    /* renamed from: getSize, reason: from getter */
    public final int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getMaxSize, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getCount, reason: from getter */
    public final int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean any() {
        return this.getHighSpeedVideoFpsRanges != 0;
    }

    public final boolean none() {
        return this.getHighSpeedVideoFpsRanges == 0;
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges == 0;
    }

    public final boolean isNotEmpty() {
        return this.getHighSpeedVideoFpsRanges != 0;
    }

    private final void Camera2StreamConfigurationMap(int p0) {
        long[] jArr;
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this.getHighSpeedVideoFpsRangesFor = max;
        getHighSpeedVideoFpsRangesFor(max);
        this.keys = max == 0 ? androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS : new java.lang.Object[max];
        this.values = max == 0 ? androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS : new java.lang.Object[max];
        if (max == 0) {
            jArr = androidx.collection.SieveCacheKt.getEmptyNodes();
        } else {
            jArr = new long[max];
            kotlin.collections.ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (java.lang.Object) null);
        }
        this.getHighSpeedVideoSizesFor = jArr;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = androidx.collection.ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((p0 + 15) & (-8)) >> 3];
            kotlin.collections.ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (java.lang.Object) null);
            int i = p0 >> 3;
            long j = 255 << ((p0 & 7) << 3);
            jArr2[i] = (jArr2[i] & (~j)) | j;
            jArr = jArr2;
        }
        this.metadata = jArr;
        this.getInputFormats = androidx.collection.ScatterMapKt.loadedCapacity(this.getHighSpeedVideoFpsRangesFor) - getGetHighSpeedVideoFpsRanges();
    }

    public final V get(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((androidx.collection.SieveCache<K, V>) key);
        if (highResolutionOutputSizeshNQ4ISI < 0) {
            V invoke = this.Camera2StreamConfigurationMap.invoke(key);
            if (invoke == null) {
                return null;
            }
            put(key, invoke);
            return invoke;
        }
        long[] jArr = this.getHighSpeedVideoSizesFor;
        jArr[highResolutionOutputSizeshNQ4ISI] = (jArr[highResolutionOutputSizeshNQ4ISI] & 4611686018427387903L) | 4611686018427387904L;
        return (V) this.values[highResolutionOutputSizeshNQ4ISI];
    }

    public final void set(K key, V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        put(key, value);
    }

    public final void putAll(kotlin.Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void putAll(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void putAll(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        for (kotlin.Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void plusAssign(kotlin.Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        put(pair.getFirst(), pair.getSecond());
    }

    public final void plusAssign(kotlin.Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        putAll(pairs);
    }

    public final void plusAssign(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        putAll(pairs);
    }

    public final void plusAssign(kotlin.sequences.Sequence<? extends kotlin.Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "");
        putAll(pairs);
    }

    public final void plusAssign(java.util.Map<K, ? extends V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void plusAssign(androidx.collection.ScatterMap<K, V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final void plusAssign(androidx.collection.SieveCache<K, V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        putAll(from);
    }

    public final V remove(K key) {
        V highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((androidx.collection.SieveCache<K, V>) key);
        if (highResolutionOutputSizeshNQ4ISI2 < 0 || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2)) == null) {
            return null;
        }
        this.getHighSpeedVideoSizes -= this.getOutputStallDurationlomOqCM.invoke(key, highResolutionOutputSizeshNQ4ISI).intValue();
        this.getInputSizeshNQ4ISI.invoke(key, highResolutionOutputSizeshNQ4ISI, null, java.lang.Boolean.FALSE);
        return highResolutionOutputSizeshNQ4ISI;
    }

    public final boolean remove(K key, V value) {
        V highResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((androidx.collection.SieveCache<K, V>) key);
        if (highResolutionOutputSizeshNQ4ISI2 < 0 || !kotlin.jvm.internal.Intrinsics.areEqual(this.values[highResolutionOutputSizeshNQ4ISI2], value) || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI2)) == null) {
            return false;
        }
        this.getHighSpeedVideoSizes -= this.getOutputStallDurationlomOqCM.invoke(key, highResolutionOutputSizeshNQ4ISI).intValue();
        this.getInputSizeshNQ4ISI.invoke(key, highResolutionOutputSizeshNQ4ISI, null, java.lang.Boolean.FALSE);
        return true;
    }

    public final void minusAssign(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        remove(key);
    }

    public final void minusAssign(K[] keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        for (K k : keys) {
            remove(k);
        }
    }

    public final void minusAssign(java.lang.Iterable<? extends K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.util.Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.util.Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void resize(int maxSize) {
        this.getHighResolutionOutputSizeshNQ4ISI = maxSize;
        trimToSize(maxSize);
    }

    public final void trimToSize(int maxSize) {
        while (this.getHighSpeedVideoSizes > maxSize && getGetHighSpeedVideoFpsRanges() != 0) {
            long[] jArr = this.getHighSpeedVideoSizesFor;
            int i = this.getOutputFormats;
            if (i == Integer.MAX_VALUE) {
                i = this.getOutputSizes;
            }
            while (i != Integer.MAX_VALUE) {
                long j = jArr[i];
                if (((int) ((j >> 62) & 1)) == 0) {
                    break;
                }
                int i2 = (int) ((j >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
                jArr[i] = 4611686018427387903L & j;
                i = i2 != Integer.MAX_VALUE ? i2 : this.getOutputSizes;
            }
            int i3 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            if (i3 == Integer.MAX_VALUE) {
                i3 = Integer.MAX_VALUE;
            }
            this.getOutputFormats = i3;
            if (i == Integer.MAX_VALUE) {
                return;
            }
            java.lang.Object obj = this.keys[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            V highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                this.getHighSpeedVideoSizes -= ((java.lang.Number) this.getOutputStallDurationlomOqCM.invoke(obj, highResolutionOutputSizeshNQ4ISI)).intValue();
                this.getInputSizeshNQ4ISI.invoke(obj, highResolutionOutputSizeshNQ4ISI, null, java.lang.Boolean.TRUE);
            }
        }
    }

    public final void forEach(kotlin.jvm.functions.Function2<? super K, ? super V, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = objArr2[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        block.invoke(obj, obj2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        java.lang.Object obj = objArr[(i << 3) + i3];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        block.invoke(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(kotlin.jvm.functions.Function1<? super V, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.lang.Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        java.lang.Object obj = objArr[(i << 3) + i3];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        block.invoke(obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int count() {
        return getGetHighSpeedVideoSizes();
    }

    public final boolean contains(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getHighResolutionOutputSizeshNQ4ISI((androidx.collection.SieveCache<K, V>) key) >= 0;
    }

    public final boolean containsKey(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return getHighResolutionOutputSizeshNQ4ISI((androidx.collection.SieveCache<K, V>) key) >= 0;
    }

    public final boolean containsValue(V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.lang.Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i << 3) + i3];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                            if (kotlin.jvm.internal.Intrinsics.areEqual(value, obj)) {
                                return true;
                            }
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
        return false;
    }

    private final V getHighResolutionOutputSizeshNQ4ISI(int p0) {
        this.getHighSpeedVideoFpsRanges--;
        long[] jArr = this.metadata;
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        this.keys[p0] = null;
        java.lang.Object[] objArr = this.values;
        V v = (V) objArr[p0];
        objArr[p0] = null;
        long[] jArr2 = this.getHighSpeedVideoSizesFor;
        long j2 = jArr2[p0];
        int i4 = (int) ((j2 >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
        int i5 = (int) (j2 & androidx.collection.SieveCacheKt.NodeLinkMask);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) | (i5 & androidx.collection.SieveCacheKt.NodeLinkMask);
        } else {
            this.getOutputMinFrameDuration = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((i4 & androidx.collection.SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i5] & androidx.collection.SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.getOutputSizes = i4;
        }
        if (this.getOutputFormats == p0) {
            this.getOutputFormats = i4;
        }
        jArr2[p0] = 4611686018427387903L;
        return v;
    }

    private final int getHighSpeedVideoSizes(int p0) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final void adjustStorage$collection() {
        if (this.getHighSpeedVideoFpsRangesFor > 8 && java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(getGetHighSpeedVideoFpsRanges()) * 32), kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(this.getHighSpeedVideoFpsRangesFor) * 25)) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(androidx.collection.ScatterMapKt.nextCapacity(this.getHighSpeedVideoFpsRangesFor));
        }
    }

    public final void dropDeletes$collection() {
        long j;
        long j2;
        int i;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr2 = this.getHighSpeedVideoSizesFor;
        long[] jArr3 = new long[i2];
        long j3 = 9223372034707292159L;
        kotlin.collections.ArraysKt.fill(jArr3, 9223372034707292159L, 0, i2);
        for (int i3 = 0; i3 < ((i2 + 7) >> 3); i3++) {
            long j4 = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j4) + (j4 >>> 7));
        }
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(jArr);
        int i4 = lastIndex - 1;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i5 = 0;
        while (i5 != i2) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j5 = (jArr[i6] >> i7) & 255;
            if (j5 != 128 && j5 == 254) {
                java.lang.Object obj = objArr[i5];
                int hashCode = (obj != null ? obj.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                int highSpeedVideoSizes = getHighSpeedVideoSizes(i8);
                int i9 = i8 & i2;
                if (((highSpeedVideoSizes - i9) & i2) / 8 == ((i5 - i9) & i2) / 8) {
                    jArr[i6] = ((r17 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    if (jArr3[i5] == j3) {
                        long j6 = i5;
                        jArr3[i5] = j6 | (j6 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[0];
                    i5++;
                } else {
                    int i10 = highSpeedVideoSizes >> 3;
                    long j7 = jArr[i10];
                    int i11 = (highSpeedVideoSizes & 7) << 3;
                    if (((j7 >> i11) & 255) == 128) {
                        jArr[i10] = ((r17 & 127) << i11) | (j7 & (~(255 << i11)));
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        objArr[highSpeedVideoSizes] = objArr[i5];
                        objArr[i5] = null;
                        objArr2[highSpeedVideoSizes] = objArr2[i5];
                        objArr2[i5] = null;
                        jArr2[highSpeedVideoSizes] = jArr2[i5];
                        jArr2[i5] = 4611686018427387903L;
                        int i12 = (int) ((jArr3[i5] >> 32) & 4294967295L);
                        if (i12 != Integer.MAX_VALUE) {
                            jArr3[i12] = highSpeedVideoSizes | (jArr3[i12] & (-4294967296L));
                            jArr3[i5] = (jArr3[i5] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i5] = highSpeedVideoSizes | 9223372032559808512L;
                        }
                        jArr3[highSpeedVideoSizes] = (i5 << 32) | androidx.collection.SieveCacheKt.NodeLinkMask;
                    } else {
                        jArr[i10] = ((r17 & 127) << i11) | (j7 & (~(255 << i11)));
                        java.lang.Object obj2 = objArr[highSpeedVideoSizes];
                        objArr[highSpeedVideoSizes] = objArr[i5];
                        objArr[i5] = obj2;
                        java.lang.Object obj3 = objArr2[highSpeedVideoSizes];
                        objArr2[highSpeedVideoSizes] = objArr2[i5];
                        objArr2[i5] = obj3;
                        long j8 = jArr2[highSpeedVideoSizes];
                        jArr2[highSpeedVideoSizes] = jArr2[i5];
                        jArr2[i5] = j8;
                        int i13 = (int) ((jArr3[i5] >> 32) & 4294967295L);
                        if (i13 != Integer.MAX_VALUE) {
                            long j9 = highSpeedVideoSizes;
                            jArr3[i13] = (jArr3[i13] & (-4294967296L)) | j9;
                            jArr3[i5] = (j9 << 32) | (jArr3[i5] & 4294967295L);
                        } else {
                            long j10 = highSpeedVideoSizes;
                            jArr3[i5] = j10 | (j10 << 32);
                            i13 = i5;
                        }
                        jArr3[highSpeedVideoSizes] = (i13 << 32) | i5;
                        i5--;
                    }
                    jArr[jArr.length - 1] = jArr[0];
                }
            }
            i5++;
            j3 = 9223372034707292159L;
        }
        this.getInputFormats = androidx.collection.ScatterMapKt.loadedCapacity(this.getHighSpeedVideoFpsRangesFor) - getGetHighSpeedVideoFpsRanges();
        long[] jArr4 = this.getHighSpeedVideoSizesFor;
        int length = jArr4.length;
        for (int i14 = 0; i14 < length; i14++) {
            long j11 = jArr4[i14];
            int i15 = (int) ((j11 >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            int i16 = (int) (j11 & androidx.collection.SieveCacheKt.NodeLinkMask);
            if (i15 == Integer.MAX_VALUE) {
                i = Integer.MAX_VALUE;
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
                i = (int) (jArr3[i15] & 4294967295L);
            }
            jArr4[i14] = (((j11 & androidx.collection.SieveCacheKt.NodeMetaMask) | i) << 31) | (i16 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr3[i16] & j2));
        }
        int i17 = this.getOutputMinFrameDuration;
        if (i17 != Integer.MAX_VALUE) {
            j = 4294967295L;
            this.getOutputMinFrameDuration = (int) (jArr3[i17] & 4294967295L);
        } else {
            j = 4294967295L;
        }
        int i18 = this.getOutputSizes;
        if (i18 != Integer.MAX_VALUE) {
            this.getOutputSizes = (int) (jArr3[i18] & j);
        }
        int i19 = this.getOutputFormats;
        if (i19 != Integer.MAX_VALUE) {
            this.getOutputFormats = (int) (jArr3[i19] & j);
        }
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        java.lang.Object[] objArr;
        int i;
        int[] iArr;
        long[] jArr2 = this.metadata;
        java.lang.Object[] objArr2 = this.keys;
        java.lang.Object[] objArr3 = this.values;
        long[] jArr3 = this.getHighSpeedVideoSizesFor;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int[] iArr2 = new int[i2];
        Camera2StreamConfigurationMap(newCapacity);
        long[] jArr4 = this.metadata;
        java.lang.Object[] objArr4 = this.keys;
        java.lang.Object[] objArr5 = this.values;
        long[] jArr5 = this.getHighSpeedVideoSizesFor;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                java.lang.Object obj = objArr2[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i5 = hashCode ^ (hashCode << 16);
                int highSpeedVideoSizes = getHighSpeedVideoSizes(i5 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j = i5 & 127;
                int i6 = highSpeedVideoSizes >> 3;
                int i7 = (highSpeedVideoSizes & 7) << 3;
                i = i2;
                iArr = iArr2;
                long j2 = (j << i7) | (jArr4[i6] & (~(255 << i7)));
                jArr4[i6] = j2;
                jArr4[(((highSpeedVideoSizes - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr4[highSpeedVideoSizes] = obj;
                objArr5[highSpeedVideoSizes] = objArr3[i4];
                jArr5[highSpeedVideoSizes] = jArr3[i4];
                iArr[i4] = highSpeedVideoSizes;
            } else {
                jArr = jArr2;
                objArr = objArr2;
                i = i2;
                iArr = iArr2;
            }
            i4++;
            jArr2 = jArr;
            objArr2 = objArr;
            i2 = i;
            iArr2 = iArr;
        }
        int[] iArr3 = iArr2;
        long[] jArr6 = this.getHighSpeedVideoSizesFor;
        int length = jArr6.length;
        int i8 = 0;
        while (true) {
            int i9 = Integer.MAX_VALUE;
            if (i8 >= length) {
                break;
            }
            long j3 = jArr6[i8];
            int i10 = (int) ((j3 >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            int i11 = (int) (j3 & androidx.collection.SieveCacheKt.NodeLinkMask);
            long j4 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr3[i10];
            if (i11 != Integer.MAX_VALUE) {
                i9 = iArr3[i11];
            }
            jArr6[i8] = (((j3 & androidx.collection.SieveCacheKt.NodeMetaMask) | j4) << 31) | i9;
            i8++;
        }
        int i12 = this.getOutputMinFrameDuration;
        if (i12 != Integer.MAX_VALUE) {
            this.getOutputMinFrameDuration = iArr3[i12];
        }
        int i13 = this.getOutputSizes;
        if (i13 != Integer.MAX_VALUE) {
            this.getOutputSizes = iArr3[i13];
        }
        int i14 = this.getOutputFormats;
        if (i14 != Integer.MAX_VALUE) {
            this.getOutputFormats = iArr3[i14];
        }
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(java.lang.Integer.valueOf((i << 3) + i3));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof androidx.collection.SieveCache)) {
            return false;
        }
        androidx.collection.SieveCache sieveCache = (androidx.collection.SieveCache) other;
        if (sieveCache.getGetHighSpeedVideoSizes() != getGetHighSpeedVideoSizes() || sieveCache.getHighSpeedVideoFpsRanges != this.getHighSpeedVideoFpsRanges) {
            return false;
        }
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = objArr2[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj2, sieveCache.get(obj))) {
                            return false;
                        }
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
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SieveCache[maxSize=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", size=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", capacity=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", count=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final void putAll(java.util.Map<K, ? extends V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        for (java.util.Map.Entry<K, ? extends V> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(androidx.collection.ScatterMap<K, V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.Object[] objArr = from.keys;
        java.lang.Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        put(objArr[i4], objArr2[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(androidx.collection.SieveCache<K, V> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.Object[] objArr = from.keys;
        java.lang.Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = objArr2[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        put(obj, obj2);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = this.keys[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = this.values[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            V highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i4);
                            if (highResolutionOutputSizeshNQ4ISI == null) {
                                return;
                            }
                            this.getHighSpeedVideoSizes -= ((java.lang.Number) this.getOutputStallDurationlomOqCM.invoke(obj, highResolutionOutputSizeshNQ4ISI)).intValue();
                            this.getInputSizeshNQ4ISI.invoke(obj, highResolutionOutputSizeshNQ4ISI, null, java.lang.Boolean.FALSE);
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ScatterSet<K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.lang.Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ObjectList<K> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.lang.Object[] objArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    public final boolean all(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = objArr2[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        if (!predicate.invoke(obj, obj2).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
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
                            java.lang.Object obj = objArr[i4];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                            java.lang.Object obj2 = objArr2[i4];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                            if (predicate.invoke(obj, obj2).booleanValue()) {
                                return true;
                            }
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
        return false;
    }

    public final int count(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        java.lang.Object obj = objArr[i5];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = objArr2[i5];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(K p0) {
        int i = 0;
        int hashCode = (p0 != null ? p0.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = (hashCode ^ (hashCode << 16)) >>> 7;
        while (true) {
            int i4 = i3 & i2;
            long[] jArr = this.metadata;
            int i5 = i4 >> 3;
            int i6 = (i4 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = ((r1 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i2;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[numberOfTrailingZeros], p0)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i3 = i4 + i;
        }
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.keys;
        java.lang.Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        java.lang.Object obj = objArr[i5];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        java.lang.Object obj2 = objArr2[i5];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        i2 += obj2.hashCode() ^ obj.hashCode();
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r3 = getHighSpeedVideoSizes(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r21.getInputFormats != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (((r21.metadata[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        adjustStorage$collection();
        r3 = getHighSpeedVideoSizes(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        r21.getHighSpeedVideoFpsRanges++;
        r4 = r21.getInputFormats;
        r8 = r21.metadata;
        r9 = r3 >> 3;
        r10 = r8[r9];
        r12 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (((r10 >> r12) & 255) != 128) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        r21.getInputFormats = r4 - r15;
        r4 = r21.getHighSpeedVideoFpsRangesFor;
        r5 = ((~(255 << r12)) & r10) | (r11 << r12);
        r8[r9] = r5;
        r8[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r5;
        r13 = ~r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        r15 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V put(K key, V value) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        int hashCode = (key != null ? key.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        int i6 = i3 & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            int i10 = i4;
            long j3 = j ^ (j2 * androidx.collection.ScatterMapKt.BitmaskLsb);
            long j4 = (j3 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j3) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.keys[i], key)) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
        }
        if (i < 0) {
            i = ~i;
        }
        java.lang.Object[] objArr = this.values;
        V v = (V) objArr[i];
        objArr[i] = value;
        this.keys[i] = key;
        int intValue = this.getHighSpeedVideoSizes + this.getOutputStallDurationlomOqCM.invoke(key, value).intValue();
        this.getHighSpeedVideoSizes = intValue;
        if (v != null) {
            this.getHighSpeedVideoSizes = intValue - ((java.lang.Number) this.getOutputStallDurationlomOqCM.invoke(key, v)).intValue();
            this.getInputSizeshNQ4ISI.invoke(key, v, value, java.lang.Boolean.FALSE);
            trimToSize(this.getHighResolutionOutputSizeshNQ4ISI);
            return v;
        }
        trimToSize(this.getHighResolutionOutputSizeshNQ4ISI);
        long[] jArr2 = this.getHighSpeedVideoSizesFor;
        int i11 = this.getOutputMinFrameDuration;
        jArr2[i] = (i11 & androidx.collection.SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i11 != Integer.MAX_VALUE) {
            jArr2[i11] = (jArr2[i11] & androidx.collection.SieveCacheKt.NodeMetaAndNextMask) | ((androidx.collection.SieveCacheKt.NodeLinkMask & i) << 31);
        }
        this.getOutputMinFrameDuration = i;
        if (this.getOutputSizes == Integer.MAX_VALUE) {
            this.getOutputSizes = i;
        }
        return v;
    }
}
