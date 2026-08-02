package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", "T", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataMigrationInitializer<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.content.core.DataMigrationInitializer.Companion INSTANCE = new androidx.content.core.DataMigrationInitializer.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\r\u001a)\b\u0001\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0011\u001a\u00020\f\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "<init>", "()V", "T", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "getInitializer", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Landroidx/datastore/core/InitializerApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> kotlin.jvm.functions.Function2<androidx.content.core.InitializerApi<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getInitializer(java.util.List<? extends androidx.content.core.DataMigration<T>> migrations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(migrations, "");
            return new androidx.content.core.DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008c -> B:13:0x006f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008f -> B:13:0x006f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> java.lang.Object getHighSpeedVideoFpsRanges(java.util.List<? extends androidx.content.core.DataMigration<T>> list, androidx.content.core.InitializerApi<T> initializerApi, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.content.core.DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            int i;
            java.util.List list2;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            java.util.Iterator<T> it;
            java.lang.Throwable th;
            if (continuation instanceof androidx.content.core.DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (androidx.content.core.DataMigrationInitializer$Companion$runMigrations$1) continuation;
                if ((dataMigrationInitializer$Companion$runMigrations$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = dataMigrationInitializer$Companion$runMigrations$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataMigrationInitializer$Companion$runMigrations$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> dataMigrationInitializer$Companion$runMigrations$2 = new androidx.content.core.DataMigrationInitializer$Companion$runMigrations$2<>(list, arrayList, null);
                        dataMigrationInitializer$Companion$runMigrations$1.getHighSpeedVideoFpsRangesFor = arrayList;
                        dataMigrationInitializer$Companion$runMigrations$1.Camera2StreamConfigurationMap = 1;
                        if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != coroutine_suspended) {
                            list2 = arrayList;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (java.util.Iterator) dataMigrationInitializer$Companion$runMigrations$1.getHighSpeedVideoSizes;
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Throwable 
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                            	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:369)
                            	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:332)
                            	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            */
                        /*
                            this = this;
                            boolean r0 = r9 instanceof androidx.content.core.DataMigrationInitializer$Companion$runMigrations$1
                            if (r0 == 0) goto L14
                            r0 = r9
                            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.content.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                            int r1 = r0.Camera2StreamConfigurationMap
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r1 = r1 & r2
                            if (r1 == 0) goto L14
                            int r9 = r0.Camera2StreamConfigurationMap
                            int r9 = r9 + r2
                            r0.Camera2StreamConfigurationMap = r9
                            goto L19
                        L14:
                            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                            r0.<init>(r6, r9)
                        L19:
                            java.lang.Object r9 = r0.getHighSpeedVideoFpsRanges
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.Camera2StreamConfigurationMap
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L47
                            if (r2 == r4) goto L3f
                            if (r2 != r3) goto L37
                            java.lang.Object r7 = r0.getHighSpeedVideoSizes
                            java.util.Iterator r7 = (java.util.Iterator) r7
                            java.lang.Object r8 = r0.getHighSpeedVideoFpsRangesFor
                            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
                            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L35
                            goto L6f
                        L35:
                            r9 = move-exception
                            goto L88
                        L37:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L3f:
                            java.lang.Object r7 = r0.getHighSpeedVideoFpsRangesFor
                            java.util.List r7 = (java.util.List) r7
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L64
                        L47:
                            kotlin.ResultKt.throwOnFailure(r9)
                            java.util.ArrayList r9 = new java.util.ArrayList
                            r9.<init>()
                            java.util.List r9 = (java.util.List) r9
                            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r2 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                            r5 = 0
                            r2.<init>(r7, r9, r5)
                            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
                            r0.getHighSpeedVideoFpsRangesFor = r9
                            r0.Camera2StreamConfigurationMap = r4
                            java.lang.Object r7 = r8.updateData(r2, r0)
                            if (r7 == r1) goto La4
                            r7 = r9
                        L64:
                            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                            r8.<init>()
                            java.lang.Iterable r7 = (java.lang.Iterable) r7
                            java.util.Iterator r7 = r7.iterator()
                        L6f:
                            boolean r9 = r7.hasNext()
                            if (r9 == 0) goto L9a
                            java.lang.Object r9 = r7.next()
                            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                            r0.getHighSpeedVideoFpsRangesFor = r8     // Catch: java.lang.Throwable -> L35
                            r0.getHighSpeedVideoSizes = r7     // Catch: java.lang.Throwable -> L35
                            r0.Camera2StreamConfigurationMap = r3     // Catch: java.lang.Throwable -> L35
                            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L35
                            if (r9 != r1) goto L6f
                            goto La4
                        L88:
                            T r2 = r8.element
                            if (r2 != 0) goto L8f
                            r8.element = r9
                            goto L6f
                        L8f:
                            T r2 = r8.element
                            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                            java.lang.Throwable r2 = (java.lang.Throwable) r2
                            kotlin.ExceptionsKt.addSuppressed(r2, r9)
                            goto L6f
                        L9a:
                            T r7 = r8.element
                            java.lang.Throwable r7 = (java.lang.Throwable) r7
                            if (r7 != 0) goto La3
                            kotlin.Unit r7 = kotlin.Unit.INSTANCE
                            return r7
                        La3:
                            throw r7
                        La4:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.content.core.DataMigrationInitializer.Companion.getHighSpeedVideoFpsRanges(java.util.List, androidx.datastore.core.InitializerApi, kotlin.coroutines.Continuation):java.lang.Object");
                    }

                    public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }
            }
