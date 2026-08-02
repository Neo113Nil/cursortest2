package androidx.room;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\t\u0010\b\u001a+\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0011\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/room/RoomDatabase;", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "p0", "useReaderConnection", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useWriterConnection", "", "", "p1", "", "validateMigrationsNotRequired", "(Ljava/util/Set;Ljava/util/Set;)V", "Landroidx/room/DatabaseConfiguration;", "validateAutoMigrations", "(Landroidx/room/RoomDatabase;Landroidx/room/DatabaseConfiguration;)V", "validateTypeConverters"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/RoomDatabaseKt")
/* loaded from: classes.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r7 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object useReaderConnection(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1;
        int i;
        if (continuation instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1) {
            roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1) continuation;
            if ((roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRanges = roomDatabase;
                    roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRangesFor = function2;
                    roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = androidx.room.util.DBUtil.getCoroutineContext(roomDatabase, false, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function2 = (kotlin.jvm.functions.Function2) roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRangesFor;
                    roomDatabase = (androidx.room.RoomDatabase) roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.coroutines.CoroutineContext plus = ((kotlin.coroutines.CoroutineContext) obj).plus(androidx.room.RoomExternalOperationElement.INSTANCE);
                androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 roomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2(roomDatabase, function2, null);
                roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRanges = null;
                roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRangesFor = null;
                roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(plus, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$2, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1);
                return withContext != coroutine_suspended ? coroutine_suspended : withContext;
            }
        }
        roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1(continuation);
        java.lang.Object obj2 = roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.coroutines.CoroutineContext plus2 = ((kotlin.coroutines.CoroutineContext) obj2).plus(androidx.room.RoomExternalOperationElement.INSTANCE);
        androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 roomDatabaseKt__RoomDatabaseKt$useReaderConnection$22 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2(roomDatabase, function2, null);
        roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRanges = null;
        roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighSpeedVideoFpsRangesFor = null;
        roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object withContext2 = kotlinx.coroutines.BuildersKt.withContext(plus2, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$22, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$1);
        if (withContext2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object useWriterConnection(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1;
        int i;
        if (continuation instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1) {
            roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1) continuation;
            if ((roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
                    roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighSpeedVideoSizes = function2;
                    roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap = 1;
                    obj = androidx.room.util.DBUtil.getCoroutineContext(roomDatabase, false, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        roomDatabase = (androidx.room.RoomDatabase) roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        roomDatabase.getInvalidationTracker().refreshAsync();
                        return obj;
                    }
                    function2 = (kotlin.jvm.functions.Function2) roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighSpeedVideoSizes;
                    roomDatabase = (androidx.room.RoomDatabase) roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.coroutines.CoroutineContext plus = ((kotlin.coroutines.CoroutineContext) obj).plus(androidx.room.RoomExternalOperationElement.INSTANCE);
                androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 roomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2(roomDatabase, function2, null);
                roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
                roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighSpeedVideoSizes = null;
                roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap = 2;
                obj = kotlinx.coroutines.BuildersKt.withContext(plus, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$2, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1);
            }
        }
        roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1(continuation);
        java.lang.Object obj2 = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        kotlin.coroutines.CoroutineContext plus2 = ((kotlin.coroutines.CoroutineContext) obj2).plus(androidx.room.RoomExternalOperationElement.INSTANCE);
        androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 roomDatabaseKt__RoomDatabaseKt$useWriterConnection$22 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2(roomDatabase, function2, null);
        roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
        roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.getHighSpeedVideoSizes = null;
        roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.Camera2StreamConfigurationMap = 2;
        obj2 = kotlinx.coroutines.BuildersKt.withContext(plus2, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$22, roomDatabaseKt__RoomDatabaseKt$useWriterConnection$1);
    }

    public static final void validateMigrationsNotRequired(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set2, "");
        if (set.isEmpty()) {
            return;
        }
        java.util.Iterator<java.lang.Integer> it = set.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (set2.contains(java.lang.Integer.valueOf(intValue))) {
                throw new java.lang.IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ".concat(java.lang.String.valueOf(intValue)).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void validateAutoMigrations(androidx.room.RoomDatabase roomDatabase, androidx.room.DatabaseConfiguration databaseConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Set<kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec>> requiredAutoMigrationSpecClasses = roomDatabase.getRequiredAutoMigrationSpecClasses();
        int size = databaseConfiguration.autoMigrationSpecs.size();
        boolean[] zArr = new boolean[size];
        for (kotlin.reflect.KClass<? extends androidx.room.migration.AutoMigrationSpec> kClass : requiredAutoMigrationSpecClasses) {
            int size2 = databaseConfiguration.autoMigrationSpecs.size() - 1;
            int i = -1;
            if (size2 >= 0) {
                while (true) {
                    int i2 = size2 - 1;
                    if (kClass.isInstance(databaseConfiguration.autoMigrationSpecs.get(size2))) {
                        zArr[size2] = true;
                        i = size2;
                        break;
                    } else if (i2 < 0) {
                        break;
                    } else {
                        size2 = i2;
                    }
                }
            }
            if (i < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("A required auto migration spec (");
                sb.append(kClass.getGetHighResolutionOutputSizeshNQ4ISI());
                sb.append(") is missing in the database configuration.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            linkedHashMap.put(kClass, databaseConfiguration.autoMigrationSpecs.get(i));
        }
        int size3 = databaseConfiguration.autoMigrationSpecs.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                if (size3 >= size || !zArr[size3]) {
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        for (androidx.room.migration.Migration migration : roomDatabase.createAutoMigrations(linkedHashMap)) {
            if (!databaseConfiguration.migrationContainer.contains(migration.startVersion, migration.endVersion)) {
                databaseConfiguration.migrationContainer.addMigration(migration);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[LOOP:1: B:5:0x0039->B:17:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void validateTypeConverters(androidx.room.RoomDatabase roomDatabase, androidx.room.DatabaseConfiguration databaseConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roomDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        java.util.Map<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> requiredTypeConverterClassesMap$room_runtime = roomDatabase.getRequiredTypeConverterClassesMap$room_runtime();
        boolean[] zArr = new boolean[databaseConfiguration.typeConverters.size()];
        for (java.util.Map.Entry<kotlin.reflect.KClass<?>, java.util.List<kotlin.reflect.KClass<?>>> entry : requiredTypeConverterClassesMap$room_runtime.entrySet()) {
            kotlin.reflect.KClass<?> key = entry.getKey();
            for (kotlin.reflect.KClass<?> kClass : entry.getValue()) {
                int size = databaseConfiguration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        if (kClass.isInstance(databaseConfiguration.typeConverters.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i < 0) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                    if (size >= 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("A required type converter (");
                        sb.append(kClass.getGetHighResolutionOutputSizeshNQ4ISI());
                        sb.append(") for ");
                        sb.append(key.getGetHighResolutionOutputSizeshNQ4ISI());
                        sb.append(" is missing in the database configuration.");
                        throw new java.lang.IllegalArgumentException(sb.toString().toString());
                    }
                    roomDatabase.addTypeConverter$room_runtime(kClass, databaseConfiguration.typeConverters.get(size));
                }
                size = -1;
                if (size >= 0) {
                }
            }
        }
        int size2 = databaseConfiguration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            if (!zArr[size2]) {
                java.lang.Object obj = databaseConfiguration.typeConverters.get(size2);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected type converter ");
                sb2.append(obj);
                sb2.append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }
}
