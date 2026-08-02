package com.google.crypto.tink;

/* loaded from: classes4.dex */
public final class KeysetHandle implements com.google.crypto.tink.internal.KeysetHandleInterface {
    private final com.google.crypto.tink.internal.MonitoringAnnotations annotations;
    private final java.util.List<com.google.crypto.tink.KeysetHandle.Entry> entries;
    private final com.google.crypto.tink.proto.Keyset keyset;

    /* synthetic */ KeysetHandle(com.google.crypto.tink.proto.Keyset keyset, java.util.List list, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.KeysetHandle.AnonymousClass1 anonymousClass1) throws java.security.GeneralSecurityException {
        this(keyset, list, monitoringAnnotations);
    }

    public static final class Builder {
        private final java.util.List<com.google.crypto.tink.KeysetHandle.Builder.Entry> entries = new java.util.ArrayList();

        @javax.annotation.Nullable
        private java.security.GeneralSecurityException errorToThrow = null;
        private com.google.crypto.tink.internal.MonitoringAnnotations annotations = com.google.crypto.tink.internal.MonitoringAnnotations.EMPTY;
        private boolean buildCalled = false;

        static class KeyIdStrategy {
            private static final com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy RANDOM_ID = new com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy();
            private final int fixedId;

            private KeyIdStrategy() {
                this.fixedId = 0;
            }

