package com.sun.jna;

/* loaded from: classes5.dex */
public abstract class Structure {
    public static final int ALIGN_DEFAULT = 0;
    public static final int ALIGN_GNUC = 2;
    public static final int ALIGN_MSVC = 3;
    public static final int ALIGN_NONE = 1;
    protected static final int CALCULATE_SIZE = -1;
    private int actualAlignType;
    private int alignType;
    private com.sun.jna.Structure[] array;
    private boolean autoRead;
    private boolean autoWrite;
    private java.lang.String encoding;
    private com.sun.jna.Pointer memory;
    private final java.util.Map<java.lang.String, com.sun.jna.Structure.NativeStringTracking> nativeStrings;
    boolean readCalled;
    private int size;
    private int structAlignment;
    private java.util.Map<java.lang.String, com.sun.jna.Structure.StructField> structFields;
    private long typeInfo;
    private com.sun.jna.TypeMapper typeMapper;
    private static final java.util.logging.Logger LOG = java.util.logging.Logger.getLogger(com.sun.jna.Structure.class.getName());
    static final java.util.concurrent.locks.ReentrantReadWriteLock layoutInfoLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    static final java.util.concurrent.locks.ReentrantReadWriteLock fieldOrderLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    static final java.util.concurrent.locks.ReentrantReadWriteLock fieldListLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    static final java.util.concurrent.locks.ReentrantReadWriteLock validationLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    static final java.util.Map<java.lang.Class<?>, com.sun.jna.Structure.LayoutInfo> layoutInfo = new java.util.WeakHashMap();
    static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.String>> fieldOrder = new java.util.WeakHashMap();
    static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> fieldList = new java.util.WeakHashMap();
    static final java.util.Map<java.lang.Class<?>, java.lang.Boolean> validationMap = new java.util.WeakHashMap();
    private static final java.lang.ThreadLocal<java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure>> reads = new java.lang.ThreadLocal<java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure>>() { // from class: com.sun.jna.Structure.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.ThreadLocal
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure> initialValue() {
            java.util.HashMap hashMap;
            synchronized (this) {
                hashMap = new java.util.HashMap();
            }
            return hashMap;
        }
    };
    private static final java.lang.ThreadLocal<java.util.Set<com.sun.jna.Structure>> busy = new java.lang.ThreadLocal<java.util.Set<com.sun.jna.Structure>>() { // from class: com.sun.jna.Structure.2
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.ThreadLocal
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public java.util.Set<com.sun.jna.Structure> initialValue() {
            com.sun.jna.Structure.StructureSet structureSet;
            synchronized (this) {
                structureSet = new com.sun.jna.Structure.StructureSet();
            }
            return structureSet;
        }
    };
    private static final com.sun.jna.Pointer PLACEHOLDER_MEMORY = new com.sun.jna.Pointer() { // from class: com.sun.jna.Structure.3
        @Override // com.sun.jna.Pointer
        public com.sun.jna.Pointer share(long j, long j2) {
            return this;
        }
    };

    public interface ByReference {
    }

    public interface ByValue {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface FieldOrder {
        java.lang.String[] value();
    }

    static class NativeStringTracking {
        private final java.lang.Object Camera2StreamConfigurationMap;
        private com.sun.jna.NativeString getHighSpeedVideoFpsRanges;

        NativeStringTracking(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = obj;
        }
    }

    protected Structure() {
        this(0);
    }

    protected Structure(com.sun.jna.TypeMapper typeMapper) {
        this(null, 0, typeMapper);
    }

    protected Structure(int i) {
        this((com.sun.jna.Pointer) null, i);
    }

    protected Structure(int i, com.sun.jna.TypeMapper typeMapper) {
        this(null, i, typeMapper);
    }

    protected Structure(com.sun.jna.Pointer pointer) {
        this(pointer, 0);
    }

    protected Structure(com.sun.jna.Pointer pointer, int i) {
        this(pointer, i, null);
    }

    protected Structure(com.sun.jna.Pointer pointer, int i, com.sun.jna.TypeMapper typeMapper) {
        this.size = -1;
        this.nativeStrings = new java.util.HashMap(8);
        this.autoRead = true;
        this.autoWrite = true;
        setAlignType(i);
        setStringEncoding(com.sun.jna.Native.getStringEncoding(getClass()));
        this.typeMapper = typeMapper == null ? com.sun.jna.Native.getTypeMapper(getClass()) : typeMapper;
        getInputSizeshNQ4ISI();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = validationLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            java.util.Map<java.lang.Class<?>, java.lang.Boolean> map = validationMap;
            if (map.containsKey(getClass())) {
                reentrantReadWriteLock.readLock().unlock();
            } else {
                reentrantReadWriteLock.readLock().unlock();
                reentrantReadWriteLock.writeLock().lock();
                try {
                    map.computeIfAbsent(getClass(), new java.util.function.Function() { // from class: com.sun.jna.Structure$$ExternalSyntheticLambda1
                        @Override // java.util.function.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return com.sun.jna.Structure.this.getHighSpeedVideoFpsRanges();
                        }
                    });
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (java.lang.Throwable th) {
                    validationLock.writeLock().unlock();
                    throw th;
                }
            }
            if (pointer != null) {
                getHighSpeedVideoFpsRanges(pointer, 0, true);
            } else {
                allocateMemory(-1);
            }
            for (java.lang.reflect.Field field : getFieldList()) {
                try {
                    if (field.get(this) == null) {
                        getHighResolutionOutputSizeshNQ4ISI(field, field.getType());
                    }
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception reading field '");
                    sb.append(field.getName());
                    sb.append("' in ");
                    sb.append(getClass());
                    throw new java.lang.Error(sb.toString(), e);
                }
            }
        } catch (java.lang.Throwable th2) {
            validationLock.readLock().unlock();
            throw th2;
        }
    }

    final java.util.Map<java.lang.String, com.sun.jna.Structure.StructField> Camera2StreamConfigurationMap() {
        return this.structFields;
    }

    private void getInputSizeshNQ4ISI() {
        if (this.size != -1) {
            this.size = -1;
            if (this.memory instanceof com.sun.jna.Structure.AutoAllocated) {
                this.memory = null;
            }
            ensureAllocated();
        }
    }

    protected void setStringEncoding(java.lang.String str) {
        this.encoding = str;
    }

    protected java.lang.String getStringEncoding() {
        return this.encoding;
    }

    protected void setAlignType(int i) {
        this.alignType = i;
        if (i == 0 && (i = com.sun.jna.Native.getStructureAlignment(getClass())) == 0) {
            i = com.sun.jna.Platform.isWindows() ? 3 : 2;
        }
        this.actualAlignType = i;
        getInputSizeshNQ4ISI();
    }

    protected com.sun.jna.Memory autoAllocate(int i) {
        return new com.sun.jna.Structure.AutoAllocated(i);
    }

    protected void useMemory(com.sun.jna.Pointer pointer) {
        useMemory(pointer, 0);
    }

    protected void useMemory(com.sun.jna.Pointer pointer, int i) {
        getHighSpeedVideoFpsRanges(pointer, i, false);
    }

    final void getHighSpeedVideoFpsRanges(com.sun.jna.Pointer pointer, int i, boolean z) {
        try {
            this.nativeStrings.clear();
            if ((this instanceof com.sun.jna.Structure.ByValue) && !z) {
                int size = size();
                byte[] bArr = new byte[size];
                pointer.read(0L, bArr, 0, size);
                this.memory.write(0L, bArr, 0, size);
            } else {
                if (this.size == -1) {
                    this.size = calculateSize(false);
                }
                int i2 = this.size;
                if (i2 != -1) {
                    this.memory = pointer.share(i, i2);
                } else {
                    this.memory = pointer.share(i);
                }
            }
            this.array = null;
            this.readCalled = false;
        } catch (java.lang.IndexOutOfBoundsException e) {
            throw new java.lang.IllegalArgumentException("Structure exceeds provided memory bounds", e);
        }
    }

