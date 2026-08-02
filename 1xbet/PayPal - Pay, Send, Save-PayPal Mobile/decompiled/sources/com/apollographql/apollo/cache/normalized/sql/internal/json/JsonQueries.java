package com.apollographql.apollo.cache.normalized.sql.internal.json;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002./B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\"\u0010\f\u001a\u001e\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0011JO\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\"\u0010\f\u001a\u001e\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0013\u0010\u0016JL\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0007*\u00020\u00062-\u0010\f\u001a)\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000b\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\r¢\u0006\u0004\b\u0019\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b¢\u0006\u0004\b+\u0010#J\r\u0010,\u001a\u00020!¢\u0006\u0004\b,\u0010-"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;", "Lapp/cash/sqldelight/TransacterImpl;", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "<init>", "(Lapp/cash/sqldelight/db/SqlDriver;)V", "", "T", "", "key", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "mapper", "Lapp/cash/sqldelight/Query;", "recordForKey", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lapp/cash/sqldelight/Query;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/RecordForKey;", "(Ljava/lang/String;)Lapp/cash/sqldelight/Query;", "", "recordsForKeys", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function2;)Lapp/cash/sqldelight/Query;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/RecordsForKeys;", "(Ljava/util/Collection;)Lapp/cash/sqldelight/Query;", "Lkotlin/Function3;", "", "selectRecords", "(Lkotlin/jvm/functions/Function3;)Lapp/cash/sqldelight/Query;", "Lcom/apollographql/apollo/cache/normalized/sql/internal/json/Records;", "()Lapp/cash/sqldelight/Query;", "Lapp/cash/sqldelight/ExecutableQuery;", "changes", "()Lapp/cash/sqldelight/ExecutableQuery;", "record", "", "insert", "(Ljava/lang/String;Ljava/lang/String;)V", "update", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "deleteRecords", "(Ljava/util/Collection;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "value_", "deleteRecordsWithKeyMatching", "deleteAll", "()V", "RecordForKeyQuery", "RecordsForKeysQuery"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonQueries extends app.cash.sqldelight.TransacterImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonQueries(app.cash.sqldelight.db.SqlDriver sqlDriver) {
        super(sqlDriver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
    }

    public final <T> app.cash.sqldelight.Query<T> recordForKey(java.lang.String key, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends T> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordForKeyQuery(this, key, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.m9971$r8$lambda$C_3bDSSEPnfP0no_g4fnScC5o4(kotlin.jvm.functions.Function2.this, (app.cash.sqldelight.db.SqlCursor) obj);
            }
        });
    }

    public final app.cash.sqldelight.Query<com.apollographql.apollo.cache.normalized.sql.internal.json.RecordForKey> recordForKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return recordForKey(key, new kotlin.jvm.functions.Function2() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$NT99ASdSS56JsXd7qTLpbBZTF7Q((java.lang.String) obj, (java.lang.String) obj2);
            }
        });
    }

    public final <T> app.cash.sqldelight.Query<T> recordsForKeys(java.util.Collection<java.lang.String> key, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, ? extends T> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordsForKeysQuery(this, key, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$gcDJEuxArmSdW1HaAaPPR2WgmKQ(kotlin.jvm.functions.Function2.this, (app.cash.sqldelight.db.SqlCursor) obj);
            }
        });
    }

    public final app.cash.sqldelight.Query<com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys> recordsForKeys(java.util.Collection<java.lang.String> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return recordsForKeys(key, new kotlin.jvm.functions.Function2() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$iKB_MKVDzVybaJKBLsq56KYVMIE((java.lang.String) obj, (java.lang.String) obj2);
            }
        });
    }

    public final <T> app.cash.sqldelight.Query<T> selectRecords(final kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, ? extends T> mapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapper, "");
        return app.cash.sqldelight.QueryKt.Query(-2109402814, new java.lang.String[]{"records"}, getDriver(), "json.sq", "selectRecords", "SELECT * FROM records", new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$R_6E3o0UBUrJ9ojJQWJ25hw9Uk4(kotlin.jvm.functions.Function3.this, (app.cash.sqldelight.db.SqlCursor) obj);
            }
        });
    }

    public final app.cash.sqldelight.Query<com.apollographql.apollo.cache.normalized.sql.internal.json.Records> selectRecords() {
        return selectRecords(new kotlin.jvm.functions.Function3() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$j8PbuWk4mnWjaxVlFYYPAf5zAKg(((java.lang.Long) obj).longValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public final app.cash.sqldelight.ExecutableQuery<java.lang.Long> changes() {
        return app.cash.sqldelight.QueryKt.Query(-837538977, getDriver(), "json.sq", "changes", "SELECT changes()", new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$JL52DGKp6XObVPcYWYEm8mbwlTA((app.cash.sqldelight.db.SqlCursor) obj));
            }
        });
    }

    public final void insert(final java.lang.String key, final java.lang.String record) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        getDriver().execute(-1927383395, "INSERT INTO records (key, record) VALUES (?,?)", 2, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$01U7iKcJ5U79Rvhv7EXQnoeETqQ(key, record, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
            }
        });
        notifyQueries(-1927383395, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$szXut2wGX3zcSRyLghGCLBgWjfk((kotlin.jvm.functions.Function1) obj);
            }
        });
    }

    public final void update(final java.lang.String record, final java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        getDriver().execute(-1582437203, "UPDATE records SET record=? WHERE key=?", 2, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$B_L6go1y2UIJEWhW3RB_KW15XLs(record, key, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
            }
        });
        notifyQueries(-1582437203, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$MRHtAkVsbhD5es4nQrj3tV2arjE((kotlin.jvm.functions.Function1) obj);
            }
        });
    }

    public final void delete(final java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        getDriver().execute(-2079049329, "DELETE FROM records WHERE key=?", 1, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$ABIOuK1yc816epgtuRCpwaR2M8M(key, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
            }
        });
        notifyQueries(-2079049329, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$HYQncbr0HF4z2sMwzwZrydp3Oz0((kotlin.jvm.functions.Function1) obj);
            }
        });
    }

    public final void deleteRecords(final java.util.Collection<java.lang.String> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        getDriver().execute(null, "DELETE FROM records WHERE key IN ".concat(java.lang.String.valueOf(createArguments(key.size()))), key.size(), new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$Rw0MCJu5qS0hSnqMRlNRJsg1vLU(key, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
            }
        });
        notifyQueries(1257336243, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$sDsuv18Hf5g3oA8k_kvBfAJGn0s((kotlin.jvm.functions.Function1) obj);
            }
        });
    }

    public final void deleteRecordsWithKeyMatching(final java.lang.String value, final java.lang.String value_) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value_, "");
        getDriver().execute(-1269330781, "DELETE FROM records WHERE key LIKE ? ESCAPE ?", 2, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.m9972$r8$lambda$_9jIyxfSEDgOTOWz7wQ4DezrDU(value, value_, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
            }
        });
        notifyQueries(-1269330781, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.m9973$r8$lambda$mpNlKwJ9iOlTuBfSjLXOxmLiWk((kotlin.jvm.functions.Function1) obj);
            }
        });
    }

    public final void deleteAll() {
        app.cash.sqldelight.db.SqlDriver.DefaultImpls.execute$default(getDriver(), 764881298, "DELETE FROM records", 0, null, 8, null);
        notifyQueries(764881298, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.$r8$lambda$PjQFpKWj0fg3v5mTYbCMShoq9Tw((kotlin.jvm.functions.Function1) obj);
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u00102\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries$RecordForKeyQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "", "p0", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "p1", "<init>", "(Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lapp/cash/sqldelight/Query$Listener;", "", "addListener", "(Lapp/cash/sqldelight/Query$Listener;)V", "removeListener", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/db/QueryResult;", "execute", "(Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RecordForKeyQuery<T> extends app.cash.sqldelight.Query<T> {
        final /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries getHighSpeedVideoFpsRanges;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordForKeyQuery(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries jsonQueries, java.lang.String str, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends T> function1) {
            super(function1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighSpeedVideoFpsRanges = jsonQueries;
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(app.cash.sqldelight.Query.Listener p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.getHighSpeedVideoFpsRanges.getDriver().addListener(new java.lang.String[]{"records"}, p0);
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(app.cash.sqldelight.Query.Listener p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.getHighSpeedVideoFpsRanges.getDriver().removeListener(new java.lang.String[]{"records"}, p0);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final <R> app.cash.sqldelight.db.QueryResult<R> execute(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighSpeedVideoFpsRanges.getDriver().executeQuery(231393643, "SELECT key, record FROM records WHERE key=?", p0, 1, new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$RecordForKeyQuery$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordForKeyQuery.getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordForKeyQuery.this, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
                }
            });
        }

        public final java.lang.String toString() {
            return "json.sq:recordForKey";
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordForKeyQuery recordForKeyQuery, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
            sqlPreparedStatement.bindString(0, recordForKeyQuery.getHighSpeedVideoFpsRangesFor);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u00112\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00120\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries$RecordsForKeysQuery;", "", "T", "Lapp/cash/sqldelight/Query;", "", "", "p0", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "p1", "<init>", "(Lcom/apollographql/apollo/cache/normalized/sql/internal/json/JsonQueries;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)V", "Lapp/cash/sqldelight/Query$Listener;", "", "addListener", "(Lapp/cash/sqldelight/Query$Listener;)V", "removeListener", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lapp/cash/sqldelight/db/QueryResult;", "execute", "(Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/db/QueryResult;", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Collection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RecordsForKeysQuery<T> extends app.cash.sqldelight.Query<T> {
        private final java.util.Collection<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries getHighSpeedVideoFpsRanges;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordsForKeysQuery(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries jsonQueries, java.util.Collection<java.lang.String> collection, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends T> function1) {
            super(function1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighSpeedVideoFpsRanges = jsonQueries;
            this.getHighResolutionOutputSizeshNQ4ISI = collection;
        }

        @Override // app.cash.sqldelight.Query
        public final void addListener(app.cash.sqldelight.Query.Listener p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.getHighSpeedVideoFpsRanges.getDriver().addListener(new java.lang.String[]{"records"}, p0);
        }

        @Override // app.cash.sqldelight.Query
        public final void removeListener(app.cash.sqldelight.Query.Listener p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.getHighSpeedVideoFpsRanges.getDriver().removeListener(new java.lang.String[]{"records"}, p0);
        }

        @Override // app.cash.sqldelight.ExecutableQuery
        public final <R> app.cash.sqldelight.db.QueryResult<R> execute(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighSpeedVideoFpsRanges.getDriver().executeQuery(null, "SELECT key, record FROM records WHERE key IN ".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges.createArguments(this.getHighResolutionOutputSizeshNQ4ISI.size()))), p0, this.getHighResolutionOutputSizeshNQ4ISI.size(), new kotlin.jvm.functions.Function1() { // from class: com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries$RecordsForKeysQuery$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordsForKeysQuery.getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordsForKeysQuery.this, (app.cash.sqldelight.db.SqlPreparedStatement) obj);
                }
            });
        }

        public final java.lang.String toString() {
            return "json.sq:recordsForKeys";
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.apollographql.apollo.cache.normalized.sql.internal.json.JsonQueries.RecordsForKeysQuery recordsForKeysQuery, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
            int i = 0;
            for (T t : recordsForKeysQuery.getHighResolutionOutputSizeshNQ4ISI) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                sqlPreparedStatement.bindString(i, (java.lang.String) t);
                i++;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$01U7iKcJ5U79Rvhv7EXQnoeETqQ(java.lang.String str, java.lang.String str2, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
        sqlPreparedStatement.bindString(0, str);
        sqlPreparedStatement.bindString(1, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ABIOuK1yc816epgtuRCpwaR2M8M(java.lang.String str, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
        sqlPreparedStatement.bindString(0, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B_L6go1y2UIJEWhW3RB_KW15XLs(java.lang.String str, java.lang.String str2, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
        sqlPreparedStatement.bindString(0, str);
        sqlPreparedStatement.bindString(1, str2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C_3bD-SSEPnfP0no_g4fnScC5o4, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m9971$r8$lambda$C_3bDSSEPnfP0no_g4fnScC5o4(kotlin.jvm.functions.Function2 function2, app.cash.sqldelight.db.SqlCursor sqlCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
        java.lang.String string = sqlCursor.getString(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        java.lang.String string2 = sqlCursor.getString(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        return function2.invoke(string, string2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HYQncbr0HF4z2sMwzwZrydp3Oz0(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke("records");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ long $r8$lambda$JL52DGKp6XObVPcYWYEm8mbwlTA(app.cash.sqldelight.db.SqlCursor sqlCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
        java.lang.Long l = sqlCursor.getLong(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(l);
        return l.longValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MRHtAkVsbhD5es4nQrj3tV2arjE(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke("records");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.RecordForKey $r8$lambda$NT99ASdSS56JsXd7qTLpbBZTF7Q(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.RecordForKey(str, str2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PjQFpKWj0fg3v5mTYbCMShoq9Tw(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke("records");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$R_6E3o0UBUrJ9ojJQWJ25hw9Uk4(kotlin.jvm.functions.Function3 function3, app.cash.sqldelight.db.SqlCursor sqlCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
        java.lang.Long l = sqlCursor.getLong(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(l);
        java.lang.String string = sqlCursor.getString(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        java.lang.String string2 = sqlCursor.getString(2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        return function3.invoke(l, string, string2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rw0MCJu5qS0hSnqMRlNRJsg1vLU(java.util.Collection collection, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
        int i = 0;
        for (java.lang.Object obj : collection) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            sqlPreparedStatement.bindString(i, (java.lang.String) obj);
            i++;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_9jIy-xfSEDgOTOWz7wQ4DezrDU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9972$r8$lambda$_9jIyxfSEDgOTOWz7wQ4DezrDU(java.lang.String str, java.lang.String str2, app.cash.sqldelight.db.SqlPreparedStatement sqlPreparedStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlPreparedStatement, "");
        sqlPreparedStatement.bindString(0, str);
        sqlPreparedStatement.bindString(1, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$gcDJEuxArmSdW1HaAaPPR2WgmKQ(kotlin.jvm.functions.Function2 function2, app.cash.sqldelight.db.SqlCursor sqlCursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlCursor, "");
        java.lang.String string = sqlCursor.getString(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        java.lang.String string2 = sqlCursor.getString(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
        return function2.invoke(string, string2);
    }

    public static /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys $r8$lambda$iKB_MKVDzVybaJKBLsq56KYVMIE(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.RecordsForKeys(str, str2);
    }

    public static /* synthetic */ com.apollographql.apollo.cache.normalized.sql.internal.json.Records $r8$lambda$j8PbuWk4mnWjaxVlFYYPAf5zAKg(long j, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.apollographql.apollo.cache.normalized.sql.internal.json.Records(j, str, str2);
    }

    /* renamed from: $r8$lambda$mpNlKwJ9iOlTuBf-SjLXOxmLiWk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9973$r8$lambda$mpNlKwJ9iOlTuBfSjLXOxmLiWk(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke("records");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sDsuv18Hf5g3oA8k_kvBfAJGn0s(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke("records");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$szXut2wGX3zcSRyLghGCLBgWjfk(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke("records");
        return kotlin.Unit.INSTANCE;
    }
}
