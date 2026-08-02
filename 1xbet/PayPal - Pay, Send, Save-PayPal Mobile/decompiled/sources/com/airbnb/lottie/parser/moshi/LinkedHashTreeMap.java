package com.airbnb.lottie.parser.moshi;

/* loaded from: classes7.dex */
final class LinkedHashTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    private static final java.util.Comparator<java.lang.Comparable> getInputFormats = new java.util.Comparator<java.lang.Comparable>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.1
        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    int Camera2StreamConfigurationMap;
    final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighResolutionOutputSizeshNQ4ISI;
    java.util.Comparator<? super K> getHighSpeedVideoFpsRanges;
    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.KeySet getHighSpeedVideoSizesFor;
    private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.EntrySet getOutputFormats;
    int getOutputMinFrameDuration;

    LinkedHashTreeMap() {
        this((byte) 0);
    }

    private LinkedHashTreeMap(byte b) {
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRanges = getInputFormats;
        this.getHighResolutionOutputSizeshNQ4ISI = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<>();
        this.getHighSpeedVideoFpsRangesFor = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node[16];
        int i = 16 / 2;
        int i2 = 16 / 4;
        this.getOutputMinFrameDuration = 12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object obj) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(obj);
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return getHighSpeedVideoFpsRangesFor(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (k == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(k, true);
        V v2 = highSpeedVideoFpsRanges.getOutputMinFrameDuration;
        highSpeedVideoFpsRanges.getOutputMinFrameDuration = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (java.lang.Object) null);
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoSizes++;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.getHighResolutionOutputSizeshNQ4ISI;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoSizes;
        while (node2 != node) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node2.getHighSpeedVideoSizes;
            node2.getInputFormats = null;
            node2.getHighSpeedVideoSizes = null;
            node2 = node3;
        }
        node.getInputFormats = node;
        node.getHighSpeedVideoSizes = node;
    }

    private com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRanges(K k, boolean z) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node;
        int i;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4;
        int compare;
        java.util.Comparator<? super K> comparator = this.getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = k.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = (i2 >>> 4) ^ (i2 ^ (i2 >>> 7));
        int length = (nodeArr.length - 1) & i3;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = nodeArr[length];
        if (node5 != null) {
            java.lang.Comparable comparable = comparator == getInputFormats ? (java.lang.Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(node5.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    compare = comparator.compare(k, node5.getHighResolutionOutputSizeshNQ4ISI);
                }
                if (compare == 0) {
                    return node5;
                }
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = compare < 0 ? node5.getHighSpeedVideoFpsRanges : node5.getHighSpeedVideoSizesFor;
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
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node7 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (node == null) {
            if (comparator == getInputFormats && !(k instanceof java.lang.Comparable)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new java.lang.ClassCastException(sb.toString());
            }
            node2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<>(node, k, i3, node7, node7.getInputFormats);
            nodeArr[length] = node2;
        } else {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node8 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<>(node, k, i3, node7, node7.getInputFormats);
            if (i < 0) {
                node.getHighSpeedVideoFpsRanges = node8;
            } else {
                node.getHighSpeedVideoSizesFor = node8;
            }
            getHighSpeedVideoSizes((com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node) node, true);
            node2 = node8;
        }
        int i4 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i4 + 1;
        if (i4 > this.getOutputMinFrameDuration) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr2 = this.getHighSpeedVideoFpsRangesFor;
            int length2 = nodeArr2.length;
            int i5 = length2 * 2;
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V>[] nodeArr3 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node[i5];
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlIterator avlIterator = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlIterator();
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder avlBuilder = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder();
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder avlBuilder2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.AvlBuilder();
            for (int i6 = 0; i6 < length2; i6++) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node9 = nodeArr2[i6];
                if (node9 != null) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node10 = null;
                    for (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node11 = node9; node11 != null; node11 = node11.getHighSpeedVideoFpsRanges) {
                        node11.getInputSizeshNQ4ISI = node10;
                        node10 = node11;
                    }
                    avlIterator.getHighSpeedVideoFpsRanges = node10;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor = avlIterator.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor == null) {
                            break;
                        }
                        if ((highSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                    avlBuilder.getHighResolutionOutputSizeshNQ4ISI(i7);
                    avlBuilder2.getHighResolutionOutputSizeshNQ4ISI(i8);
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node12 = null;
                    while (node9 != null) {
                        node9.getInputSizeshNQ4ISI = node12;
                        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node13 = node9;
                        node9 = node9.getHighSpeedVideoFpsRanges;
                        node12 = node13;
                    }
                    avlIterator.getHighSpeedVideoFpsRanges = node12;
                    while (true) {
                        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor2 = avlIterator.getHighSpeedVideoFpsRangesFor();
                        if (highSpeedVideoFpsRangesFor2 == null) {
                            break;
                        }
                        if ((highSpeedVideoFpsRangesFor2.getHighSpeedVideoFpsRangesFor & length2) == 0) {
                            avlBuilder.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2);
                        } else {
                            avlBuilder2.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor2);
                        }
                    }
                    if (i7 > 0) {
                        node3 = avlBuilder.getHighSpeedVideoFpsRanges;
                        if (node3.getInputSizeshNQ4ISI != null) {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        node3 = null;
                    }
                    nodeArr3[i6] = node3;
                    if (i8 > 0) {
                        node4 = avlBuilder2.getHighSpeedVideoFpsRanges;
                        if (node4.getInputSizeshNQ4ISI != null) {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        node4 = null;
                    }
                    nodeArr3[i6 + length2] = node4;
                }
            }
            this.getHighSpeedVideoFpsRangesFor = nodeArr3;
            this.getOutputMinFrameDuration = (i5 / 2) + (i5 / 4);
        }
        this.getHighSpeedVideoSizes++;
        return node2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return getHighSpeedVideoFpsRanges(obj, false);
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoSizes(java.util.Map.Entry<?, ?> entry) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(entry.getKey());
        if (highSpeedVideoFpsRangesFor == null) {
            return null;
        }
        V v = highSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
        java.lang.Object value = entry.getValue();
        if (v == value || (v != null && v.equals(value))) {
            return highSpeedVideoFpsRangesFor;
        }
        return null;
    }

    final void getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, boolean z) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3;
        int i;
        if (z) {
            node.getInputFormats.getHighSpeedVideoSizes = node.getHighSpeedVideoSizes;
            node.getHighSpeedVideoSizes.getInputFormats = node.getInputFormats;
            node.getInputFormats = null;
            node.getHighSpeedVideoSizes = null;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node.getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node.getHighSpeedVideoSizesFor;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = node.getInputSizeshNQ4ISI;
        int i2 = 0;
        if (node4 != null && node5 != null) {
            if (node4.Camera2StreamConfigurationMap > node5.Camera2StreamConfigurationMap) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node7 = node4.getHighSpeedVideoSizesFor;
                while (true) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node8 = node7;
                    node3 = node4;
                    node4 = node8;
                    if (node4 == null) {
                        break;
                    } else {
                        node7 = node4.getHighSpeedVideoSizesFor;
                    }
                }
            } else {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node9 = node5.getHighSpeedVideoFpsRanges;
                while (true) {
                    node2 = node5;
                    node5 = node9;
                    if (node5 == null) {
                        break;
                    } else {
                        node9 = node5.getHighSpeedVideoFpsRanges;
                    }
                }
                node3 = node2;
            }
            getHighSpeedVideoFpsRangesFor(node3, false);
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node10 = node.getHighSpeedVideoFpsRanges;
            if (node10 != null) {
                i = node10.Camera2StreamConfigurationMap;
                node3.getHighSpeedVideoFpsRanges = node10;
                node10.getInputSizeshNQ4ISI = node3;
                node.getHighSpeedVideoFpsRanges = null;
            } else {
                i = 0;
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node11 = node.getHighSpeedVideoSizesFor;
            if (node11 != null) {
                i2 = node11.Camera2StreamConfigurationMap;
                node3.getHighSpeedVideoSizesFor = node11;
                node11.getInputSizeshNQ4ISI = node3;
                node.getHighSpeedVideoSizesFor = null;
            }
            node3.Camera2StreamConfigurationMap = java.lang.Math.max(i, i2) + 1;
            getHighSpeedVideoSizes(node, node3);
            return;
        }
        if (node4 != null) {
            getHighSpeedVideoSizes(node, node4);
            node.getHighSpeedVideoFpsRanges = null;
        } else if (node5 != null) {
            getHighSpeedVideoSizes(node, node5);
            node.getHighSpeedVideoSizesFor = null;
        } else {
            getHighSpeedVideoSizes(node, (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node) null);
        }
        getHighSpeedVideoSizes((com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node) node6, false);
        this.Camera2StreamConfigurationMap--;
        this.getHighSpeedVideoSizes++;
    }

    private void getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getInputSizeshNQ4ISI;
        node.getInputSizeshNQ4ISI = null;
        if (node2 != null) {
            node2.getInputSizeshNQ4ISI = node3;
        }
        if (node3 != null) {
            if (node3.getHighSpeedVideoFpsRanges == node) {
                node3.getHighSpeedVideoFpsRanges = node2;
                return;
            } else {
                node3.getHighSpeedVideoSizesFor = node2;
                return;
            }
        }
        int i = node.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor[i & (r0.length - 1)] = node2;
    }

    private void getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, boolean z) {
        while (node != null) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoFpsRanges;
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getHighSpeedVideoSizesFor;
            int i = node2 != null ? node2.Camera2StreamConfigurationMap : 0;
            int i2 = node3 != null ? node3.Camera2StreamConfigurationMap : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.getHighSpeedVideoFpsRanges;
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node3.getHighSpeedVideoSizesFor;
                int i4 = (node4 != null ? node4.Camera2StreamConfigurationMap : 0) - (node5 != null ? node5.Camera2StreamConfigurationMap : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    getHighSpeedVideoSizes((com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node) node3);
                }
                getHighResolutionOutputSizeshNQ4ISI(node);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = node2.getHighSpeedVideoFpsRanges;
                com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node7 = node2.getHighSpeedVideoSizesFor;
                int i5 = (node6 != null ? node6.Camera2StreamConfigurationMap : 0) - (node7 != null ? node7.Camera2StreamConfigurationMap : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    getHighResolutionOutputSizeshNQ4ISI(node2);
                }
                getHighSpeedVideoSizes((com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node) node);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.Camera2StreamConfigurationMap = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.Camera2StreamConfigurationMap = java.lang.Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.getInputSizeshNQ4ISI;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getHighSpeedVideoSizesFor;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node3.getHighSpeedVideoSizesFor;
        node.getHighSpeedVideoSizesFor = node4;
        if (node4 != null) {
            node4.getInputSizeshNQ4ISI = node;
        }
        getHighSpeedVideoSizes(node, node3);
        node3.getHighSpeedVideoFpsRanges = node;
        node.getInputSizeshNQ4ISI = node3;
        node.Camera2StreamConfigurationMap = java.lang.Math.max(node2 != null ? node2.Camera2StreamConfigurationMap : 0, node4 != null ? node4.Camera2StreamConfigurationMap : 0) + 1;
        node3.Camera2StreamConfigurationMap = java.lang.Math.max(node.Camera2StreamConfigurationMap, node5 != null ? node5.Camera2StreamConfigurationMap : 0) + 1;
    }

    private void getHighSpeedVideoSizes(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getHighSpeedVideoSizesFor;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node2.getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = node2.getHighSpeedVideoSizesFor;
        node.getHighSpeedVideoFpsRanges = node5;
        if (node5 != null) {
            node5.getInputSizeshNQ4ISI = node;
        }
        getHighSpeedVideoSizes(node, node2);
        node2.getHighSpeedVideoSizesFor = node;
        node.getInputSizeshNQ4ISI = node2;
        node.Camera2StreamConfigurationMap = java.lang.Math.max(node3 != null ? node3.Camera2StreamConfigurationMap : 0, node5 != null ? node5.Camera2StreamConfigurationMap : 0) + 1;
        node2.Camera2StreamConfigurationMap = java.lang.Math.max(node.Camera2StreamConfigurationMap, node4 != null ? node4.Camera2StreamConfigurationMap : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet = this.getOutputFormats;
        if (entrySet != null) {
            return entrySet;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.EntrySet();
        this.getOutputFormats = entrySet2;
        return entrySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<K> keySet() {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.KeySet keySet = this.getHighSpeedVideoSizesFor;
        if (keySet != null) {
            return keySet;
        }
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.KeySet keySet2 = new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.KeySet();
        this.getHighSpeedVideoSizesFor = keySet2;
        return keySet2;
    }

    static final class Node<K, V> implements java.util.Map.Entry<K, V> {
        int Camera2StreamConfigurationMap;
        final K getHighResolutionOutputSizeshNQ4ISI;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoSizes;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoSizesFor;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getInputFormats;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getInputSizeshNQ4ISI;
        V getOutputMinFrameDuration;

        Node() {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.getInputFormats = this;
            this.getHighSpeedVideoSizes = this;
        }

        Node(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node, K k, int i, com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2, com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3) {
            this.getInputSizeshNQ4ISI = node;
            this.getHighResolutionOutputSizeshNQ4ISI = k;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = 1;
            this.getHighSpeedVideoSizes = node2;
            this.getInputFormats = node3;
            node3.getHighSpeedVideoSizes = this;
            node2.getInputFormats = this;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.getOutputMinFrameDuration;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = this.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            K k = this.getHighResolutionOutputSizeshNQ4ISI;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.getOutputMinFrameDuration;
            return v == null ? entry.getValue() == null : v.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.getHighResolutionOutputSizeshNQ4ISI;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.getOutputMinFrameDuration;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("=");
            sb.append(this.getOutputMinFrameDuration);
            return sb.toString();
        }
    }

    static class AvlIterator<K, V> {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRanges;

        AvlIterator() {
        }

        public final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRangesFor() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.getHighSpeedVideoFpsRanges;
            if (node == null) {
                return null;
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = node.getInputSizeshNQ4ISI;
            node.getInputSizeshNQ4ISI = null;
            for (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node.getHighSpeedVideoSizesFor; node3 != null; node3 = node3.getHighSpeedVideoFpsRanges) {
                node3.getInputSizeshNQ4ISI = node2;
                node2 = node3;
            }
            this.getHighSpeedVideoFpsRanges = node2;
            return node;
        }
    }

    static final class AvlBuilder<K, V> {
        private int Camera2StreamConfigurationMap;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        AvlBuilder() {
        }

        final void getHighResolutionOutputSizeshNQ4ISI(int i) {
            this.getHighSpeedVideoSizes = ((java.lang.Integer.highestOneBit(i) * 2) - 1) - i;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = null;
        }

        final void getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node) {
            node.getHighSpeedVideoSizesFor = null;
            node.getInputSizeshNQ4ISI = null;
            node.getHighSpeedVideoFpsRanges = null;
            node.Camera2StreamConfigurationMap = 1;
            int i = this.getHighSpeedVideoSizes;
            if (i > 0) {
                int i2 = this.getHighSpeedVideoFpsRangesFor;
                if ((i2 & 1) == 0) {
                    this.getHighSpeedVideoFpsRangesFor = i2 + 1;
                    this.getHighSpeedVideoSizes = i - 1;
                    this.Camera2StreamConfigurationMap++;
                }
            }
            node.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges;
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
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node2 = this.getHighSpeedVideoFpsRanges;
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node3 = node2.getInputSizeshNQ4ISI;
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node4 = node3.getInputSizeshNQ4ISI;
                    node3.getInputSizeshNQ4ISI = node4.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = node3;
                    node3.getHighSpeedVideoFpsRanges = node4;
                    node3.getHighSpeedVideoSizesFor = node2;
                    node3.Camera2StreamConfigurationMap = node2.Camera2StreamConfigurationMap + 1;
                    node4.getInputSizeshNQ4ISI = node3;
                    node2.getInputSizeshNQ4ISI = node3;
                } else if (i8 == 1) {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node5 = this.getHighSpeedVideoFpsRanges;
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node6 = node5.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = node6;
                    node6.getHighSpeedVideoSizesFor = node5;
                    node6.Camera2StreamConfigurationMap = node5.Camera2StreamConfigurationMap + 1;
                    node5.getInputSizeshNQ4ISI = node6;
                    this.Camera2StreamConfigurationMap = 0;
                } else if (i8 == 2) {
                    this.Camera2StreamConfigurationMap = 0;
                }
                i6 *= 2;
            }
        }
    }

    abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> getHighSpeedVideoSizes = null;

        LinkedTreeMapIterator() {
            this.Camera2StreamConfigurationMap = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoSizes;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Camera2StreamConfigurationMap != com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI;
        }

        final com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> Camera2StreamConfigurationMap() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.Camera2StreamConfigurationMap;
            if (node == com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.util.NoSuchElementException();
            }
            if (com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoSizes != this.getHighSpeedVideoFpsRanges) {
                throw new java.util.ConcurrentModificationException();
            }
            this.Camera2StreamConfigurationMap = node.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = node;
            return node;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> node = this.getHighSpeedVideoSizes;
            if (node == null) {
                throw new java.lang.IllegalStateException();
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoFpsRangesFor(node, true);
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoSizes;
        }
    }

    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            return new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<java.util.Map.Entry<K, V>>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.EntrySet.1
                {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap linkedHashTreeMap = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public /* synthetic */ java.lang.Object next() {
                    return Camera2StreamConfigurationMap();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return (obj instanceof java.util.Map.Entry) && com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoSizes((java.util.Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoSizes;
            if (!(obj instanceof java.util.Map.Entry) || (highSpeedVideoSizes = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoSizes((java.util.Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.clear();
        }
    }

    final class KeySet extends java.util.AbstractSet<K> {
        KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.Camera2StreamConfigurationMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator<K> iterator() {
            return new com.airbnb.lottie.parser.moshi.LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K>() { // from class: com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.KeySet.1
                {
                    com.airbnb.lottie.parser.moshi.LinkedHashTreeMap linkedHashTreeMap = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this;
                }

                @Override // java.util.Iterator
                public K next() {
                    return Camera2StreamConfigurationMap().getHighResolutionOutputSizeshNQ4ISI;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap linkedHashTreeMap = com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this;
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor = linkedHashTreeMap.getHighSpeedVideoFpsRangesFor(obj);
            if (highSpeedVideoFpsRangesFor != null) {
                linkedHashTreeMap.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, true);
            }
            return highSpeedVideoFpsRangesFor != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.this.clear();
        }
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.util.LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object obj) {
        com.airbnb.lottie.parser.moshi.LinkedHashTreeMap.Node<K, V> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(obj);
        if (highSpeedVideoFpsRangesFor != null) {
            getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRangesFor, true);
        }
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
        }
        return null;
    }
}