            private KeyIdStrategy(int i) {
                this.fixedId = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy randomId() {
                return RANDOM_ID;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy fixedId(int i) {
                return new com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int getFixedId() {
                return this.fixedId;
            }
        }

        public static final class Entry {

            @javax.annotation.Nullable
            private com.google.crypto.tink.KeysetHandle.Builder builder;
            private boolean isPrimary;

            @javax.annotation.Nullable
            private final com.google.crypto.tink.Key key;
            private com.google.crypto.tink.KeyStatus keyStatus;

            @javax.annotation.Nullable
            private final com.google.crypto.tink.Parameters parameters;
            private com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy strategy;

            /* synthetic */ Entry(com.google.crypto.tink.Key key, com.google.crypto.tink.KeysetHandle.AnonymousClass1 anonymousClass1) {
                this(key);
            }

            /* synthetic */ Entry(com.google.crypto.tink.Parameters parameters, com.google.crypto.tink.KeysetHandle.AnonymousClass1 anonymousClass1) {
                this(parameters);
            }

            private Entry(com.google.crypto.tink.Key key) {
                this.keyStatus = com.google.crypto.tink.KeyStatus.ENABLED;
                this.strategy = null;
                this.builder = null;
                this.key = key;
                this.parameters = null;
            }

            private Entry(com.google.crypto.tink.Parameters parameters) {
                this.keyStatus = com.google.crypto.tink.KeyStatus.ENABLED;
                this.strategy = null;
                this.builder = null;
                this.key = null;
                this.parameters = parameters;
            }

            public final com.google.crypto.tink.KeysetHandle.Builder.Entry makePrimary() {
                com.google.crypto.tink.KeysetHandle.Builder builder = this.builder;
                if (builder != null) {
                    builder.clearPrimary();
                }
                this.isPrimary = true;
                return this;
            }

            public final boolean isPrimary() {
                return this.isPrimary;
            }

            public final com.google.crypto.tink.KeysetHandle.Builder.Entry setStatus(com.google.crypto.tink.KeyStatus keyStatus) {
                this.keyStatus = keyStatus;
                return this;
            }

            public final com.google.crypto.tink.KeyStatus getStatus() {
                return this.keyStatus;
            }

            public final com.google.crypto.tink.KeysetHandle.Builder.Entry withFixedId(int i) {
                this.strategy = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.fixedId(i);
                return this;
            }

            public final com.google.crypto.tink.KeysetHandle.Builder.Entry withRandomId() {
                this.strategy = com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.randomId();
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimary() {
            java.util.Iterator<com.google.crypto.tink.KeysetHandle.Builder.Entry> it = this.entries.iterator();
            while (it.hasNext()) {
                it.next().isPrimary = false;
            }
        }

        public final com.google.crypto.tink.KeysetHandle.Builder addEntry(com.google.crypto.tink.KeysetHandle.Builder.Entry entry) {
            if (entry.builder == null) {
                if (entry.isPrimary) {
                    clearPrimary();
                }
                entry.builder = this;
                this.entries.add(entry);
                return this;
            }
            throw new java.lang.IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }

        public final com.google.crypto.tink.KeysetHandle.Builder setMonitoringAnnotations(com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations) {
            this.annotations = monitoringAnnotations;
            return this;
        }

        public final int size() {
            return this.entries.size();
        }

        public final com.google.crypto.tink.KeysetHandle.Builder.Entry getAt(int i) {
            return this.entries.get(i);
        }

        @java.lang.Deprecated
        public final com.google.crypto.tink.KeysetHandle.Builder.Entry removeAt(int i) {
            return this.entries.remove(i);
        }

        public final com.google.crypto.tink.KeysetHandle.Builder deleteAt(int i) {
            this.entries.remove(i);
            return this;
        }

        private static void checkIdAssignments(java.util.List<com.google.crypto.tink.KeysetHandle.Builder.Entry> list) throws java.security.GeneralSecurityException {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).strategy == com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.RANDOM_ID && list.get(i + 1).strategy != com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.RANDOM_ID) {
                    throw new java.security.GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrorToThrow(java.security.GeneralSecurityException generalSecurityException) {
            this.errorToThrow = generalSecurityException;
        }

        private static int randomIdNotInSet(java.util.Set<java.lang.Integer> set) {
            int i = 0;
            while (true) {
                if (i != 0 && !set.contains(java.lang.Integer.valueOf(i))) {
                    return i;
                }
                i = com.google.crypto.tink.internal.Util.randKeyId();
            }
        }

        private static int getNextIdFromBuilderEntry(com.google.crypto.tink.KeysetHandle.Builder.Entry entry, java.util.Set<java.lang.Integer> set) throws java.security.GeneralSecurityException {
            if (entry.strategy != null) {
                if (entry.strategy != com.google.crypto.tink.KeysetHandle.Builder.KeyIdStrategy.RANDOM_ID) {
                    return entry.strategy.getFixedId();
                }
                return randomIdNotInSet(set);
            }
            throw new java.security.GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
        }

        public final com.google.crypto.tink.KeysetHandle build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.Keyset.Key createKeysetKey;
            com.google.crypto.tink.KeysetHandle.Entry entry;
            if (this.errorToThrow != null) {
                throw new java.security.GeneralSecurityException("Cannot build keyset due to error in original", this.errorToThrow);
            }
            if (this.buildCalled) {
                throw new java.security.GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
            }
            this.buildCalled = true;
            com.google.crypto.tink.proto.Keyset.Builder newBuilder = com.google.crypto.tink.proto.Keyset.newBuilder();
            java.util.ArrayList arrayList = new java.util.ArrayList(this.entries.size());
            checkIdAssignments(this.entries);
            java.util.HashSet hashSet = new java.util.HashSet();
            com.google.crypto.tink.KeysetHandle.AnonymousClass1 anonymousClass1 = null;
            java.lang.Integer num = null;
            for (com.google.crypto.tink.KeysetHandle.Builder.Entry entry2 : this.entries) {
                if (entry2.keyStatus == null) {
                    throw new java.security.GeneralSecurityException("Key Status not set.");
                }
                int nextIdFromBuilderEntry = getNextIdFromBuilderEntry(entry2, hashSet);
                if (hashSet.contains(java.lang.Integer.valueOf(nextIdFromBuilderEntry))) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Id ");
                    sb.append(nextIdFromBuilderEntry);
                    sb.append(" is used twice in the keyset");
                    throw new java.security.GeneralSecurityException(sb.toString());
                }
                hashSet.add(java.lang.Integer.valueOf(nextIdFromBuilderEntry));
                if (entry2.key == null) {
                    com.google.crypto.tink.Key createKey = com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().createKey(entry2.parameters, entry2.parameters.hasIdRequirement() ? java.lang.Integer.valueOf(nextIdFromBuilderEntry) : null);
                    com.google.crypto.tink.KeysetHandle.Entry entry3 = new com.google.crypto.tink.KeysetHandle.Entry(createKey, entry2.keyStatus, nextIdFromBuilderEntry, entry2.isPrimary, null);
                    createKeysetKey = com.google.crypto.tink.KeysetHandle.createKeysetKey(createKey, entry2.keyStatus, nextIdFromBuilderEntry);
                    entry = entry3;
                } else {
                    entry = new com.google.crypto.tink.KeysetHandle.Entry(entry2.key, entry2.keyStatus, nextIdFromBuilderEntry, entry2.isPrimary, null);
                    createKeysetKey = com.google.crypto.tink.KeysetHandle.createKeysetKey(entry2.key, entry2.keyStatus, nextIdFromBuilderEntry);
                }
                newBuilder.addKey(createKeysetKey);
                if (entry2.isPrimary) {
                    if (num != null) {
                        throw new java.security.GeneralSecurityException("Two primaries were set");
                    }
                    num = java.lang.Integer.valueOf(nextIdFromBuilderEntry);
                    if (entry2.keyStatus != com.google.crypto.tink.KeyStatus.ENABLED) {
                        throw new java.security.GeneralSecurityException("Primary key is not enabled");
                    }
                }
                arrayList.add(entry);
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("No primary was set");
            }
            newBuilder.setPrimaryKeyId(num.intValue());
            com.google.crypto.tink.proto.Keyset build = newBuilder.build();
            com.google.crypto.tink.KeysetHandle.assertEnoughKeyMaterial(build);
            return new com.google.crypto.tink.KeysetHandle(build, arrayList, this.annotations, anonymousClass1);
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class Entry implements com.google.crypto.tink.internal.KeysetHandleInterface.Entry {
        private final int id;
        private final boolean isPrimary;
        private final com.google.crypto.tink.Key key;
        private final com.google.crypto.tink.KeyStatus keyStatus;

        /* synthetic */ Entry(com.google.crypto.tink.Key key, com.google.crypto.tink.KeyStatus keyStatus, int i, boolean z, com.google.crypto.tink.KeysetHandle.AnonymousClass1 anonymousClass1) {
            this(key, keyStatus, i, z);
        }

        private Entry(com.google.crypto.tink.Key key, com.google.crypto.tink.KeyStatus keyStatus, int i, boolean z) {
            this.key = key;
            this.keyStatus = keyStatus;
            this.id = i;
            this.isPrimary = z;
        }

        @Override // com.google.crypto.tink.internal.KeysetHandleInterface.Entry
        public final com.google.crypto.tink.Key getKey() {
            return this.key;
        }

        @Override // com.google.crypto.tink.internal.KeysetHandleInterface.Entry
        public final com.google.crypto.tink.KeyStatus getStatus() {
            return this.keyStatus;
        }

        @Override // com.google.crypto.tink.internal.KeysetHandleInterface.Entry
        public final int getId() {
            return this.id;
        }

        @Override // com.google.crypto.tink.internal.KeysetHandleInterface.Entry
        public final boolean isPrimary() {
            return this.isPrimary;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean equalsEntry(com.google.crypto.tink.KeysetHandle.Entry entry) {
            return entry.isPrimary == this.isPrimary && entry.keyStatus.equals(this.keyStatus) && entry.id == this.id && entry.key.equalsKey(this.key);
        }
    }

    /* renamed from: com.google.crypto.tink.KeysetHandle$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[com.google.crypto.tink.proto.KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[com.google.crypto.tink.proto.KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static com.google.crypto.tink.KeyStatus parseStatus(com.google.crypto.tink.proto.KeyStatusType keyStatusType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.KeysetHandle.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[keyStatusType.ordinal()];
        if (i == 1) {
            return com.google.crypto.tink.KeyStatus.ENABLED;
        }
        if (i == 2) {
            return com.google.crypto.tink.KeyStatus.DISABLED;
        }
        if (i == 3) {
            return com.google.crypto.tink.KeyStatus.DESTROYED;
        }
        throw new java.security.GeneralSecurityException("Unknown key status");
    }

    private static com.google.crypto.tink.proto.KeyStatusType serializeStatus(com.google.crypto.tink.KeyStatus keyStatus) {
        if (com.google.crypto.tink.KeyStatus.ENABLED.equals(keyStatus)) {
            return com.google.crypto.tink.proto.KeyStatusType.ENABLED;
        }
        if (com.google.crypto.tink.KeyStatus.DISABLED.equals(keyStatus)) {
            return com.google.crypto.tink.proto.KeyStatusType.DISABLED;
        }
        if (com.google.crypto.tink.KeyStatus.DESTROYED.equals(keyStatus)) {
            return com.google.crypto.tink.proto.KeyStatusType.DESTROYED;
        }
        throw new java.lang.IllegalStateException("Unknown key status");
    }

    private static java.util.List<com.google.crypto.tink.KeysetHandle.Entry> getEntriesFromKeyset(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        java.util.ArrayList arrayList = new java.util.ArrayList(keyset.getKeyCount());
        for (com.google.crypto.tink.proto.Keyset.Key key : keyset.getKeyList()) {
            int keyId = key.getKeyId();
            try {
                arrayList.add(new com.google.crypto.tink.KeysetHandle.Entry(toKey(key), parseStatus(key.getStatus()), keyId, keyId == keyset.getPrimaryKeyId(), null));
            } catch (java.security.GeneralSecurityException e) {
                if (com.google.crypto.tink.config.GlobalTinkFlags.validateKeysetsOnParsing.getValue()) {
                    throw new java.security.GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e);
                }
                arrayList.add(null);
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private com.google.crypto.tink.KeysetHandle.Entry entryByIndex(int i) {
        if (this.entries.get(i) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Keyset-Entry at position ");
            sb.append(i);
            sb.append(" has wrong status or key parsing failed");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return this.entries.get(i);
    }

    public static com.google.crypto.tink.KeysetHandle.Builder.Entry importKey(com.google.crypto.tink.Key key) {
        com.google.crypto.tink.KeysetHandle.Builder.Entry entry = new com.google.crypto.tink.KeysetHandle.Builder.Entry(key, (com.google.crypto.tink.KeysetHandle.AnonymousClass1) null);
        java.lang.Integer idRequirementOrNull = key.getIdRequirementOrNull();
        if (idRequirementOrNull != null) {
            entry.withFixedId(idRequirementOrNull.intValue());
        }
        return entry;
    }

    public static com.google.crypto.tink.KeysetHandle.Builder.Entry generateEntryFromParametersName(java.lang.String str) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.KeysetHandle.Builder.Entry(com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().get(str), (com.google.crypto.tink.KeysetHandle.AnonymousClass1) null);
    }

    public static com.google.crypto.tink.KeysetHandle.Builder.Entry generateEntryFromParameters(com.google.crypto.tink.Parameters parameters) {
        return new com.google.crypto.tink.KeysetHandle.Builder.Entry(parameters, (com.google.crypto.tink.KeysetHandle.AnonymousClass1) null);
    }

    private static void validateNoDuplicateIds(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.google.crypto.tink.proto.Keyset.Key key : keyset.getKeyList()) {
            if (hashSet.contains(java.lang.Integer.valueOf(key.getKeyId()))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyID ");
                sb.append(key.getKeyId());
                sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            hashSet.add(java.lang.Integer.valueOf(key.getKeyId()));
        }
        if (!hashSet.contains(java.lang.Integer.valueOf(keyset.getPrimaryKeyId()))) {
            throw new java.security.GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
        }
    }

    private KeysetHandle(com.google.crypto.tink.proto.Keyset keyset, java.util.List<com.google.crypto.tink.KeysetHandle.Entry> list, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations) throws java.security.GeneralSecurityException {
        this.keyset = keyset;
        this.entries = list;
        this.annotations = monitoringAnnotations;
        if (com.google.crypto.tink.config.GlobalTinkFlags.validateKeysetsOnParsing.getValue()) {
            validateNoDuplicateIds(keyset);
        }
    }

    static final com.google.crypto.tink.KeysetHandle fromKeyset(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        return new com.google.crypto.tink.KeysetHandle(keyset, getEntriesFromKeyset(keyset), com.google.crypto.tink.internal.MonitoringAnnotations.EMPTY);
    }

    static final com.google.crypto.tink.KeysetHandle fromKeysetAndAnnotations(com.google.crypto.tink.proto.Keyset keyset, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations) throws java.security.GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        return new com.google.crypto.tink.KeysetHandle(keyset, getEntriesFromKeyset(keyset), monitoringAnnotations);
    }

    final com.google.crypto.tink.proto.Keyset getKeyset() {
        return this.keyset;
    }

    public static com.google.crypto.tink.KeysetHandle.Builder newBuilder() {
        return new com.google.crypto.tink.KeysetHandle.Builder();
    }

    public static com.google.crypto.tink.KeysetHandle.Builder newBuilder(com.google.crypto.tink.KeysetHandle keysetHandle) {
        com.google.crypto.tink.KeysetHandle.Builder builder = new com.google.crypto.tink.KeysetHandle.Builder();
        for (int i = 0; i < keysetHandle.size(); i++) {
            com.google.crypto.tink.KeysetHandle.Entry entry = keysetHandle.entries.get(i);
            if (entry == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Keyset-Entry in original keyset at position ");
                sb.append(i);
                sb.append(" has wrong status or key parsing failed");
                builder.setErrorToThrow(new java.security.GeneralSecurityException(sb.toString()));
                return builder;
            }
            com.google.crypto.tink.KeysetHandle.Builder.Entry withFixedId = importKey(entry.getKey()).withFixedId(entry.getId());
            withFixedId.setStatus(entry.getStatus());
            if (entry.isPrimary()) {
                withFixedId.makePrimary();
            }
            builder.addEntry(withFixedId);
        }
        return builder;
    }

    @Override // com.google.crypto.tink.internal.KeysetHandleInterface
    public final com.google.crypto.tink.KeysetHandle.Entry getPrimary() {
        for (com.google.crypto.tink.KeysetHandle.Entry entry : this.entries) {
            if (entry != null && entry.isPrimary()) {
                if (entry.getStatus() == com.google.crypto.tink.KeyStatus.ENABLED) {
                    return entry;
                }
                throw new java.lang.IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new java.lang.IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.crypto.tink.internal.KeysetHandleInterface
    public final int size() {
        return this.entries.size();
    }

    @Override // com.google.crypto.tink.internal.KeysetHandleInterface
    public final com.google.crypto.tink.KeysetHandle.Entry getAt(int i) {
        if (i < 0 || i >= size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(size());
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        return entryByIndex(i);
    }

    @java.lang.Deprecated
    public final java.util.List<com.google.crypto.tink.tinkkey.KeyHandle> getKeys() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.crypto.tink.proto.Keyset.Key key : this.keyset.getKeyList()) {
            arrayList.add(new com.google.crypto.tink.tinkkey.internal.InternalKeyHandle(new com.google.crypto.tink.tinkkey.internal.ProtoKey(key.getKeyData(), com.google.crypto.tink.KeyTemplate.fromProto(key.getOutputPrefixType())), key.getStatus(), key.getKeyId()));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.proto.KeysetInfo getKeysetInfo() {
        return com.google.crypto.tink.Util.getKeysetInfo(this.keyset);
    }

    public static final com.google.crypto.tink.KeysetHandle generateNew(com.google.crypto.tink.Parameters parameters) throws java.security.GeneralSecurityException {
        return newBuilder().addEntry(generateEntryFromParameters(parameters).withRandomId().makePrimary()).build();
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return generateNew(com.google.crypto.tink.TinkProtoParametersFormat.parse(keyTemplate.toByteArray()));
    }

    public static final com.google.crypto.tink.KeysetHandle generateNew(com.google.crypto.tink.KeyTemplate keyTemplate) throws java.security.GeneralSecurityException {
        return generateNew(keyTemplate.toParameters());
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle createFromKey(com.google.crypto.tink.tinkkey.KeyHandle keyHandle, com.google.crypto.tink.tinkkey.KeyAccess keyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.KeysetManager add = com.google.crypto.tink.KeysetManager.withEmptyKeyset().add(keyHandle);
        add.setPrimary(add.getKeysetHandle().getKeysetInfo().getKeyInfo(0).getKeyId());
        return add.getKeysetHandle();
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader keysetReader, com.google.crypto.tink.Aead aead) throws java.security.GeneralSecurityException, java.io.IOException {
        return readWithAssociatedData(keysetReader, aead, new byte[0]);
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle readWithAssociatedData(com.google.crypto.tink.KeysetReader keysetReader, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        com.google.crypto.tink.proto.EncryptedKeyset readEncrypted = keysetReader.readEncrypted();
        assertEnoughEncryptedKeyMaterial(readEncrypted);
        return fromKeyset(decrypt(readEncrypted, aead, bArr));
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle readNoSecret(com.google.crypto.tink.KeysetReader keysetReader) throws java.security.GeneralSecurityException, java.io.IOException {
        try {
            return readNoSecret(keysetReader.read().toByteArray());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("invalid keyset");
        }
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle readNoSecret(byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.proto.Keyset parseFrom = com.google.crypto.tink.proto.Keyset.parseFrom(bArr, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            assertNoSecretKeyMaterial(parseFrom);
            return fromKeyset(parseFrom);
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("invalid keyset");
        }
    }

    @java.lang.Deprecated
    public final void write(com.google.crypto.tink.KeysetWriter keysetWriter, com.google.crypto.tink.Aead aead) throws java.security.GeneralSecurityException, java.io.IOException {
        writeWithAssociatedData(keysetWriter, aead, new byte[0]);
    }

    @java.lang.Deprecated
    public final void writeWithAssociatedData(com.google.crypto.tink.KeysetWriter keysetWriter, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException, java.io.IOException {
        keysetWriter.write(encrypt(this.keyset, aead, bArr));
    }

    @java.lang.Deprecated
    public final void writeNoSecret(com.google.crypto.tink.KeysetWriter keysetWriter) throws java.security.GeneralSecurityException, java.io.IOException {
        assertNoSecretKeyMaterial(this.keyset);
        keysetWriter.write(this.keyset);
    }

    private static com.google.crypto.tink.proto.EncryptedKeyset encrypt(com.google.crypto.tink.proto.Keyset keyset, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.proto.EncryptedKeyset.newBuilder().setEncryptedKeyset(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(aead.encrypt(keyset.toByteArray(), bArr))).setKeysetInfo(com.google.crypto.tink.Util.getKeysetInfo(keyset)).build();
    }

    private static com.google.crypto.tink.proto.Keyset decrypt(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset, com.google.crypto.tink.Aead aead, byte[] bArr) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.proto.Keyset parseFrom = com.google.crypto.tink.proto.Keyset.parseFrom(aead.decrypt(encryptedKeyset.getEncryptedKeyset().toByteArray(), bArr), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
            assertEnoughKeyMaterial(parseFrom);
            return parseFrom;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final com.google.crypto.tink.KeysetHandle getPublicKeysetHandle() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.Keyset.Key build;
        com.google.crypto.tink.KeysetHandle.Entry entry;
        if (this.keyset == null) {
            throw new java.security.GeneralSecurityException("cleartext keyset is not available");
        }
        com.google.crypto.tink.proto.Keyset.Builder newBuilder = com.google.crypto.tink.proto.Keyset.newBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.entries.size());
        int i = 0;
        for (com.google.crypto.tink.KeysetHandle.Entry entry2 : this.entries) {
            if (entry2 != null && (entry2.getKey() instanceof com.google.crypto.tink.PrivateKey)) {
                com.google.crypto.tink.Key publicKey = ((com.google.crypto.tink.PrivateKey) entry2.getKey()).getPublicKey();
                entry = new com.google.crypto.tink.KeysetHandle.Entry(publicKey, entry2.getStatus(), entry2.getId(), entry2.isPrimary(), null);
                build = createKeysetKey(publicKey, entry2.getStatus(), entry2.getId());
            } else {
                com.google.crypto.tink.proto.Keyset.Key key = this.keyset.getKey(i);
                build = key.toBuilder().setKeyData(getPublicKeyDataFromRegistry(key.getKeyData())).build();
                try {
                    com.google.crypto.tink.Key key2 = toKey(build);
                    int keyId = build.getKeyId();
                    entry = new com.google.crypto.tink.KeysetHandle.Entry(key2, parseStatus(build.getStatus()), keyId, keyId == this.keyset.getPrimaryKeyId(), null);
                } catch (java.security.GeneralSecurityException unused) {
                    entry = null;
                }
            }
            newBuilder.addKey(build);
            arrayList.add(entry);
            i++;
        }
        newBuilder.setPrimaryKeyId(this.keyset.getPrimaryKeyId());
        return new com.google.crypto.tink.KeysetHandle(newBuilder.build(), arrayList, this.annotations);
    }

    private static com.google.crypto.tink.proto.KeyData getPublicKeyDataFromRegistry(com.google.crypto.tink.proto.KeyData keyData) throws java.security.GeneralSecurityException {
        if (keyData.getKeyMaterialType() != com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
            throw new java.security.GeneralSecurityException("The keyset contains a non-private key");
        }
        return com.google.crypto.tink.Registry.getPublicKeyData(keyData.getTypeUrl(), keyData.getValue());
    }

    public final java.lang.String toString() {
        return getKeysetInfo().toString();
    }

    private static void assertNoSecretKeyMaterial(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        for (com.google.crypto.tink.proto.Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("keyset contains key material of type %s for type url %s", key.getKeyData().getKeyMaterialType().name(), key.getKeyData().getTypeUrl()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertEnoughKeyMaterial(com.google.crypto.tink.proto.Keyset keyset) throws java.security.GeneralSecurityException {
        if (keyset == null || keyset.getKeyCount() <= 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
    }

    private static void assertEnoughEncryptedKeyMaterial(com.google.crypto.tink.proto.EncryptedKeyset encryptedKeyset) throws java.security.GeneralSecurityException {
        if (encryptedKeyset == null || encryptedKeyset.getEncryptedKeyset().size() == 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
    }

    private <P> P getPrimitiveInternal(com.google.crypto.tink.internal.InternalConfiguration internalConfiguration, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Util.validateKeyset(this.keyset);
        for (int i = 0; i < size(); i++) {
            if (this.entries.get(i) == null) {
                com.google.crypto.tink.proto.Keyset.Key key = this.keyset.getKey(i);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Key parsing of key with index ");
                sb.append(i);
                sb.append(" and type_url ");
                sb.append(key.getKeyData().getTypeUrl());
                sb.append(" failed, unable to get primitive");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
        }
        return (P) internalConfiguration.wrap(this, this.annotations, cls);
    }

    public final <P> P getPrimitive(com.google.crypto.tink.Configuration configuration, java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        if (!(configuration instanceof com.google.crypto.tink.internal.InternalConfiguration)) {
            throw new java.security.GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        return (P) getPrimitiveInternal((com.google.crypto.tink.internal.InternalConfiguration) configuration, cls);
    }

    @java.lang.Deprecated
    public final <P> P getPrimitive(java.lang.Class<P> cls) throws java.security.GeneralSecurityException {
        return (P) getPrimitive(com.google.crypto.tink.RegistryConfiguration.get(), cls);
    }

    @java.lang.Deprecated
    public final com.google.crypto.tink.tinkkey.KeyHandle primaryKey() throws java.security.GeneralSecurityException {
        int primaryKeyId = this.keyset.getPrimaryKeyId();
        for (com.google.crypto.tink.proto.Keyset.Key key : this.keyset.getKeyList()) {
            if (key.getKeyId() == primaryKeyId) {
                return new com.google.crypto.tink.tinkkey.internal.InternalKeyHandle(new com.google.crypto.tink.tinkkey.internal.ProtoKey(key.getKeyData(), com.google.crypto.tink.KeyTemplate.fromProto(key.getOutputPrefixType())), key.getStatus(), key.getKeyId());
            }
        }
        throw new java.security.GeneralSecurityException("No primary key found in keyset.");
    }

    public final boolean equalsKeyset(com.google.crypto.tink.KeysetHandle keysetHandle) {
        if (size() != keysetHandle.size()) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < size(); i++) {
            com.google.crypto.tink.KeysetHandle.Entry entry = this.entries.get(i);
            com.google.crypto.tink.KeysetHandle.Entry entry2 = keysetHandle.entries.get(i);
            if (entry == null || entry2 == null || !entry.equalsEntry(entry2)) {
                return false;
            }
            z |= entry.isPrimary;
        }
        return z;
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization toProtoKeySerialization(com.google.crypto.tink.proto.Keyset.Key key) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), key.getOutputPrefixType() == com.google.crypto.tink.proto.OutputPrefixType.RAW ? null : java.lang.Integer.valueOf(key.getKeyId()));
    }

    private static com.google.crypto.tink.Key toKey(com.google.crypto.tink.proto.Keyset.Key key) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(toProtoKeySerialization(key), com.google.crypto.tink.InsecureSecretKeyAccess.get());
    }

    private static com.google.crypto.tink.proto.Keyset.Key toKeysetKey(int i, com.google.crypto.tink.proto.KeyStatusType keyStatusType, com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization) {
        return com.google.crypto.tink.proto.Keyset.Key.newBuilder().setKeyData(com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(protoKeySerialization.getTypeUrl()).setValue(protoKeySerialization.getValue()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType())).setStatus(keyStatusType).setKeyId(i).setOutputPrefixType(protoKeySerialization.getOutputPrefixType()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.proto.Keyset.Key createKeysetKey(com.google.crypto.tink.Key key, com.google.crypto.tink.KeyStatus keyStatus, int i) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization = (com.google.crypto.tink.internal.ProtoKeySerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeKey(key, com.google.crypto.tink.internal.ProtoKeySerialization.class, com.google.crypto.tink.InsecureSecretKeyAccess.get());
        java.lang.Integer idRequirementOrNull = protoKeySerialization.getIdRequirementOrNull();
        if (idRequirementOrNull != null && idRequirementOrNull.intValue() != i) {
            throw new java.security.GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        return toKeysetKey(i, serializeStatus(keyStatus), protoKeySerialization);
    }
}
