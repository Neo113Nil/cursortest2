package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\t\n\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0001\u0002\u000b\f"}, d2 = {"Lcom/apollographql/apollo/api/Optional;", "V", "", "<init>", "()V", "getOrNull", "()Ljava/lang/Object;", "getOrThrow", "Companion", "Present", "Absent", "Lcom/apollographql/apollo/api/Optional$Absent;", "Lcom/apollographql/apollo/api/Optional$Present;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Optional<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.api.Optional.Companion INSTANCE = new com.apollographql.apollo.api.Optional.Companion(null);

    private Optional() {
    }

    public final V getOrNull() {
        com.apollographql.apollo.api.Optional.Present present = this instanceof com.apollographql.apollo.api.Optional.Present ? (com.apollographql.apollo.api.Optional.Present) this : null;
        if (present != null) {
            return (V) present.getValue();
        }
        return null;
    }

    public final V getOrThrow() {
        if (this instanceof com.apollographql.apollo.api.Optional.Present) {
            return (V) ((com.apollographql.apollo.api.Optional.Present) this).getValue();
        }
        throw new com.apollographql.apollo.exception.MissingValueException();
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Present;", "V", "Lcom/apollographql/apollo/api/Optional;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional$Present;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Present<V> extends com.apollographql.apollo.api.Optional<V> {
        private final V value;

        public Present(V v) {
            super(null);
            this.value = v;
        }

        public final V getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Present(value=");
            sb.append(this.value);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            V v = this.value;
            if (v == null) {
                return 0;
            }
            return v.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.apollographql.apollo.api.Optional.Present) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.apollographql.apollo.api.Optional.Present) other).value);
        }

        public final com.apollographql.apollo.api.Optional.Present<V> copy(V value) {
            return new com.apollographql.apollo.api.Optional.Present<>(value);
        }

        public final V component1() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.apollographql.apollo.api.Optional.Present copy$default(com.apollographql.apollo.api.Optional.Present present, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = present.value;
            }
            return present.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Absent;", "Lcom/apollographql/apollo/api/Optional;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Absent extends com.apollographql.apollo.api.Optional {
        public static final com.apollographql.apollo.api.Optional.Absent INSTANCE = new com.apollographql.apollo.api.Optional.Absent();

        private Absent() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\u0007*\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/apollographql/apollo/api/Optional$Companion;", "", "<init>", "()V", "Lcom/apollographql/apollo/api/Optional$Absent;", "absent", "()Lcom/apollographql/apollo/api/Optional$Absent;", "V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/apollographql/apollo/api/Optional$Present;", "present", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional$Present;", "Lcom/apollographql/apollo/api/Optional;", "presentIfNotNull", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.apollographql.apollo.api.Optional.Absent absent() {
            return com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        }

        @kotlin.jvm.JvmStatic
        public final <V> com.apollographql.apollo.api.Optional.Present<V> present(V value) {
            return new com.apollographql.apollo.api.Optional.Present<>(value);
        }

        @kotlin.jvm.JvmStatic
        public final <V> com.apollographql.apollo.api.Optional<V> presentIfNotNull(V value) {
            return value == null ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : new com.apollographql.apollo.api.Optional.Present(value);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final <V> com.apollographql.apollo.api.Optional<V> presentIfNotNull(V v) {
        return INSTANCE.presentIfNotNull(v);
    }

    @kotlin.jvm.JvmStatic
    public static final <V> com.apollographql.apollo.api.Optional.Present<V> present(V v) {
        return INSTANCE.present(v);
    }

    @kotlin.jvm.JvmStatic
    public static final com.apollographql.apollo.api.Optional.Absent absent() {
        return INSTANCE.absent();
    }

    public /* synthetic */ Optional(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
