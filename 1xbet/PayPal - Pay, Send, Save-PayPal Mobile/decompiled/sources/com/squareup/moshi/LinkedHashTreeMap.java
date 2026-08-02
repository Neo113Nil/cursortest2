package com.squareup.moshi;

/* loaded from: classes3.dex */
final class LinkedHashTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final java.util.Comparator<java.lang.Comparable> getOutputFormats = new java.util.Comparator<java.lang.Comparable>() { // from class: com.squareup.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    final com.squareup.moshi.LinkedHashTreeMap.Node<K, V> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final java.util.Comparator<? super K> getHighSpeedVideoFpsRangesFor;
    com.squareup.moshi.LinkedHashTreeMap.Node<K, V>[] getHighSpeedVideoSizes;
    private com.squareup.moshi.LinkedHashTreeMap<K, V>.KeySet getHighSpeedVideoSizesFor;
    private com.squareup.moshi.LinkedHashTreeMap<K, V>.EntrySet getInputFormats;
    int getInputSizeshNQ4ISI;

    LinkedHashTreeMap() {
        this((byte) 0);
    }

    private LinkedHashTreeMap(byte b) {
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRangesFor = getOutputFormats;
        this.Camera2StreamConfigurationMap = new com.squareup.moshi.LinkedHashTreeMap.Node<>();
        this.getHighSpeedVideoSizes = new com.squareup.moshi.LinkedHashTreeMap.Node[16];
        int i = 16 / 2;
        int i2 = 16 / 4;
        this.getInputSizeshNQ4ISI = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(obj);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return getHighResolutionOutputSizeshNQ4ISI(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((com.squareup.moshi.LinkedHashTreeMap<K, V>) k, true);
        V v2 = highSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
        highSpeedVideoFpsRanges.getHighSpeedVideoSizesFor = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Arrays.fill(this.getHighSpeedVideoSizes, (java.lang.Object) null);
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighResolutionOutputSizeshNQ4ISI++;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node = this.Camera2StreamConfigurationMap;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighResolutionOutputSizeshNQ4ISI;
        while (node2 != node) {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node2.getHighResolutionOutputSizeshNQ4ISI;
            node2.getInputSizeshNQ4ISI = null;
            node2.getHighResolutionOutputSizeshNQ4ISI = null;
            node2 = node3;
        }
        node.getInputSizeshNQ4ISI = node;
        node.getHighResolutionOutputSizeshNQ4ISI = node;
    }

    private com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRanges(K k, boolean z) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node;
        int i;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node4;
        int compare;
        java.util.Comparator<? super K> comparator = this.getHighSpeedVideoFpsRangesFor;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr = this.getHighSpeedVideoSizes;
        int hashCode = k.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = (i2 >>> 4) ^ (i2 ^ (i2 >>> 7));
        int length = (nodeArr.length - 1) & i3;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node5 = nodeArr[length];
        if (node5 != null) {
            java.lang.Comparable comparable = comparator == getOutputFormats ? (java.lang.Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(node5.getHighSpeedVideoFpsRanges);
                } else {
                    compare = comparator.compare(k, node5.getHighSpeedVideoFpsRanges);
                }
                if (compare == 0) {
                    return node5;
                }
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node6 = compare < 0 ? node5.getHighSpeedVideoSizes : node5.getOutputFormats;
                if (node6 == null) {
                    node = node5;
                    i = compare;
                    break;
                }
                node5 = node6;
            }
        } else {
            node = node5;
            i = 0;
        }
        if (!z) {
            return null;
        }
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node7 = this.Camera2StreamConfigurationMap;
        if (node == null) {
            if (comparator == getOutputFormats && !(k instanceof java.lang.Comparable)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new java.lang.ClassCastException(sb.toString());
            }
            node2 = new com.squareup.moshi.LinkedHashTreeMap.Node<>(node, k, i3, node7, node7.getInputSizeshNQ4ISI);
            nodeArr[length] = node2;
        } else {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node8 = new com.squareup.moshi.LinkedHashTreeMap.Node<>(node, k, i3, node7, node7.getInputSizeshNQ4ISI);
            if (i < 0) {
                node.getHighSpeedVideoSizes = node8;
            } else {
                node.getOutputFormats = node8;
            }
            Camera2StreamConfigurationMap(node, true);
            node2 = node8;
        }
        int i4 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i4 + 1;
        if (i4 > this.getInputSizeshNQ4ISI) {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr2 = this.getHighSpeedVideoSizes;
            int length2 = nodeArr2.length;
            int i5 = length2 * 2;
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr3 = new com.squareup.moshi.LinkedHashTreeMap.Node[i5];
            com.squareup.moshi.LinkedHashTreeMap.AvlIterator avlIterator = new com.squareup.moshi.LinkedHashTreeMap.AvlIterator();
            com.squareup.moshi.LinkedHashTreeMap.AvlBuilder avlBuilder = new com.squareup.moshi.LinkedHashTreeMap.AvlBuilder();
            com.squareup.moshi.LinkedHashTreeMap.AvlBuilder avlBuilder2 = new com.squareup.moshi.LinkedHashTreeMap.AvlBuilder();
            for (int i6 = 0; i6 < length2; i6++) {
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node9 = nodeArr2[i6];
                if (node9 != null) {
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node10 = null;
                    for (com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node11 = node9; node11 != null; node11 = node11.getHighSpeedVideoSizes) {
                        node11.getInputFormats = node10;
                        node10 = node11;
                    }
                    avlIterator.getHighResolutionOutputSizeshNQ4ISI = node10;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> Camera2StreamConfigurationMap = avlIterator.Camera2StreamConfigurationMap();
                        if (Camera2StreamConfigurationMap == null) {
                            break;
                        }
                        if ((Camera2StreamConfigurationMap.Camera2StreamConfigurationMap & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                    avlBuilder.getHighSpeedVideoSizes(i7);
                    avlBuilder2.getHighSpeedVideoSizes(i8);
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node12 = null;
                    while (node9 != null) {
                        node9.getInputFormats = node12;
                        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node13 = node9;
                        node9 = node9.getHighSpeedVideoSizes;
                        node12 = node13;
                    }
                    avlIterator.getHighResolutionOutputSizeshNQ4ISI = node12;
                    while (true) {
                        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> Camera2StreamConfigurationMap2 = avlIterator.Camera2StreamConfigurationMap();
                        if (Camera2StreamConfigurationMap2 == null) {
                            break;
                        }
                        if ((Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap & length2) == 0) {
                            avlBuilder.getHighSpeedVideoSizes(Camera2StreamConfigurationMap2);
                        } else {
                            avlBuilder2.getHighSpeedVideoSizes(Camera2StreamConfigurationMap2);
                        }
                    }
                    if (i7 > 0) {
                        node3 = avlBuilder.getHighSpeedVideoFpsRanges;
                        if (node3.getInputFormats != null) {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        node3 = null;
                    }
                    nodeArr3[i6] = node3;
                    if (i8 > 0) {
                        node4 = avlBuilder2.getHighSpeedVideoFpsRanges;
                        if (node4.getInputFormats != null) {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        node4 = null;
                    }
                    nodeArr3[i6 + length2] = node4;
                }
            }
            this.getHighSpeedVideoSizes = nodeArr3;
            this.getInputSizeshNQ4ISI = (i5 / 2) + (i5 / 4);
        }
        this.getHighResolutionOutputSizeshNQ4ISI++;
        return node2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return getHighSpeedVideoFpsRanges((com.squareup.moshi.LinkedHashTreeMap<K, V>) obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    final com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRangesFor(java.util.Map.Entry<?, ?> entry) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(entry.getKey());
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        V v = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        java.lang.Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node, boolean z) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3;
        int i;
        if (z) {
            node.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI = node.getHighResolutionOutputSizeshNQ4ISI;
            node.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI = node.getInputSizeshNQ4ISI;
            node.getInputSizeshNQ4ISI = null;
            node.getHighResolutionOutputSizeshNQ4ISI = null;
        }
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node4 = node.getHighSpeedVideoSizes;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node5 = node.getOutputFormats;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node6 = node.getInputFormats;
        int i2 = 0;
        if (node4 != null && node5 != null) {
            if (node4.getHighSpeedVideoFpsRangesFor > node5.getHighSpeedVideoFpsRangesFor) {
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node7 = node4.getOutputFormats;
                while (true) {
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node8 = node7;
                    node3 = node4;
                    node4 = node8;
                    if (node4 == null) {
                        break;
                    } else {
                        node7 = node4.getOutputFormats;
                    }
                }
            } else {
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node9 = node5.getHighSpeedVideoSizes;
                while (true) {
                    node2 = node5;
                    node5 = node9;
                    if (node5 == null) {
                        break;
                    } else {
                        node9 = node5.getHighSpeedVideoSizes;
                    }
                }
                node3 = node2;
            }
            getHighResolutionOutputSizeshNQ4ISI(node3, false);
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node10 = node.getHighSpeedVideoSizes;
            if (node10 != null) {
                i = node10.getHighSpeedVideoFpsRangesFor;
                node3.getHighSpeedVideoSizes = node10;
                node10.getInputFormats = node3;
                node.getHighSpeedVideoSizes = null;
            } else {
                i = 0;
            }
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node11 = node.getOutputFormats;
            if (node11 != null) {
                i2 = node11.getHighSpeedVideoFpsRangesFor;
                node3.getOutputFormats = node11;
                node11.getInputFormats = node3;
                node.getOutputFormats = null;
            }
            node3.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(i, i2) + 1;
            getHighSpeedVideoFpsRanges(node, node3);
            return;
        }
        if (node4 != null) {
            getHighSpeedVideoFpsRanges(node, node4);
            node.getHighSpeedVideoSizes = null;
        } else if (node5 != null) {
            getHighSpeedVideoFpsRanges(node, node5);
            node.getOutputFormats = null;
        } else {
            getHighSpeedVideoFpsRanges(node, (com.squareup.moshi.LinkedHashTreeMap.Node) null);
        }
        Camera2StreamConfigurationMap(node6, false);
        this.getHighSpeedVideoFpsRanges--;
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    private void getHighSpeedVideoFpsRanges(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node, com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getInputFormats;
        node.getInputFormats = null;
        if (node2 != null) {
            node2.getInputFormats = node3;
        }
        if (node3 != null) {
            if (node3.getHighSpeedVideoSizes == node) {
                node3.getHighSpeedVideoSizes = node2;
                return;
            } else {
                node3.getOutputFormats = node2;
                return;
            }
        }
        int i = node.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes[i & (r0.length - 1)] = node2;
    }

    private void Camera2StreamConfigurationMap(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node, boolean z) {
        while (node != null) {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoSizes;
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getOutputFormats;
            int i = node2 != null ? node2.getHighSpeedVideoFpsRangesFor : 0;
            int i2 = node3 != null ? node3.getHighSpeedVideoFpsRangesFor : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.getHighSpeedVideoSizes;
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node5 = node3.getOutputFormats;
                int i4 = (node4 != null ? node4.getHighSpeedVideoFpsRangesFor : 0) - (node5 != null ? node5.getHighSpeedVideoFpsRangesFor : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    getHighSpeedVideoFpsRangesFor((com.squareup.moshi.LinkedHashTreeMap.Node) node3);
                }
                getHighResolutionOutputSizeshNQ4ISI((com.squareup.moshi.LinkedHashTreeMap.Node) node);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node6 = node2.getHighSpeedVideoSizes;
                com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node7 = node2.getOutputFormats;
                int i5 = (node6 != null ? node6.getHighSpeedVideoFpsRangesFor : 0) - (node7 != null ? node7.getHighSpeedVideoFpsRangesFor : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    getHighResolutionOutputSizeshNQ4ISI((com.squareup.moshi.LinkedHashTreeMap.Node) node2);
                }
                getHighSpeedVideoFpsRangesFor((com.squareup.moshi.LinkedHashTreeMap.Node) node);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.getHighSpeedVideoFpsRangesFor = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.getInputFormats;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoSizes;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getOutputFormats;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.getHighSpeedVideoSizes;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node5 = node3.getOutputFormats;
        node.getOutputFormats = node4;
        if (node4 != null) {
            node4.getInputFormats = node;
        }
        getHighSpeedVideoFpsRanges(node, node3);
        node3.getHighSpeedVideoSizes = node;
        node.getInputFormats = node3;
        node.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(node2 != null ? node2.getHighSpeedVideoFpsRangesFor : 0, node4 != null ? node4.getHighSpeedVideoFpsRangesFor : 0) + 1;
        node3.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(node.getHighSpeedVideoFpsRangesFor, node5 != null ? node5.getHighSpeedVideoFpsRangesFor : 0) + 1;
    }

    private void getHighSpeedVideoFpsRangesFor(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoSizes;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getOutputFormats;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node4 = node2.getHighSpeedVideoSizes;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node5 = node2.getOutputFormats;
        node.getHighSpeedVideoSizes = node5;
        if (node5 != null) {
            node5.getInputFormats = node;
        }
        getHighSpeedVideoFpsRanges(node, node2);
        node2.getOutputFormats = node;
        node.getInputFormats = node2;
        node.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(node3 != null ? node3.getHighSpeedVideoFpsRangesFor : 0, node5 != null ? node5.getHighSpeedVideoFpsRangesFor : 0) + 1;
        node2.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(node.getHighSpeedVideoFpsRangesFor, node4 != null ? node4.getHighSpeedVideoFpsRangesFor : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        com.squareup.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet = this.getInputFormats;
        if (entrySet != null) {
            return entrySet;
        }
        com.squareup.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new com.squareup.moshi.LinkedHashTreeMap.EntrySet();
        this.getInputFormats = entrySet2;
        return entrySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        com.squareup.moshi.LinkedHashTreeMap<K, V>.KeySet keySet = this.getHighSpeedVideoSizesFor;
        if (keySet != null) {
            return keySet;
        }
        com.squareup.moshi.LinkedHashTreeMap<K, V>.KeySet keySet2 = new com.squareup.moshi.LinkedHashTreeMap.KeySet();
        this.getHighSpeedVideoSizesFor = keySet2;
        return keySet2;
    }

    /* loaded from: classes5.dex */
    static final class Node<K, V> implements java.util.Map.Entry<K, V> {
        final int Camera2StreamConfigurationMap;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighResolutionOutputSizeshNQ4ISI;
        final K getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoSizes;
        V getHighSpeedVideoSizesFor;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getInputFormats;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getInputSizeshNQ4ISI;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getOutputFormats;

        Node() {
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = -1;
            this.getInputSizeshNQ4ISI = this;
            this.getHighResolutionOutputSizeshNQ4ISI = this;
        }

        Node(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node, K k, int i, com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2, com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3) {
            this.getInputFormats = node;
            this.getHighSpeedVideoFpsRanges = k;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = 1;
            this.getHighResolutionOutputSizeshNQ4ISI = node2;
            this.getInputSizeshNQ4ISI = node3;
            node3.getHighResolutionOutputSizeshNQ4ISI = this;
            node2.getInputSizeshNQ4ISI = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            K k = this.getHighSpeedVideoFpsRanges;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.getHighSpeedVideoSizesFor;
            return v == null ? entry.getValue() == null : v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.getHighSpeedVideoFpsRanges;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.getHighSpeedVideoSizesFor;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append("=");
            sb.append(this.getHighSpeedVideoSizesFor);
            return sb.toString();
        }
    }

    /* loaded from: classes5.dex */
    static class AvlIterator<K, V> {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighResolutionOutputSizeshNQ4ISI;

        AvlIterator() {
        }

        public final com.squareup.moshi.LinkedHashTreeMap.Node<K, V> Camera2StreamConfigurationMap() {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node = this.getHighResolutionOutputSizeshNQ4ISI;
            if (node == null) {
                return null;
            }
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getInputFormats;
            node.getInputFormats = null;
            for (com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getOutputFormats; node3 != null; node3 = node3.getHighSpeedVideoSizes) {
                node3.getInputFormats = node2;
                node2 = node3;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = node2;
            return node;
        }
    }

    /* loaded from: classes5.dex */
    static final class AvlBuilder<K, V> {
        private int Camera2StreamConfigurationMap;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        AvlBuilder() {
        }

        final void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoSizes = ((java.lang.Integer.highestOneBit(i) * 2) - 1) - i;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = null;
        }

        final void getHighSpeedVideoSizes(com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node) {
            node.getOutputFormats = null;
            node.getInputFormats = null;
            node.getHighSpeedVideoSizes = null;
            node.getHighSpeedVideoFpsRangesFor = 1;
            int i = this.getHighSpeedVideoSizes;
            if (i > 0) {
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                if ((i2 & 1) == 0) {
                    this.getHighSpeedVideoFpsRangesFor = i2 + 1;
                    this.getHighSpeedVideoSizes = i - 1;
                    this.Camera2StreamConfigurationMap++;
                }
            }
            node.getInputFormats = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = node;
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            int i4 = i3 + 1;
            this.getHighSpeedVideoFpsRangesFor = i4;
            int i5 = this.getHighSpeedVideoSizes;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.getHighSpeedVideoFpsRangesFor = i3 + 2;
                this.getHighSpeedVideoSizes = i5 - 1;
                this.Camera2StreamConfigurationMap++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.getHighSpeedVideoFpsRangesFor & i7) != i7) {
                    return;
                }
                int i8 = this.Camera2StreamConfigurationMap;
                if (i8 == 0) {
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node2 = this.getHighSpeedVideoFpsRanges;
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node3 = node2.getInputFormats;
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.getInputFormats;
                    node3.getInputFormats = node4.getInputFormats;
                    this.getHighSpeedVideoFpsRanges = node3;
                    node3.getHighSpeedVideoSizes = node4;
                    node3.getOutputFormats = node2;
                    node3.getHighSpeedVideoFpsRangesFor = node2.getHighSpeedVideoFpsRangesFor + 1;
                    node4.getInputFormats = node3;
                    node2.getInputFormats = node3;
                } else if (i8 == 1) {
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node5 = this.getHighSpeedVideoFpsRanges;
                    com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node6 = node5.getInputFormats;
                    this.getHighSpeedVideoFpsRanges = node6;
                    node6.getOutputFormats = node5;
                    node6.getHighSpeedVideoFpsRangesFor = node5.getHighSpeedVideoFpsRangesFor + 1;
                    node5.getInputFormats = node6;
                    this.Camera2StreamConfigurationMap = 0;
                } else if (i8 == 2) {
                    this.Camera2StreamConfigurationMap = 0;
                }
                i6 *= 2;
            }
        }
    }

    /* loaded from: classes5.dex */
    abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        int Camera2StreamConfigurationMap;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRangesFor = null;
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoSizes;

        LinkedTreeMapIterator() {
            this.getHighSpeedVideoSizes = com.squareup.moshi.LinkedHashTreeMap.this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = com.squareup.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes != com.squareup.moshi.LinkedHashTreeMap.this.Camera2StreamConfigurationMap;
        }

        final com.squareup.moshi.LinkedHashTreeMap.Node<K, V> getHighResolutionOutputSizeshNQ4ISI() {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node = this.getHighSpeedVideoSizes;
            if (node == com.squareup.moshi.LinkedHashTreeMap.this.Camera2StreamConfigurationMap) {
                throw new java.util.NoSuchElementException();
            }
            if (com.squareup.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI != this.Camera2StreamConfigurationMap) {
                throw new java.util.ConcurrentModificationException();
            }
            this.getHighSpeedVideoSizes = node.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = node;
            return node;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> node = this.getHighSpeedVideoFpsRangesFor;
            if (node == null) {
                throw new java.lang.IllegalStateException();
            }
            com.squareup.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI(node, true);
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = com.squareup.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    /* loaded from: classes5.dex */
    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.squareup.moshi.LinkedHashTreeMap.this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.squareup.moshi.LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<java.util.Map.Entry<K, V>>() { // from class: com.squareup.moshi.LinkedHashTreeMap.EntrySet.1
                {
                    com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = com.squareup.moshi.LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public /* synthetic */ java.lang.Object next() {
                    return getHighResolutionOutputSizeshNQ4ISI();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.util.Map.Entry) && com.squareup.moshi.LinkedHashTreeMap.this.getHighSpeedVideoFpsRangesFor((java.util.Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor;
            if (!(obj instanceof java.util.Map.Entry) || (highSpeedVideoFpsRangesFor = com.squareup.moshi.LinkedHashTreeMap.this.getHighSpeedVideoFpsRangesFor((java.util.Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            com.squareup.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.squareup.moshi.LinkedHashTreeMap.this.clear();
        }
    }

    /* loaded from: classes5.dex */
    final class KeySet extends java.util.AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.squareup.moshi.LinkedHashTreeMap.this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.squareup.moshi.LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.squareup.moshi.LinkedHashTreeMap.KeySet.1
                {
                    com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = com.squareup.moshi.LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return getHighResolutionOutputSizeshNQ4ISI().getHighSpeedVideoFpsRanges;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.squareup.moshi.LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.squareup.moshi.LinkedHashTreeMap linkedHashTreeMap = com.squareup.moshi.LinkedHashTreeMap.this;
            com.squareup.moshi.LinkedHashTreeMap.Node<K, V> highResolutionOutputSizeshNQ4ISI = linkedHashTreeMap.getHighResolutionOutputSizeshNQ4ISI(obj);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                linkedHashTreeMap.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
            }
            return highResolutionOutputSizeshNQ4ISI != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.squareup.moshi.LinkedHashTreeMap.this.clear();
        }
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.util.LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        com.squareup.moshi.LinkedHashTreeMap.Node<K, V> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(obj);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, true);
        }
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        }
        return null;
    }
}
