package androidx.content.preferences;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesMapCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.content.preferences.PreferencesMapCompat.Companion INSTANCE = new androidx.content.preferences.PreferencesMapCompat.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/datastore/preferences/PreferencesMapCompat$Companion;", "", "<init>", "()V", "Ljava/io/InputStream;", "input", "Landroidx/datastore/preferences/PreferencesProto$PreferenceMap;", "readFrom", "(Ljava/io/InputStream;)Landroidx/datastore/preferences/PreferencesProto$PreferenceMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.datastore.preferences.PreferencesProto.PreferenceMap readFrom(java.io.InputStream input) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            try {
                androidx.datastore.preferences.PreferencesProto.PreferenceMap parseFrom = androidx.datastore.preferences.PreferencesProto.PreferenceMap.parseFrom(input);
                kotlin.jvm.internal.Intrinsics.checkNotNull(parseFrom);
                return parseFrom;
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                throw new androidx.content.core.CorruptionException("Unable to parse preferences proto.", e);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