    protected void ensureAllocated() {
        getHighSpeedVideoFpsRanges(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges(boolean z) {
        if (this.memory != null) {
            if (this.size == -1) {
                int highSpeedVideoSizes = getHighSpeedVideoSizes(true, z);
                this.size = highSpeedVideoSizes;
                com.sun.jna.Pointer pointer = this.memory;
                if (pointer instanceof com.sun.jna.Structure.AutoAllocated) {
                    return;
                }
                try {
                    this.memory = pointer.share(0L, highSpeedVideoSizes);
                    return;
                } catch (java.lang.IndexOutOfBoundsException e) {
                    throw new java.lang.IllegalArgumentException("Structure exceeds provided memory bounds", e);
                }
            }
            return;
        }
        allocateMemory(getHighSpeedVideoSizes(true, z));
    }

    protected void allocateMemory(int i) {
        if (i == -1) {
            i = calculateSize(false);
        } else if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Structure size must be greater than zero: ".concat(java.lang.String.valueOf(i)));
        }
        if (i != -1) {
            com.sun.jna.Pointer pointer = this.memory;
            if (pointer == null || (pointer instanceof com.sun.jna.Structure.AutoAllocated)) {
                this.memory = autoAllocate(i);
            }
            this.size = i;
        }
    }

    public int size() {
        ensureAllocated();
        return this.size;
    }

    public void clear() {
        ensureAllocated();
        this.nativeStrings.clear();
        this.memory.clear(size());
    }

    public com.sun.jna.Pointer getPointer() {
        ensureAllocated();
        return this.memory;
    }

    static class StructureSet extends java.util.AbstractCollection<com.sun.jna.Structure> implements java.util.Set<com.sun.jna.Structure> {
        com.sun.jna.Structure[] getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;

        StructureSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* synthetic */ boolean add(java.lang.Object obj) {
            com.sun.jna.Structure structure = (com.sun.jna.Structure) obj;
            if (contains(structure)) {
                return false;
            }
            int i = this.getHighSpeedVideoSizes + 1;
            com.sun.jna.Structure[] structureArr = this.getHighSpeedVideoFpsRanges;
            if (structureArr == null) {
                this.getHighSpeedVideoFpsRanges = new com.sun.jna.Structure[(i * 3) / 2];
            } else if (structureArr.length < i) {
                com.sun.jna.Structure[] structureArr2 = new com.sun.jna.Structure[(i * 3) / 2];
                java.lang.System.arraycopy(structureArr, 0, structureArr2, 0, structureArr.length);
                this.getHighSpeedVideoFpsRanges = structureArr2;
            }
            com.sun.jna.Structure[] structureArr3 = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 + 1;
            structureArr3[i2] = structure;
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            return getHighResolutionOutputSizeshNQ4ISI((com.sun.jna.Structure) obj) != -1;
        }

        private int getHighResolutionOutputSizeshNQ4ISI(com.sun.jna.Structure structure) {
            for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
                com.sun.jna.Structure structure2 = this.getHighSpeedVideoFpsRanges[i];
                if (structure == structure2 || (structure.getClass() == structure2.getClass() && structure.size() == structure2.size() && structure.getPointer().equals(structure2.getPointer()))) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.sun.jna.Structure) obj);
            if (highResolutionOutputSizeshNQ4ISI == -1) {
                return false;
            }
            int i = this.getHighSpeedVideoSizes - 1;
            this.getHighSpeedVideoSizes = i;
            if (i >= 0) {
                com.sun.jna.Structure[] structureArr = this.getHighSpeedVideoFpsRanges;
                structureArr[highResolutionOutputSizeshNQ4ISI] = structureArr[i];
                structureArr[i] = null;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<com.sun.jna.Structure> iterator() {
            int i = this.getHighSpeedVideoSizes;
            com.sun.jna.Structure[] structureArr = new com.sun.jna.Structure[i];
            if (i > 0) {
                java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, structureArr, 0, i);
            }
            return java.util.Arrays.asList(structureArr).iterator();
        }
    }

    public void read() {
        if (this.memory != PLACEHOLDER_MEMORY) {
            this.readCalled = true;
            ensureAllocated();
            if (busy.get().add(this)) {
                boolean z = this instanceof com.sun.jna.Structure.ByReference;
                if (z) {
                    reads.get().put(getPointer(), this);
                }
                try {
                    java.util.Iterator<com.sun.jna.Structure.StructField> it = this.structFields.values().iterator();
                    while (it.hasNext()) {
                        readField(it.next());
                    }
                } finally {
                    busy.get().remove(this);
                    if (z) {
                        java.lang.ThreadLocal<java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure>> threadLocal = reads;
                        if (threadLocal.get().get(getPointer()) == this) {
                            threadLocal.get().remove(getPointer());
                        }
                    }
                }
            }
        }
    }

    protected int fieldOffset(java.lang.String str) {
        ensureAllocated();
        com.sun.jna.Structure.StructField structField = this.structFields.get(str);
        if (structField == null) {
            throw new java.lang.IllegalArgumentException("No such field: ".concat(java.lang.String.valueOf(str)));
        }
        return structField.offset;
    }

    public java.lang.Object readField(java.lang.String str) {
        ensureAllocated();
        com.sun.jna.Structure.StructField structField = this.structFields.get(str);
        if (structField == null) {
            throw new java.lang.IllegalArgumentException("No such field: ".concat(java.lang.String.valueOf(str)));
        }
        return readField(structField);
    }

    final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Field field) {
        try {
            return field.get(this);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception reading field '");
            sb.append(field.getName());
            sb.append("' in ");
            sb.append(getClass());
            throw new java.lang.Error(sb.toString(), e);
        }
    }

    final void Camera2StreamConfigurationMap(java.lang.reflect.Field field, java.lang.Object obj) {
        Camera2StreamConfigurationMap(field, obj, false);
    }

    private void Camera2StreamConfigurationMap(java.lang.reflect.Field field, java.lang.Object obj, boolean z) {
        try {
            field.set(this, obj);
        } catch (java.lang.IllegalAccessException e) {
            if (!java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpectedly unable to write to field '");
                sb.append(field.getName());
                sb.append("' within ");
                sb.append(getClass());
                throw new java.lang.Error(sb.toString(), e);
            }
            if (z) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("This VM does not support Structures with final fields (field '");
                sb2.append(field.getName());
                sb2.append("' within ");
                sb2.append(getClass());
                sb2.append(")");
                throw new java.lang.UnsupportedOperationException(sb2.toString(), e);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Attempt to write to read-only field '");
            sb3.append(field.getName());
            sb3.append("' within ");
            sb3.append(getClass());
            throw new java.lang.UnsupportedOperationException(sb3.toString(), e);
        }
    }

    static <T extends com.sun.jna.Structure> T getHighSpeedVideoFpsRanges(java.lang.Class<T> cls, T t, com.sun.jna.Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        if (t == null || !pointer.equals(t.getPointer())) {
            T t2 = (T) reads.get().get(pointer);
            if (t2 != null && cls.equals(t2.getClass())) {
                t2.autoRead();
                return t2;
            }
            T t3 = (T) newInstance(cls, pointer);
            if (!t3.readCalled) {
                t3.autoRead();
            }
            return t3;
        }
        t.autoRead();
        return t;
    }

    protected java.lang.Object readField(com.sun.jna.Structure.StructField structField) {
        int i = structField.offset;
        java.lang.Class<?> cls = structField.type;
        com.sun.jna.FromNativeConverter fromNativeConverter = structField.readConverter;
        if (fromNativeConverter != null) {
            cls = fromNativeConverter.nativeType();
        }
        java.lang.Object obj = null;
        java.lang.Object highResolutionOutputSizeshNQ4ISI = (com.sun.jna.Structure.class.isAssignableFrom(cls) || com.sun.jna.Callback.class.isAssignableFrom(cls) || (com.sun.jna.Platform.HAS_BUFFERS && java.nio.Buffer.class.isAssignableFrom(cls)) || com.sun.jna.Pointer.class.isAssignableFrom(cls) || com.sun.jna.NativeMapped.class.isAssignableFrom(cls) || cls.isArray()) ? getHighResolutionOutputSizeshNQ4ISI(structField.field) : null;
        if (cls == java.lang.String.class) {
            com.sun.jna.Pointer pointer = this.memory.getPointer(i);
            if (pointer != null) {
                obj = pointer.getString(0L, this.encoding);
            }
        } else {
            obj = this.memory.getHighResolutionOutputSizeshNQ4ISI(i, cls, highResolutionOutputSizeshNQ4ISI);
        }
        if (fromNativeConverter != null) {
            java.lang.Object fromNative = fromNativeConverter.fromNative(obj, structField.context);
            if (highResolutionOutputSizeshNQ4ISI == null || !highResolutionOutputSizeshNQ4ISI.equals(fromNative)) {
                highResolutionOutputSizeshNQ4ISI = fromNative;
            }
        } else {
            highResolutionOutputSizeshNQ4ISI = obj;
        }
        if (cls.equals(java.lang.String.class) || cls.equals(com.sun.jna.WString.class)) {
            if (highResolutionOutputSizeshNQ4ISI != null) {
                com.sun.jna.Structure.NativeStringTracking nativeStringTracking = new com.sun.jna.Structure.NativeStringTracking(highResolutionOutputSizeshNQ4ISI);
                com.sun.jna.Structure.NativeStringTracking put = this.nativeStrings.put(structField.f6673name, nativeStringTracking);
                if (put != null) {
                    nativeStringTracking.getHighSpeedVideoFpsRanges = put.getHighSpeedVideoFpsRanges;
                }
            } else {
                this.nativeStrings.remove(structField.f6673name);
            }
        }
        Camera2StreamConfigurationMap(structField.field, highResolutionOutputSizeshNQ4ISI, true);
        return highResolutionOutputSizeshNQ4ISI;
    }

    public void write() {
        if (this.memory != PLACEHOLDER_MEMORY) {
            ensureAllocated();
            if (this instanceof com.sun.jna.Structure.ByValue) {
                getTypeInfo();
            }
            if (busy.get().add(this)) {
                try {
                    for (com.sun.jna.Structure.StructField structField : this.structFields.values()) {
                        if (!structField.isVolatile) {
                            writeField(structField);
                        }
                    }
                } finally {
                    busy.get().remove(this);
                }
            }
        }
    }

    public void writeField(java.lang.String str) {
        ensureAllocated();
        com.sun.jna.Structure.StructField structField = this.structFields.get(str);
        if (structField == null) {
            throw new java.lang.IllegalArgumentException("No such field: ".concat(java.lang.String.valueOf(str)));
        }
        writeField(structField);
    }

    public void writeField(java.lang.String str, java.lang.Object obj) {
        ensureAllocated();
        com.sun.jna.Structure.StructField structField = this.structFields.get(str);
        if (structField == null) {
            throw new java.lang.IllegalArgumentException("No such field: ".concat(java.lang.String.valueOf(str)));
        }
        Camera2StreamConfigurationMap(structField.field, obj, false);
        getHighSpeedVideoFpsRanges(structField, obj);
    }

    protected void writeField(com.sun.jna.Structure.StructField structField) {
        if (structField.isReadOnly) {
            return;
        }
        getHighSpeedVideoFpsRanges(structField, getHighResolutionOutputSizeshNQ4ISI(structField.field));
    }

    private void getHighSpeedVideoFpsRanges(com.sun.jna.Structure.StructField structField, java.lang.Object obj) {
        com.sun.jna.NativeString nativeString;
        java.lang.String obj2;
        int i = structField.offset;
        java.lang.Class<?> cls = structField.type;
        com.sun.jna.ToNativeConverter toNativeConverter = structField.writeConverter;
        if (toNativeConverter != null) {
            obj = toNativeConverter.toNative(obj, new com.sun.jna.StructureWriteContext(this, structField.field));
            cls = toNativeConverter.nativeType();
        }
        if (java.lang.String.class == cls || com.sun.jna.WString.class == cls) {
            if (obj != null) {
                com.sun.jna.Structure.NativeStringTracking nativeStringTracking = new com.sun.jna.Structure.NativeStringTracking(obj);
                com.sun.jna.Structure.NativeStringTracking put = this.nativeStrings.put(structField.f6673name, nativeStringTracking);
                if (put != null && obj.equals(put.Camera2StreamConfigurationMap)) {
                    nativeStringTracking.getHighSpeedVideoFpsRanges = put.getHighSpeedVideoFpsRanges;
                    return;
                }
                if (cls == com.sun.jna.WString.class) {
                    nativeString = new com.sun.jna.NativeString(obj.toString(), true);
                } else {
                    nativeString = new com.sun.jna.NativeString(obj.toString(), this.encoding);
                }
                nativeStringTracking.getHighSpeedVideoFpsRanges = nativeString;
                obj = nativeString.getHighSpeedVideoFpsRangesFor;
            } else {
                this.nativeStrings.remove(structField.f6673name);
            }
        }
        try {
            this.memory.getHighSpeedVideoSizes(i, obj, cls);
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Structure field \"");
            sb.append(structField.f6673name);
            sb.append("\" was declared as ");
            sb.append(structField.type);
            if (structField.type == cls) {
                obj2 = "";
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" (native type ");
                sb2.append(cls);
                sb2.append(")");
                obj2 = sb2.toString();
            }
            sb.append(obj2);
            sb.append(", which is not supported within a Structure");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: getFieldOrder, reason: merged with bridge method [inline-methods] */
    public java.util.List<java.lang.String> getHighSpeedVideoSizes() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.Class<?> cls = getClass(); cls != com.sun.jna.Structure.class; cls = cls.getSuperclass()) {
            com.sun.jna.Structure.FieldOrder fieldOrder2 = (com.sun.jna.Structure.FieldOrder) cls.getAnnotation(com.sun.jna.Structure.FieldOrder.class);
            if (fieldOrder2 != null) {
                linkedList.addAll(0, java.util.Arrays.asList(fieldOrder2.value()));
            }
        }
        return java.util.Collections.unmodifiableList(linkedList);
    }

    protected void sortFields(java.util.List<java.lang.reflect.Field> list, java.util.List<java.lang.String> list2) {
        for (int i = 0; i < list2.size(); i++) {
            java.lang.String str = list2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (str.equals(list.get(i2).getName())) {
                    java.util.Collections.swap(list, i, i2);
                    break;
                }
                i2++;
            }
        }
    }

    protected java.util.List<java.lang.reflect.Field> getFieldList() {
        final java.lang.Class<?> cls = getClass();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fieldListLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> map = fieldList;
            java.util.List<java.lang.reflect.Field> list = map.get(cls);
            if (list != null) {
                reentrantReadWriteLock.readLock().unlock();
                return list;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                java.util.List<java.lang.reflect.Field> computeIfAbsent = map.computeIfAbsent(cls, new java.util.function.Function() { // from class: com.sun.jna.Structure$$ExternalSyntheticLambda2
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.sun.jna.Structure.getHighSpeedVideoSizes(cls);
                    }
                });
                reentrantReadWriteLock.writeLock().unlock();
                return computeIfAbsent;
            } catch (java.lang.Throwable th) {
                fieldListLock.writeLock().unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            fieldListLock.readLock().unlock();
            throw th2;
        }
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(java.lang.Class cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!cls.equals(com.sun.jna.Structure.class)) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                int modifiers = field.getModifiers();
                if (!java.lang.reflect.Modifier.isStatic(modifiers) && java.lang.reflect.Modifier.isPublic(modifiers)) {
                    arrayList2.add(field);
                }
            }
            arrayList.addAll(0, arrayList2);
            arrayList2.clear();
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI() {
        java.lang.Class<?> cls = getClass();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fieldOrderLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.String>> map = fieldOrder;
            java.util.List<java.lang.String> list = map.get(cls);
            if (list != null) {
                reentrantReadWriteLock.readLock().unlock();
                return list;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                java.util.List<java.lang.String> computeIfAbsent = map.computeIfAbsent(cls, new java.util.function.Function() { // from class: com.sun.jna.Structure$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return com.sun.jna.Structure.this.getHighSpeedVideoSizes();
                    }
                });
                reentrantReadWriteLock.writeLock().unlock();
                return computeIfAbsent;
            } catch (java.lang.Throwable th) {
                fieldOrderLock.writeLock().unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            fieldOrderLock.readLock().unlock();
            throw th2;
        }
    }

    public static java.util.List<java.lang.String> createFieldsOrder(java.util.List<java.lang.String> list, java.lang.String... strArr) {
        return createFieldsOrder(list, (java.util.List<java.lang.String>) java.util.Arrays.asList(strArr));
    }

    public static java.util.List<java.lang.String> createFieldsOrder(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public static java.util.List<java.lang.String> createFieldsOrder(java.lang.String str) {
        return java.util.Collections.unmodifiableList(java.util.Collections.singletonList(str));
    }

    public static java.util.List<java.lang.String> createFieldsOrder(java.lang.String... strArr) {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(strArr));
    }

    protected java.util.List<java.lang.reflect.Field> getFields(boolean z) {
        java.lang.String str;
        java.util.List<java.lang.reflect.Field> fieldList2 = getFieldList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.lang.reflect.Field> it = fieldList2.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getName());
        }
        java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI.size() == fieldList2.size() || fieldList2.size() <= 1) {
            if (!new java.util.HashSet(highResolutionOutputSizeshNQ4ISI).equals(hashSet)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Structure.getFieldOrder() on ");
                sb.append(getClass());
                sb.append(" returns names (");
                java.util.ArrayList arrayList = new java.util.ArrayList(highResolutionOutputSizeshNQ4ISI);
                java.util.Collections.sort(arrayList);
                sb.append(arrayList);
                sb.append(") which do not match declared field names (");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(hashSet);
                java.util.Collections.sort(arrayList2);
                sb.append(arrayList2);
                sb.append(")");
                throw new java.lang.Error(sb.toString());
            }
            sortFields(fieldList2, highResolutionOutputSizeshNQ4ISI);
            return fieldList2;
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Structure.getFieldOrder() on ");
        sb2.append(getClass());
        if (highResolutionOutputSizeshNQ4ISI.size() < fieldList2.size()) {
            str = " does not provide enough";
        } else {
            str = " provides too many";
        }
        sb2.append(str);
        sb2.append(" names [");
        sb2.append(highResolutionOutputSizeshNQ4ISI.size());
        sb2.append("] (");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(highResolutionOutputSizeshNQ4ISI);
        java.util.Collections.sort(arrayList3);
        sb2.append(arrayList3);
        sb2.append(") to match declared fields [");
        sb2.append(fieldList2.size());
        sb2.append("] (");
        java.util.ArrayList arrayList4 = new java.util.ArrayList(hashSet);
        java.util.Collections.sort(arrayList4);
        sb2.append(arrayList4);
        sb2.append(")");
        throw new java.lang.Error(sb2.toString());
    }

    protected int calculateSize(boolean z) {
        return getHighSpeedVideoSizes(z, false);
    }

    static int Camera2StreamConfigurationMap(java.lang.Class<? extends com.sun.jna.Structure> cls) {
        return Camera2StreamConfigurationMap((java.lang.Class<com.sun.jna.Structure>) cls, (com.sun.jna.Structure) null);
    }

    static <T extends com.sun.jna.Structure> int Camera2StreamConfigurationMap(java.lang.Class<T> cls, T t) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = layoutInfoLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            com.sun.jna.Structure.LayoutInfo layoutInfo2 = layoutInfo.get(cls);
            reentrantReadWriteLock.readLock().unlock();
            int i = (layoutInfo2 == null || layoutInfo2.getInputSizeshNQ4ISI) ? -1 : layoutInfo2.getHighResolutionOutputSizeshNQ4ISI;
            if (i != -1) {
                return i;
            }
            if (t == null) {
                t = (T) newInstance(cls, PLACEHOLDER_MEMORY);
            }
            return t.size();
        } catch (java.lang.Throwable th) {
            layoutInfoLock.readLock().unlock();
            throw th;
        }
    }

    private int getHighSpeedVideoSizes(boolean z, boolean z2) {
        java.lang.Class<?> cls = getClass();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = layoutInfoLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            java.util.Map<java.lang.Class<?>, com.sun.jna.Structure.LayoutInfo> map = layoutInfo;
            com.sun.jna.Structure.LayoutInfo layoutInfo2 = map.get(cls);
            reentrantReadWriteLock.readLock().unlock();
            if (layoutInfo2 == null || this.alignType != layoutInfo2.getHighSpeedVideoFpsRanges || this.typeMapper != layoutInfo2.getHighSpeedVideoFpsRangesFor) {
                layoutInfo2 = getHighSpeedVideoFpsRanges(z, z2);
            }
            if (layoutInfo2 == null) {
                return -1;
            }
            this.structAlignment = layoutInfo2.getHighSpeedVideoSizes;
            this.structFields = layoutInfo2.Camera2StreamConfigurationMap;
            if (!layoutInfo2.getInputSizeshNQ4ISI) {
                reentrantReadWriteLock.readLock().lock();
                try {
                    if (!map.containsKey(cls) || this.alignType != 0 || this.typeMapper != null) {
                        reentrantReadWriteLock.readLock().unlock();
                        reentrantReadWriteLock.writeLock().lock();
                        map.put(cls, layoutInfo2);
                        reentrantReadWriteLock.readLock().lock();
                        reentrantReadWriteLock.writeLock().unlock();
                    }
                    reentrantReadWriteLock.readLock().unlock();
                } finally {
                }
            }
            return layoutInfo2.getHighResolutionOutputSizeshNQ4ISI;
        } finally {
        }
    }

    static class LayoutInfo {
        private final java.util.Map<java.lang.String, com.sun.jna.Structure.StructField> Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private com.sun.jna.TypeMapper getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private boolean getInputSizeshNQ4ISI;

        private LayoutInfo() {
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            this.getHighSpeedVideoSizes = 1;
            this.Camera2StreamConfigurationMap = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());
            this.getHighSpeedVideoFpsRanges = 0;
        }

        /* synthetic */ LayoutInfo(byte b) {
            this();
        }

        static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(com.sun.jna.Structure.LayoutInfo layoutInfo) {
            layoutInfo.getInputSizeshNQ4ISI = true;
            return true;
        }
    }

    final /* synthetic */ java.lang.Boolean getHighSpeedVideoFpsRanges() {
        com.sun.jna.ToNativeConverter toNativeConverter;
        for (java.lang.reflect.Field field : getFieldList()) {
            java.lang.String name2 = field.getName();
            java.lang.Class<?> type = field.getType();
            while (true) {
                com.sun.jna.TypeMapper typeMapper = this.typeMapper;
                if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(type)) != null) {
                    type = toNativeConverter.nativeType();
                } else if (type.isArray()) {
                    type = type.getComponentType();
                } else {
                    try {
                        break;
                    } catch (java.lang.IllegalArgumentException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid Structure field in ");
                        sb.append(getClass());
                        sb.append(", field name '");
                        sb.append(name2);
                        sb.append("' (");
                        sb.append(type);
                        sb.append("): ");
                        sb.append(e.getMessage());
                        throw new java.lang.IllegalArgumentException(sb.toString(), e);
                    }
                }
            }
            getNativeSize(type);
        }
        return java.lang.Boolean.TRUE;
    }

    private com.sun.jna.Structure.LayoutInfo getHighSpeedVideoFpsRanges(boolean z, boolean z2) {
        int i;
        java.lang.Class<?> cls;
        java.util.List<java.lang.reflect.Field> fields = getFields(z);
        if (fields == null) {
            return null;
        }
        com.sun.jna.Structure.LayoutInfo layoutInfo2 = new com.sun.jna.Structure.LayoutInfo((byte) 0);
        layoutInfo2.getHighSpeedVideoFpsRanges = this.alignType;
        layoutInfo2.getHighSpeedVideoFpsRangesFor = this.typeMapper;
        boolean z3 = true;
        int i2 = 0;
        boolean z4 = true;
        for (java.lang.reflect.Field field : fields) {
            int modifiers = field.getModifiers();
            java.lang.Class<?> type = field.getType();
            if (type.isArray()) {
                com.sun.jna.Structure.LayoutInfo.getHighSpeedVideoFpsRangesFor(layoutInfo2);
            }
            com.sun.jna.Structure.StructField structField = new com.sun.jna.Structure.StructField();
            structField.isVolatile = java.lang.reflect.Modifier.isVolatile(modifiers);
            structField.isReadOnly = java.lang.reflect.Modifier.isFinal(modifiers);
            if (structField.isReadOnly) {
                if (!com.sun.jna.Platform.RO_FIELDS) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("This VM does not support read-only fields (field '");
                    sb.append(field.getName());
                    sb.append("' within ");
                    sb.append(getClass());
                    sb.append(")");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                field.setAccessible(z3);
            }
            structField.field = field;
            structField.f6673name = field.getName();
            structField.type = type;
            if (com.sun.jna.Callback.class.isAssignableFrom(type) && !type.isInterface()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Structure Callback field '");
                sb2.append(field.getName());
                sb2.append("' must be an interface");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            if (type.isArray() && com.sun.jna.Structure.class.equals(type.getComponentType())) {
                throw new java.lang.IllegalArgumentException("Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined");
            }
            if (java.lang.reflect.Modifier.isPublic(field.getModifiers())) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(structField.field);
                if (highResolutionOutputSizeshNQ4ISI == null && type.isArray()) {
                    if (z) {
                        throw new java.lang.IllegalStateException("Array fields must be initialized");
                    }
                    return null;
                }
                if (com.sun.jna.NativeMapped.class.isAssignableFrom(type)) {
                    com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(type);
                    cls = nativeMappedConverter.nativeType();
                    structField.writeConverter = nativeMappedConverter;
                    structField.readConverter = nativeMappedConverter;
                    structField.context = new com.sun.jna.StructureReadContext(this, field);
                } else {
                    com.sun.jna.TypeMapper typeMapper = this.typeMapper;
                    if (typeMapper != null) {
                        com.sun.jna.ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(type);
                        com.sun.jna.FromNativeConverter fromNativeConverter = this.typeMapper.getFromNativeConverter(type);
                        if (toNativeConverter != null && fromNativeConverter != null) {
                            highResolutionOutputSizeshNQ4ISI = toNativeConverter.toNative(highResolutionOutputSizeshNQ4ISI, new com.sun.jna.StructureWriteContext(this, structField.field));
                            java.lang.Class cls2 = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.getClass() : com.sun.jna.Pointer.class;
                            structField.writeConverter = toNativeConverter;
                            structField.readConverter = fromNativeConverter;
                            structField.context = new com.sun.jna.StructureReadContext(this, field);
                            cls = cls2;
                        } else if (toNativeConverter != null || fromNativeConverter != null) {
                            throw new java.lang.IllegalArgumentException("Structures require bidirectional type conversion for ".concat(java.lang.String.valueOf(type)));
                        }
                    }
                    cls = type;
                }
                if (highResolutionOutputSizeshNQ4ISI == null) {
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(structField.field, type);
                }
                try {
                    structField.size = getNativeSize(cls, highResolutionOutputSizeshNQ4ISI);
                    int nativeAlignment = getNativeAlignment(cls, highResolutionOutputSizeshNQ4ISI, z4);
                    if (nativeAlignment != 0) {
                        layoutInfo2.getHighSpeedVideoSizes = java.lang.Math.max(layoutInfo2.getHighSpeedVideoSizes, nativeAlignment);
                        int i3 = i2 % nativeAlignment;
                        if (i3 != 0) {
                            i2 += nativeAlignment - i3;
                        }
                        if (this instanceof com.sun.jna.Union) {
                            structField.offset = 0;
                            i2 = java.lang.Math.max(i2, structField.size);
                        } else {
                            structField.offset = i2;
                            i2 += structField.size;
                        }
                        layoutInfo2.Camera2StreamConfigurationMap.put(structField.f6673name, structField);
                    } else {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field alignment is zero for field '");
                        sb3.append(structField.f6673name);
                        sb3.append("' within ");
                        sb3.append(getClass());
                        throw new java.lang.Error(sb3.toString());
                    }
                } catch (java.lang.IllegalArgumentException e) {
                    if (!z && this.typeMapper == null) {
                        return null;
                    }
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Invalid Structure field in ");
                    sb4.append(getClass());
                    sb4.append(", field name '");
                    sb4.append(structField.f6673name);
                    sb4.append("' (");
                    sb4.append(structField.type);
                    sb4.append("): ");
                    sb4.append(e.getMessage());
                    throw new java.lang.IllegalArgumentException(sb4.toString(), e);
                }
            }
            z4 = false;
            z3 = true;
        }
        if (i2 > 0) {
            int i4 = layoutInfo2.getHighSpeedVideoSizes;
            if (this.actualAlignType != 1 && (i = i2 % i4) != 0) {
                i2 += i4 - i;
            }
            if ((this instanceof com.sun.jna.Structure.ByValue) && !z2) {
                getTypeInfo();
            }
            layoutInfo2.getHighResolutionOutputSizeshNQ4ISI = i2;
            return layoutInfo2;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Structure ");
        sb5.append(getClass());
        sb5.append(" has unknown or zero size (ensure all fields are public)");
        throw new java.lang.IllegalArgumentException(sb5.toString());
    }

    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Field field, java.lang.Class<?> cls) {
        if (com.sun.jna.Structure.class.isAssignableFrom(cls) && !com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
            try {
                com.sun.jna.Structure newInstance = newInstance((java.lang.Class<com.sun.jna.Structure>) cls, PLACEHOLDER_MEMORY);
                Camera2StreamConfigurationMap(field, (java.lang.Object) newInstance, false);
                return newInstance;
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Can't determine size of nested structure", e);
            }
        }
        if (!com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            return null;
        }
        com.sun.jna.NativeMapped defaultValue = com.sun.jna.NativeMappedConverter.getInstance(cls).defaultValue();
        Camera2StreamConfigurationMap(field, (java.lang.Object) defaultValue, false);
        return defaultValue;
    }

    protected int getStructAlignment() {
        if (this.size == -1) {
            calculateSize(true);
        }
        return this.structAlignment;
    }

    protected int getNativeAlignment(java.lang.Class<?> cls, java.lang.Object obj, boolean z) {
        if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
            com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
            java.lang.Class<?> nativeType = nativeMappedConverter.nativeType();
            obj = nativeMappedConverter.toNative(obj, new com.sun.jna.ToNativeContext());
            cls = nativeType;
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(cls, obj);
        if (!cls.isPrimitive() && java.lang.Long.class != cls && java.lang.Integer.class != cls && java.lang.Short.class != cls && java.lang.Character.class != cls && java.lang.Byte.class != cls && java.lang.Boolean.class != cls && java.lang.Float.class != cls && java.lang.Double.class != cls) {
            if ((!com.sun.jna.Pointer.class.isAssignableFrom(cls) || com.sun.jna.Function.class.isAssignableFrom(cls)) && ((!com.sun.jna.Platform.HAS_BUFFERS || !java.nio.Buffer.class.isAssignableFrom(cls)) && !com.sun.jna.Callback.class.isAssignableFrom(cls) && com.sun.jna.WString.class != cls && java.lang.String.class != cls)) {
                if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
                    if (!com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
                        if (obj == null) {
                            obj = newInstance(cls, PLACEHOLDER_MEMORY);
                        }
                        nativeSize = ((com.sun.jna.Structure) obj).getStructAlignment();
                    }
                } else if (cls.isArray()) {
                    nativeSize = getNativeAlignment(cls.getComponentType(), null, z);
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type ");
                    sb.append(cls);
                    sb.append(" has unknown native alignment");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            nativeSize = com.sun.jna.Native.POINTER_SIZE;
        }
        int i = this.actualAlignType;
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return java.lang.Math.min(8, nativeSize);
        }
        if (i == 2) {
            if (!z || !com.sun.jna.Platform.isMac() || !com.sun.jna.Platform.isPPC()) {
                nativeSize = java.lang.Math.min(com.sun.jna.Native.getHighSpeedVideoSizes, nativeSize);
            }
            if (!z && com.sun.jna.Platform.isAIX() && (cls == java.lang.Double.TYPE || cls == java.lang.Double.class)) {
                return 4;
            }
        }
        return nativeSize;
    }

    public java.lang.String toString() {
        return toString(java.lang.Boolean.getBoolean("jna.dump_memory"));
    }

    public java.lang.String toString(boolean z) {
        return Camera2StreamConfigurationMap(0, true, z);
    }

    private java.lang.String Camera2StreamConfigurationMap(int i, boolean z, boolean z2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        com.sun.jna.Structure structure = this;
        ensureAllocated();
        java.lang.String lineSeparator = java.lang.System.lineSeparator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name2 = getClass().getName();
        sb.append(name2.substring(name2.lastIndexOf(".") + 1));
        sb.append("(");
        sb.append(getPointer());
        sb.append(")");
        java.lang.String obj2 = sb.toString();
        if (!(getPointer() instanceof com.sun.jna.Memory)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj2);
            sb2.append(" (");
            sb2.append(size());
            sb2.append(" bytes)");
            obj2 = sb2.toString();
        }
        java.lang.String str3 = "";
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str3);
            sb3.append("  ");
            str3 = sb3.toString();
        }
        if (!z) {
            str = "...}";
        } else {
            java.util.Iterator<com.sun.jna.Structure.StructField> it = structure.structFields.values().iterator();
            java.lang.String str4 = lineSeparator;
            while (it.hasNext()) {
                com.sun.jna.Structure.StructField next = it.next();
                java.lang.Object highResolutionOutputSizeshNQ4ISI = structure.getHighResolutionOutputSizeshNQ4ISI(next.field);
                java.lang.String name3 = next.type.getName();
                java.lang.String substring = name3.substring(name3.lastIndexOf(".") + 1);
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str4);
                sb4.append(str3);
                java.lang.String obj3 = sb4.toString();
                if (!next.type.isArray() || highResolutionOutputSizeshNQ4ISI == null) {
                    str2 = "";
                } else {
                    java.lang.String name4 = next.type.getComponentType().getName();
                    substring = name4.substring(name4.lastIndexOf(".") + 1);
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder("[");
                    sb5.append(java.lang.reflect.Array.getLength(highResolutionOutputSizeshNQ4ISI));
                    sb5.append("]");
                    str2 = sb5.toString();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(obj3);
                sb6.append(java.lang.String.format("  %s %s%s@0x%X", substring, next.f6673name, str2, java.lang.Integer.valueOf(next.offset)));
                java.lang.String obj4 = sb6.toString();
                if (highResolutionOutputSizeshNQ4ISI instanceof com.sun.jna.Structure) {
                    highResolutionOutputSizeshNQ4ISI = ((com.sun.jna.Structure) highResolutionOutputSizeshNQ4ISI).Camera2StreamConfigurationMap(i + 1, !(highResolutionOutputSizeshNQ4ISI instanceof com.sun.jna.Structure.ByReference), z2);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(obj4);
                sb7.append("=");
                java.lang.String obj5 = sb7.toString();
                if (highResolutionOutputSizeshNQ4ISI instanceof java.lang.Long) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                    sb8.append(obj5);
                    sb8.append(java.lang.String.format("0x%08X", (java.lang.Long) highResolutionOutputSizeshNQ4ISI));
                    obj = sb8.toString();
                } else if (highResolutionOutputSizeshNQ4ISI instanceof java.lang.Integer) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(obj5);
                    sb9.append(java.lang.String.format("0x%04X", (java.lang.Integer) highResolutionOutputSizeshNQ4ISI));
                    obj = sb9.toString();
                } else if (highResolutionOutputSizeshNQ4ISI instanceof java.lang.Short) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(obj5);
                    sb10.append(java.lang.String.format("0x%02X", (java.lang.Short) highResolutionOutputSizeshNQ4ISI));
                    obj = sb10.toString();
                } else if (highResolutionOutputSizeshNQ4ISI instanceof java.lang.Byte) {
                    java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                    sb11.append(obj5);
                    sb11.append(java.lang.String.format("0x%01X", (java.lang.Byte) highResolutionOutputSizeshNQ4ISI));
                    obj = sb11.toString();
                } else {
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                    sb12.append(obj5);
                    sb12.append(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI).trim());
                    obj = sb12.toString();
                }
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                sb13.append(obj);
                sb13.append(lineSeparator);
                java.lang.String obj6 = sb13.toString();
                if (!it.hasNext()) {
                    java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                    sb14.append(obj6);
                    sb14.append(str3);
                    sb14.append("}");
                    obj6 = sb14.toString();
                }
                str4 = obj6;
                structure = this;
            }
            str = str4;
        }
        if (i == 0 && z2) {
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append(lineSeparator);
            sb15.append("memory dump");
            sb15.append(lineSeparator);
            java.lang.String obj7 = sb15.toString();
            byte[] byteArray = getPointer().getByteArray(0L, size());
            for (int i3 = 0; i3 < byteArray.length; i3++) {
                int i4 = i3 % 4;
                if (i4 == 0) {
                    java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                    sb16.append(obj7);
                    sb16.append("[");
                    obj7 = sb16.toString();
                }
                byte b = byteArray[i3];
                if (b >= 0 && b < 16) {
                    java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                    sb17.append(obj7);
                    sb17.append("0");
                    obj7 = sb17.toString();
                }
                java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
                sb18.append(obj7);
                sb18.append(java.lang.Integer.toHexString(byteArray[i3] & 255));
                obj7 = sb18.toString();
                if (i4 == 3 && i3 < byteArray.length - 1) {
                    java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
                    sb19.append(obj7);
                    sb19.append("]");
                    sb19.append(lineSeparator);
                    obj7 = sb19.toString();
                }
            }
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(obj7);
            sb20.append("]");
            str = sb20.toString();
        }
        java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
        sb21.append(obj2);
        sb21.append(" {");
        sb21.append(str);
        return sb21.toString();
    }

    public com.sun.jna.Structure[] toArray(com.sun.jna.Structure[] structureArr) {
        ensureAllocated();
        com.sun.jna.Pointer pointer = this.memory;
        if (pointer instanceof com.sun.jna.Structure.AutoAllocated) {
            int length = structureArr.length * size();
            if (((com.sun.jna.Memory) pointer).size() < length) {
                useMemory(autoAllocate(length));
            }
        }
        structureArr[0] = this;
        int size = size();
        for (int i = 1; i < structureArr.length; i++) {
            com.sun.jna.Structure newInstance = newInstance((java.lang.Class<com.sun.jna.Structure>) getClass(), this.memory.share(i * size, size));
            structureArr[i] = newInstance;
            if (!newInstance.readCalled) {
                newInstance.autoRead();
            }
        }
        if (!(this instanceof com.sun.jna.Structure.ByValue)) {
            this.array = structureArr;
        }
        return structureArr;
    }

    public com.sun.jna.Structure[] toArray(int i) {
        return toArray((com.sun.jna.Structure[]) java.lang.reflect.Array.newInstance(getClass(), i));
    }

    public boolean dataEquals(com.sun.jna.Structure structure) {
        return dataEquals(structure, false);
    }

    public boolean dataEquals(com.sun.jna.Structure structure, boolean z) {
        if (z) {
            structure.getPointer().clear(structure.size());
            structure.write();
            getPointer().clear(size());
            write();
        }
        byte[] byteArray = structure.getPointer().getByteArray(0L, structure.size());
        byte[] byteArray2 = getPointer().getByteArray(0L, size());
        if (byteArray.length != byteArray2.length) {
            return false;
        }
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] != byteArray2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.sun.jna.Structure) && obj.getClass() == getClass() && ((com.sun.jna.Structure) obj).getPointer().equals(getPointer());
    }

    public int hashCode() {
        if (getPointer() != null) {
            return getPointer().hashCode();
        }
        return getClass().hashCode();
    }

    protected void cacheTypeInfo(com.sun.jna.Pointer pointer) {
        this.typeInfo = pointer.peer;
    }

    final com.sun.jna.Structure.FFIType Camera2StreamConfigurationMap(com.sun.jna.Structure.StructField structField) {
        com.sun.jna.ToNativeConverter toNativeConverter;
        java.lang.Class<?> cls = structField.type;
        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(structField.field);
        com.sun.jna.TypeMapper typeMapper = this.typeMapper;
        if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
            cls = toNativeConverter.nativeType();
            highResolutionOutputSizeshNQ4ISI = toNativeConverter.toNative(highResolutionOutputSizeshNQ4ISI, new com.sun.jna.ToNativeContext());
        }
        return com.sun.jna.Structure.FFIType.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, cls);
    }

    public void setAutoSynch(boolean z) {
        setAutoRead(z);
        setAutoWrite(z);
    }

    public void setAutoRead(boolean z) {
        this.autoRead = z;
    }

    public boolean getAutoRead() {
        return this.autoRead;
    }

    public void setAutoWrite(boolean z) {
        this.autoWrite = z;
    }

    public boolean getAutoWrite() {
        return this.autoWrite;
    }

    private static <T extends com.sun.jna.Structure> T newInstance(java.lang.Class<T> cls, long j) {
        try {
            T t = (T) newInstance(cls, j == 0 ? PLACEHOLDER_MEMORY : new com.sun.jna.Pointer(j));
            if (j != 0 && !t.readCalled) {
                t.autoRead();
            }
            return t;
        } catch (java.lang.Throwable th) {
            LOG.log(java.util.logging.Level.WARNING, "JNA: Error creating structure", th);
            return null;
        }
    }

    public static <T extends com.sun.jna.Structure> T newInstance(java.lang.Class<T> cls) throws java.lang.IllegalArgumentException {
        T t = (T) com.sun.jna.Klass.getHighSpeedVideoFpsRangesFor(cls);
        if (t instanceof com.sun.jna.Structure.ByValue) {
            t.allocateMemory();
        }
        return t;
    }

    protected static class StructField {
        public com.sun.jna.FromNativeContext context;
        public java.lang.reflect.Field field;
        public boolean isReadOnly;
        public boolean isVolatile;

        /* renamed from: name, reason: collision with root package name */
        public java.lang.String f6673name;
        public com.sun.jna.FromNativeConverter readConverter;
        public java.lang.Class<?> type;
        public com.sun.jna.ToNativeConverter writeConverter;
        public int size = -1;
        public int offset = -1;

        protected StructField() {
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.f6673name);
            sb.append("@");
            sb.append(this.offset);
            sb.append("[");
            sb.append(this.size);
            sb.append("] (");
            sb.append(this.type);
            sb.append(")");
            return sb.toString();
        }
    }

    @com.sun.jna.Structure.FieldOrder({io.ktor.http.ContentDisposition.Parameters.Size, "alignment", "type", "elements"})
    static class FFIType extends com.sun.jna.Structure {
        private static final java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure.FFIType> getHighSpeedVideoFpsRangesFor;
        public com.sun.jna.Pointer Camera2StreamConfigurationMap;
        public short getHighResolutionOutputSizeshNQ4ISI;
        public com.sun.jna.Structure.FFIType.size_t getHighSpeedVideoFpsRanges;
        public short getHighSpeedVideoSizes;
        private static final java.util.Map<java.lang.Class, java.util.Map<java.lang.Integer, com.sun.jna.Structure.FFIType>> getInputSizeshNQ4ISI = new java.util.WeakHashMap();
        private static final java.util.Map<java.lang.Class, com.sun.jna.Structure.FFIType> getHighSpeedVideoSizesFor = new java.util.WeakHashMap();

        public static class size_t extends com.sun.jna.IntegerType {
            private static final long serialVersionUID = 1;

            public size_t() {
                this(0L);
            }

            public size_t(long j) {
                super(com.sun.jna.Native.SIZE_T_SIZE, j);
            }
        }

        static {
            java.util.HashMap hashMap = new java.util.HashMap();
            getHighSpeedVideoFpsRangesFor = hashMap;
            if (com.sun.jna.Native.POINTER_SIZE != 0) {
                if (com.sun.jna.Structure.FFIType.FFITypes.ffi_type_void != null) {
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_void, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_void));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_float, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_float));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_double, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_double));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_longdouble, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_longdouble));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint8, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint8));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint8, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint8));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint16, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint16));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint16, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint16));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint32, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint32));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint64, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint64));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint64, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint64));
                    hashMap.put(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_pointer, (com.sun.jna.Structure.FFIType) com.sun.jna.Structure.newInstance(com.sun.jna.Structure.FFIType.class, com.sun.jna.Structure.FFIType.FFITypes.ffi_type_pointer));
                    java.util.Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        ((com.sun.jna.Structure.FFIType) it.next()).read();
                    }
                    java.lang.Class cls = java.lang.Void.TYPE;
                    java.util.Map<com.sun.jna.Pointer, com.sun.jna.Structure.FFIType> map = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap(cls, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_void));
                    Camera2StreamConfigurationMap(java.lang.Void.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_void));
                    Camera2StreamConfigurationMap(java.lang.Float.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_float));
                    Camera2StreamConfigurationMap(java.lang.Float.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_float));
                    Camera2StreamConfigurationMap(java.lang.Double.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_double));
                    Camera2StreamConfigurationMap(java.lang.Double.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_double));
                    Camera2StreamConfigurationMap(java.lang.Long.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint64));
                    Camera2StreamConfigurationMap(java.lang.Long.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint64));
                    Camera2StreamConfigurationMap(java.lang.Integer.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint32));
                    Camera2StreamConfigurationMap(java.lang.Integer.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint32));
                    Camera2StreamConfigurationMap(java.lang.Short.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint16));
                    Camera2StreamConfigurationMap(java.lang.Short.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint16));
                    com.sun.jna.Structure.FFIType fFIType = map.get(com.sun.jna.Native.WCHAR_SIZE == 2 ? com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint16 : com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32);
                    Camera2StreamConfigurationMap(java.lang.Character.TYPE, 0, fFIType);
                    Camera2StreamConfigurationMap(java.lang.Character.class, 0, fFIType);
                    Camera2StreamConfigurationMap(java.lang.Byte.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint8));
                    Camera2StreamConfigurationMap(java.lang.Byte.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint8));
                    Camera2StreamConfigurationMap(com.sun.jna.Pointer.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_pointer));
                    Camera2StreamConfigurationMap(java.lang.String.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_pointer));
                    Camera2StreamConfigurationMap(com.sun.jna.WString.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_pointer));
                    Camera2StreamConfigurationMap(java.lang.Boolean.TYPE, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32));
                    Camera2StreamConfigurationMap(java.lang.Boolean.class, 0, map.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32));
                    return;
                }
                throw new java.lang.Error("FFI types not initialized");
            }
            throw new java.lang.Error("Native library not initialized");
        }

        static class FFITypes {
            private static com.sun.jna.Pointer ffi_type_double;
            private static com.sun.jna.Pointer ffi_type_float;
            private static com.sun.jna.Pointer ffi_type_longdouble;
            private static com.sun.jna.Pointer ffi_type_pointer;
            private static com.sun.jna.Pointer ffi_type_sint16;
            private static com.sun.jna.Pointer ffi_type_sint32;
            private static com.sun.jna.Pointer ffi_type_sint64;
            private static com.sun.jna.Pointer ffi_type_sint8;
            private static com.sun.jna.Pointer ffi_type_uint16;
            private static com.sun.jna.Pointer ffi_type_uint32;
            private static com.sun.jna.Pointer ffi_type_uint64;
            private static com.sun.jna.Pointer ffi_type_uint8;
            private static com.sun.jna.Pointer ffi_type_void;

            private FFITypes() {
            }
        }

        private FFIType(com.sun.jna.Structure.FFIType fFIType) {
            this.getHighSpeedVideoSizes = (short) 13;
            this.getHighSpeedVideoFpsRanges = fFIType.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = fFIType.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = fFIType.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = fFIType.Camera2StreamConfigurationMap;
        }

        public FFIType() {
            this.getHighSpeedVideoSizes = (short) 13;
        }

        private FFIType(com.sun.jna.Structure structure) {
            com.sun.jna.Pointer[] pointerArr;
            this.getHighSpeedVideoSizes = (short) 13;
            structure.getHighSpeedVideoFpsRanges(true);
            int i = 0;
            if (structure instanceof com.sun.jna.Union) {
                int i2 = 0;
                com.sun.jna.Structure.FFIType fFIType = null;
                for (com.sun.jna.Structure.StructField structField : structure.Camera2StreamConfigurationMap().values()) {
                    com.sun.jna.Structure.FFIType Camera2StreamConfigurationMap = structure.Camera2StreamConfigurationMap(structField);
                    com.sun.jna.Pointer pointer = Camera2StreamConfigurationMap.getPointer();
                    i = (pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint8) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint8) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint16) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint16) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint32) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint64) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_sint64) || pointer.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_pointer)) ? 1 : i;
                    if (fFIType == null || i2 < structField.size || (i2 == structField.size && com.sun.jna.Structure.class.isAssignableFrom(structField.type))) {
                        i2 = structField.size;
                        fFIType = Camera2StreamConfigurationMap;
                    }
                }
                if (((com.sun.jna.Platform.isIntel() && com.sun.jna.Platform.is64Bit() && !com.sun.jna.Platform.isWindows()) || com.sun.jna.Platform.isARM() || com.sun.jna.Platform.isLoongArch()) && i != 0) {
                    com.sun.jna.Pointer pointer2 = fFIType.getPointer();
                    if (pointer2.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_float) || pointer2.equals(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_double)) {
                        com.sun.jna.Structure.FFIType fFIType2 = new com.sun.jna.Structure.FFIType(fFIType);
                        if (fFIType2.getHighSpeedVideoFpsRanges.intValue() == 4) {
                            fFIType2.getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint32).getHighSpeedVideoSizes;
                        } else if (fFIType2.getHighSpeedVideoFpsRanges.intValue() == 8) {
                            fFIType2.getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor.get(com.sun.jna.Structure.FFIType.FFITypes.ffi_type_uint64).getHighSpeedVideoSizes;
                        }
                        fFIType2.write();
                        fFIType = fFIType2;
                    }
                }
                pointerArr = new com.sun.jna.Pointer[]{fFIType.getPointer(), null};
                getHighSpeedVideoSizesFor.put(structure.getClass(), fFIType);
            } else {
                pointerArr = new com.sun.jna.Pointer[structure.Camera2StreamConfigurationMap().size() + 1];
                java.util.Iterator<com.sun.jna.Structure.StructField> it = structure.Camera2StreamConfigurationMap().values().iterator();
                while (it.hasNext()) {
                    pointerArr[i] = structure.Camera2StreamConfigurationMap(it.next()).getPointer();
                    i++;
                }
            }
            getHighSpeedVideoSizes(pointerArr);
            write();
        }

        private FFIType(java.lang.Object obj, java.lang.Class<?> cls) {
            this.getHighSpeedVideoSizes = (short) 13;
            int length = java.lang.reflect.Array.getLength(obj);
            com.sun.jna.Pointer[] pointerArr = new com.sun.jna.Pointer[length + 1];
            com.sun.jna.Pointer pointer = getHighSpeedVideoFpsRangesFor(null, cls.getComponentType()).getPointer();
            for (int i = 0; i < length; i++) {
                pointerArr[i] = pointer;
            }
            getHighSpeedVideoSizes(pointerArr);
            write();
        }

        private void getHighSpeedVideoSizes(com.sun.jna.Pointer[] pointerArr) {
            com.sun.jna.Memory memory = new com.sun.jna.Memory(com.sun.jna.Native.POINTER_SIZE * pointerArr.length);
            this.Camera2StreamConfigurationMap = memory;
            memory.write(0L, pointerArr, 0, pointerArr.length);
            write();
        }

        static com.sun.jna.Structure.FFIType getHighSpeedVideoSizes(java.lang.Object obj) {
            com.sun.jna.Structure.FFIType Camera2StreamConfigurationMap;
            if (obj == null) {
                synchronized (getInputSizeshNQ4ISI) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(com.sun.jna.Pointer.class, 0);
                }
                return Camera2StreamConfigurationMap;
            }
            if (obj instanceof java.lang.Class) {
                return getHighSpeedVideoFpsRangesFor(null, (java.lang.Class) obj);
            }
            return getHighSpeedVideoFpsRangesFor(obj, obj.getClass());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.sun.jna.Structure.FFIType getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.Class<?> cls) {
            com.sun.jna.ToNativeConverter toNativeConverter;
            com.sun.jna.TypeMapper typeMapper = com.sun.jna.Native.getTypeMapper(cls);
            if (typeMapper != null && (toNativeConverter = typeMapper.getToNativeConverter(cls)) != null) {
                cls = toNativeConverter.nativeType();
            }
            java.util.Map<java.lang.Class, java.util.Map<java.lang.Integer, com.sun.jna.Structure.FFIType>> map = getInputSizeshNQ4ISI;
            synchronized (map) {
                com.sun.jna.Structure.FFIType Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cls, cls.isArray() ? java.lang.reflect.Array.getLength(obj) : 0);
                if (Camera2StreamConfigurationMap != null) {
                    return Camera2StreamConfigurationMap;
                }
                if ((com.sun.jna.Platform.HAS_BUFFERS && java.nio.Buffer.class.isAssignableFrom(cls)) || com.sun.jna.Callback.class.isAssignableFrom(cls)) {
                    map.put(cls, map.get(com.sun.jna.Pointer.class));
                    return map.get(com.sun.jna.Pointer.class).get(0);
                }
                if (com.sun.jna.Structure.class.isAssignableFrom(cls)) {
                    if (obj == null) {
                        obj = newInstance(cls, com.sun.jna.Structure.PLACEHOLDER_MEMORY);
                    }
                    if (com.sun.jna.Structure.ByReference.class.isAssignableFrom(cls)) {
                        map.put(cls, map.get(com.sun.jna.Pointer.class));
                        return map.get(com.sun.jna.Pointer.class).get(0);
                    }
                    com.sun.jna.Structure.FFIType fFIType = new com.sun.jna.Structure.FFIType((com.sun.jna.Structure) obj);
                    Camera2StreamConfigurationMap(cls, 0, fFIType);
                    return fFIType;
                }
                if (com.sun.jna.NativeMapped.class.isAssignableFrom(cls)) {
                    com.sun.jna.NativeMappedConverter nativeMappedConverter = com.sun.jna.NativeMappedConverter.getInstance(cls);
                    return getHighSpeedVideoFpsRangesFor(nativeMappedConverter.toNative(obj, new com.sun.jna.ToNativeContext()), nativeMappedConverter.nativeType());
                }
                if (cls.isArray()) {
                    com.sun.jna.Structure.FFIType fFIType2 = new com.sun.jna.Structure.FFIType(obj, cls);
                    Camera2StreamConfigurationMap(cls, java.lang.reflect.Array.getLength(obj), fFIType2);
                    return fFIType2;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
                sb.append(cls);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }

        private static com.sun.jna.Structure.FFIType Camera2StreamConfigurationMap(java.lang.Class cls, int i) {
            java.util.Map<java.lang.Integer, com.sun.jna.Structure.FFIType> map = getInputSizeshNQ4ISI.get(cls);
            if (map != null) {
                return map.get(java.lang.Integer.valueOf(i));
            }
            return null;
        }

        private static void Camera2StreamConfigurationMap(java.lang.Class cls, int i, com.sun.jna.Structure.FFIType fFIType) {
            java.util.Map<java.lang.Class, java.util.Map<java.lang.Integer, com.sun.jna.Structure.FFIType>> map = getInputSizeshNQ4ISI;
            synchronized (map) {
                java.util.Map<java.lang.Integer, com.sun.jna.Structure.FFIType> map2 = map.get(cls);
                if (map2 == null) {
                    map2 = new java.util.HashMap<>();
                    map.put(cls, map2);
                }
                map2.put(java.lang.Integer.valueOf(i), fFIType);
            }
        }
    }

    static class AutoAllocated extends com.sun.jna.Memory {
        public AutoAllocated(int i) {
            super(i);
            super.clear();
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("auto-");
            sb.append(super.toString());
            return sb.toString();
        }
    }

    private static void getHighSpeedVideoSizes(com.sun.jna.Structure[] structureArr) {
        if (com.sun.jna.Structure.ByReference[].class.isAssignableFrom(structureArr.getClass())) {
            return;
        }
        com.sun.jna.Pointer pointer = structureArr[0].getPointer();
        int size = structureArr[0].size();
        for (int i = 1; i < structureArr.length; i++) {
            if (structureArr[i].getPointer().peer != pointer.peer + (size * i)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Structure array elements must use contiguous memory (bad backing address at Structure array index ");
                sb.append(i);
                sb.append(")");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    public static void autoRead(com.sun.jna.Structure[] structureArr) {
        getHighSpeedVideoSizes(structureArr);
        com.sun.jna.Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoRead();
            return;
        }
        for (com.sun.jna.Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoRead();
            }
        }
    }

    public void autoRead() {
        if (!getAutoRead()) {
            return;
        }
        read();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            com.sun.jna.Structure[] structureArr = this.array;
            if (i >= structureArr.length) {
                return;
            }
            structureArr[i].autoRead();
            i++;
        }
    }

    public static void autoWrite(com.sun.jna.Structure[] structureArr) {
        getHighSpeedVideoSizes(structureArr);
        com.sun.jna.Structure structure = structureArr[0];
        if (structure.array == structureArr) {
            structure.autoWrite();
            return;
        }
        for (com.sun.jna.Structure structure2 : structureArr) {
            if (structure2 != null) {
                structure2.autoWrite();
            }
        }
    }

    public void autoWrite() {
        if (!getAutoWrite()) {
            return;
        }
        write();
        if (this.array == null) {
            return;
        }
        int i = 1;
        while (true) {
            com.sun.jna.Structure[] structureArr = this.array;
            if (i >= structureArr.length) {
                return;
            }
            structureArr[i].autoWrite();
            i++;
        }
    }

    protected int getNativeSize(java.lang.Class<?> cls) {
        return getNativeSize(cls, null);
    }

    protected int getNativeSize(java.lang.Class<?> cls, java.lang.Object obj) {
        return com.sun.jna.Native.getNativeSize(cls, obj);
    }

    static void getHighSpeedVideoFpsRanges(java.lang.Class<? extends com.sun.jna.Structure> cls) {
        try {
            cls.getConstructor(new java.lang.Class[0]);
        } catch (java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No suitable constructor found for class: ");
            sb.append(cls.getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static <T extends com.sun.jna.Structure> T newInstance(java.lang.Class<T> cls, com.sun.jna.Pointer pointer) throws java.lang.IllegalArgumentException {
        java.lang.reflect.Constructor<?> constructor;
        try {
            java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(com.sun.jna.Pointer.class)) {
                    break;
                }
                i++;
            }
            if (constructor != null) {
                return (T) constructor.newInstance(pointer);
            }
        } catch (java.lang.IllegalAccessException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Instantiation of ");
            sb.append(cls);
            sb.append(" (Pointer) not allowed, is it public?");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalArgumentException("Can't instantiate ".concat(java.lang.String.valueOf(cls)), e2);
        } catch (java.lang.SecurityException unused) {
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.IllegalArgumentException("Exception thrown while instantiating an instance of ".concat(java.lang.String.valueOf(cls)), e3);
        }
        T t = (T) newInstance(cls);
        if (pointer != PLACEHOLDER_MEMORY) {
            t.useMemory(pointer);
        }
        return t;
    }

    protected void allocateMemory() {
        allocateMemory(getHighSpeedVideoSizes(true, false));
    }

    com.sun.jna.Pointer getTypeInfo() {
        com.sun.jna.Pointer pointer = com.sun.jna.Structure.FFIType.getHighSpeedVideoSizes(this).getPointer();
        cacheTypeInfo(pointer);
        return pointer;
    }
}
