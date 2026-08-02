package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
final class AdapterHelper implements androidx.recyclerview.widget.OpReorderer.Callback {
    final androidx.recyclerview.widget.OpReorderer Camera2StreamConfigurationMap;
    final androidx.recyclerview.widget.AdapterHelper.Callback getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Runnable getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> getHighSpeedVideoSizesFor;
    final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> getInputFormats;
    private androidx.core.util.Pools.Pool<androidx.recyclerview.widget.AdapterHelper.UpdateOp> getOutputMinFrameDuration;

    interface Callback {
        void Camera2StreamConfigurationMap(int i, int i2);

        void getHighResolutionOutputSizeshNQ4ISI(int i, int i2);

        void getHighSpeedVideoFpsRanges(int i, int i2, java.lang.Object obj);

        androidx.recyclerview.widget.RecyclerView.ViewHolder getHighSpeedVideoFpsRangesFor(int i);

        void getHighSpeedVideoFpsRangesFor(int i, int i2);

        void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp);

        void getHighSpeedVideoSizes(int i, int i2);

        void getHighSpeedVideoSizes(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp);
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback callback) {
        this(callback, (byte) 0);
    }

    private AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback callback, byte b) {
        this.getOutputMinFrameDuration = new androidx.core.util.Pools.SimplePool(30);
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList<>();
        this.getInputFormats = new java.util.ArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = callback;
        this.getHighSpeedVideoSizes = false;
        this.Camera2StreamConfigurationMap = new androidx.recyclerview.widget.OpReorderer(this);
    }

    final void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
        getHighSpeedVideoFpsRanges(this.getInputFormats);
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    final void Camera2StreamConfigurationMap() {
        boolean z;
        char c;
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor);
        int size = this.getHighSpeedVideoSizesFor.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.getHighSpeedVideoSizesFor.get(i);
            int i2 = updateOp.getHighSpeedVideoFpsRangesFor;
            if (i2 != 1) {
                char c2 = 65535;
                if (i2 == 2) {
                    int i3 = updateOp.getHighSpeedVideoSizes;
                    int i4 = updateOp.getHighSpeedVideoSizes + updateOp.Camera2StreamConfigurationMap;
                    int i5 = updateOp.getHighSpeedVideoSizes;
                    int i6 = 0;
                    while (i5 < i4) {
                        if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(i5) != null || getHighResolutionOutputSizeshNQ4ISI(i5)) {
                            if (c2 == 0) {
                                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(2, i3, i6, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            c = 1;
                        } else {
                            if (c2 == 1) {
                                Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor(2, i3, i6, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            c = 0;
                        }
                        if (z) {
                            i5 -= i6;
                            i4 -= i6;
                            i6 = 1;
                        } else {
                            i6++;
                        }
                        i5++;
                        c2 = c;
                    }
                    if (i6 != updateOp.Camera2StreamConfigurationMap) {
                        getHighResolutionOutputSizeshNQ4ISI(updateOp);
                        updateOp = getHighSpeedVideoFpsRangesFor(2, i3, i6, null);
                    }
                    if (c2 == 0) {
                        getHighSpeedVideoFpsRangesFor(updateOp);
                    } else {
                        Camera2StreamConfigurationMap(updateOp);
                    }
                } else if (i2 == 4) {
                    int i7 = updateOp.getHighSpeedVideoSizes;
                    int i8 = updateOp.getHighSpeedVideoSizes;
                    int i9 = updateOp.Camera2StreamConfigurationMap;
                    int i10 = 0;
                    for (int i11 = updateOp.getHighSpeedVideoSizes; i11 < i8 + i9; i11++) {
                        if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(i11) != null || getHighResolutionOutputSizeshNQ4ISI(i11)) {
                            if (c2 == 0) {
                                getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor(4, i7, i10, updateOp.getHighResolutionOutputSizeshNQ4ISI));
                                i10 = 0;
                                i7 = i11;
                            }
                            c2 = 1;
                        } else {
                            if (c2 == 1) {
                                Camera2StreamConfigurationMap(getHighSpeedVideoFpsRangesFor(4, i7, i10, updateOp.getHighResolutionOutputSizeshNQ4ISI));
                                i10 = 0;
                                i7 = i11;
                            }
                            c2 = 0;
                        }
                        i10++;
                    }
                    if (i10 != updateOp.Camera2StreamConfigurationMap) {
                        java.lang.Object obj = updateOp.getHighResolutionOutputSizeshNQ4ISI;
                        getHighResolutionOutputSizeshNQ4ISI(updateOp);
                        updateOp = getHighSpeedVideoFpsRangesFor(4, i7, i10, obj);
                    }
                    if (c2 == 0) {
                        getHighSpeedVideoFpsRangesFor(updateOp);
                    } else {
                        Camera2StreamConfigurationMap(updateOp);
                    }
                } else if (i2 == 8) {
                    Camera2StreamConfigurationMap(updateOp);
                }
            } else {
                getHighSpeedVideoSizes(updateOp);
            }
            java.lang.Runnable runnable = this.getHighSpeedVideoFpsRanges;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.getHighSpeedVideoSizesFor.clear();
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        int size = this.getInputFormats.size();
        for (int i = 0; i < size; i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getInputFormats.get(i));
        }
        getHighSpeedVideoFpsRanges(this.getInputFormats);
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        int i;
        if (updateOp.getHighSpeedVideoFpsRangesFor == 1 || updateOp.getHighSpeedVideoFpsRangesFor == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(updateOp.getHighSpeedVideoSizes, updateOp.getHighSpeedVideoFpsRangesFor);
        int i2 = updateOp.getHighSpeedVideoSizes;
        int i3 = updateOp.getHighSpeedVideoFpsRangesFor;
        if (i3 == 2) {
            i = 0;
        } else {
            if (i3 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update.".concat(java.lang.String.valueOf(updateOp)));
            }
            i = 1;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < updateOp.Camera2StreamConfigurationMap; i5++) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(updateOp.getHighSpeedVideoSizes + (i * i5), updateOp.getHighSpeedVideoFpsRangesFor);
            int i6 = updateOp.getHighSpeedVideoFpsRangesFor;
            if (i6 == 2 ? Camera2StreamConfigurationMap2 != Camera2StreamConfigurationMap : !(i6 == 4 && Camera2StreamConfigurationMap2 == Camera2StreamConfigurationMap + 1)) {
                androidx.recyclerview.widget.AdapterHelper.UpdateOp highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(updateOp.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap, i4, updateOp.getHighResolutionOutputSizeshNQ4ISI);
                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, i2);
                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
                if (updateOp.getHighSpeedVideoFpsRangesFor == 4) {
                    i2 += i4;
                }
                i4 = 1;
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
            } else {
                i4++;
            }
        }
        java.lang.Object obj = updateOp.getHighResolutionOutputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI(updateOp);
        if (i4 > 0) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(updateOp.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap, i4, obj);
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2, i2);
            getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor2);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(updateOp);
        int i2 = updateOp.getHighSpeedVideoFpsRangesFor;
        if (i2 == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i, updateOp.Camera2StreamConfigurationMap);
        } else {
            if (i2 == 4) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i, updateOp.Camera2StreamConfigurationMap, updateOp.getHighResolutionOutputSizeshNQ4ISI);
                return;
            }
            throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    private int Camera2StreamConfigurationMap(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.getInputFormats.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.getInputFormats.get(size);
            if (updateOp.getHighSpeedVideoFpsRangesFor == 8) {
                if (updateOp.getHighSpeedVideoSizes < updateOp.Camera2StreamConfigurationMap) {
                    i3 = updateOp.getHighSpeedVideoSizes;
                    i4 = updateOp.Camera2StreamConfigurationMap;
                } else {
                    i3 = updateOp.Camera2StreamConfigurationMap;
                    i4 = updateOp.getHighSpeedVideoSizes;
                }
                if (i >= i3 && i <= i4) {
                    if (i3 == updateOp.getHighSpeedVideoSizes) {
                        if (i2 == 1) {
                            updateOp.Camera2StreamConfigurationMap++;
                        } else if (i2 == 2) {
                            updateOp.Camera2StreamConfigurationMap--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            updateOp.getHighSpeedVideoSizes++;
                        } else if (i2 == 2) {
                            updateOp.getHighSpeedVideoSizes--;
                        }
                        i--;
                    }
                } else if (i < updateOp.getHighSpeedVideoSizes) {
                    if (i2 == 1) {
                        updateOp.getHighSpeedVideoSizes++;
                        updateOp.Camera2StreamConfigurationMap++;
                    } else if (i2 == 2) {
                        updateOp.getHighSpeedVideoSizes--;
                        updateOp.Camera2StreamConfigurationMap--;
                    }
                }
            } else if (updateOp.getHighSpeedVideoSizes <= i) {
                if (updateOp.getHighSpeedVideoFpsRangesFor == 1) {
                    i -= updateOp.Camera2StreamConfigurationMap;
                } else if (updateOp.getHighSpeedVideoFpsRangesFor == 2) {
                    i += updateOp.Camera2StreamConfigurationMap;
                }
            } else if (i2 == 1) {
                updateOp.getHighSpeedVideoSizes++;
            } else if (i2 == 2) {
                updateOp.getHighSpeedVideoSizes--;
            }
        }
        for (int size2 = this.getInputFormats.size() - 1; size2 >= 0; size2--) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp2 = this.getInputFormats.get(size2);
            if (updateOp2.getHighSpeedVideoFpsRangesFor == 8) {
                if (updateOp2.Camera2StreamConfigurationMap == updateOp2.getHighSpeedVideoSizes || updateOp2.Camera2StreamConfigurationMap < 0) {
                    this.getInputFormats.remove(size2);
                    getHighResolutionOutputSizeshNQ4ISI(updateOp2);
                }
            } else if (updateOp2.Camera2StreamConfigurationMap <= 0) {
                this.getInputFormats.remove(size2);
                getHighResolutionOutputSizeshNQ4ISI(updateOp2);
            }
        }
        return i;
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        int size = this.getInputFormats.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.getInputFormats.get(i2);
            if (updateOp.getHighSpeedVideoFpsRangesFor == 8) {
                if (getHighSpeedVideoFpsRanges(updateOp.Camera2StreamConfigurationMap, i2 + 1) == i) {
                    return true;
                }
            } else if (updateOp.getHighSpeedVideoFpsRangesFor == 1) {
                int i3 = updateOp.getHighSpeedVideoSizes;
                int i4 = updateOp.Camera2StreamConfigurationMap;
                for (int i5 = updateOp.getHighSpeedVideoSizes; i5 < i3 + i4; i5++) {
                    if (getHighSpeedVideoFpsRanges(i5, i2 + 1) == i) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void getHighSpeedVideoSizes(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        Camera2StreamConfigurationMap(updateOp);
    }

    private void Camera2StreamConfigurationMap(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        this.getInputFormats.add(updateOp);
        int i = updateOp.getHighSpeedVideoFpsRangesFor;
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
            return;
        }
        if (i == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
        } else if (i == 4) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap, updateOp.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            if (i == 8) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
                return;
            }
            throw new java.lang.IllegalArgumentException("Unknown update op type for ".concat(java.lang.String.valueOf(updateOp)));
        }
    }

    final boolean getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizesFor.size() > 0;
    }

    final int getHighSpeedVideoFpsRangesFor(int i) {
        return getHighSpeedVideoFpsRanges(i, 0);
    }

    private int getHighSpeedVideoFpsRanges(int i, int i2) {
        int size = this.getInputFormats.size();
        while (i2 < size) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.getInputFormats.get(i2);
            if (updateOp.getHighSpeedVideoFpsRangesFor == 8) {
                if (updateOp.getHighSpeedVideoSizes == i) {
                    i = updateOp.Camera2StreamConfigurationMap;
                } else {
                    if (updateOp.getHighSpeedVideoSizes < i) {
                        i--;
                    }
                    if (updateOp.Camera2StreamConfigurationMap <= i) {
                        i++;
                    }
                }
            } else if (updateOp.getHighSpeedVideoSizes > i) {
                continue;
            } else if (updateOp.getHighSpeedVideoFpsRangesFor == 2) {
                if (i < updateOp.getHighSpeedVideoSizes + updateOp.Camera2StreamConfigurationMap) {
                    return -1;
                }
                i -= updateOp.Camera2StreamConfigurationMap;
            } else if (updateOp.getHighSpeedVideoFpsRangesFor == 1) {
                i += updateOp.Camera2StreamConfigurationMap;
            }
            i2++;
        }
        return i;
    }

    final boolean getHighSpeedVideoFpsRangesFor(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.getHighSpeedVideoSizesFor.add(getHighSpeedVideoFpsRangesFor(1, i, i2, null));
        this.getHighSpeedVideoFpsRangesFor |= 1;
        return this.getHighSpeedVideoSizesFor.size() == 1;
    }

    final void getHighSpeedVideoSizes() {
        getHighResolutionOutputSizeshNQ4ISI();
        int size = this.getHighSpeedVideoSizesFor.size();
        for (int i = 0; i < size; i++) {
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = this.getHighSpeedVideoSizesFor.get(i);
            int i2 = updateOp.getHighSpeedVideoFpsRangesFor;
            if (i2 == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(updateOp);
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
            } else if (i2 == 2) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(updateOp);
                this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
            } else if (i2 == 4) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(updateOp);
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap, updateOp.getHighResolutionOutputSizeshNQ4ISI);
            } else if (i2 == 8) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(updateOp);
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(updateOp.getHighSpeedVideoSizes, updateOp.Camera2StreamConfigurationMap);
            }
            java.lang.Runnable runnable = this.getHighSpeedVideoFpsRanges;
            if (runnable != null) {
                runnable.run();
            }
        }
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizesFor);
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    static final class UpdateOp {
        int Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        UpdateOp(int i, int i2, int i3, java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }

        public final java.lang.String toString() {
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append("[");
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 1) {
                str = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD;
            } else if (i == 2) {
                str = "rm";
            } else if (i == 4) {
                str = com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP;
            } else if (i == 8) {
                str = "mv";
            } else {
                str = "??";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("c:");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(",p:");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.recyclerview.widget.AdapterHelper.UpdateOp)) {
                return false;
            }
            androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) obj;
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != updateOp.getHighSpeedVideoFpsRangesFor) {
                return false;
            }
            if (i == 8 && java.lang.Math.abs(this.Camera2StreamConfigurationMap - this.getHighSpeedVideoSizes) == 1 && this.Camera2StreamConfigurationMap == updateOp.getHighSpeedVideoSizes && this.getHighSpeedVideoSizes == updateOp.Camera2StreamConfigurationMap) {
                return true;
            }
            if (this.Camera2StreamConfigurationMap != updateOp.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes != updateOp.getHighSpeedVideoSizes) {
                return false;
            }
            java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (obj2 != null) {
                if (!obj2.equals(updateOp.getHighResolutionOutputSizeshNQ4ISI)) {
                    return false;
                }
            } else if (updateOp.getHighResolutionOutputSizeshNQ4ISI != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoFpsRangesFor * 31) + this.getHighSpeedVideoSizes) * 31) + this.Camera2StreamConfigurationMap;
        }
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public final androidx.recyclerview.widget.AdapterHelper.UpdateOp getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, java.lang.Object obj) {
        androidx.recyclerview.widget.AdapterHelper.UpdateOp acquire = this.getOutputMinFrameDuration.acquire();
        if (acquire == null) {
            return new androidx.recyclerview.widget.AdapterHelper.UpdateOp(i, i2, i3, obj);
        }
        acquire.getHighSpeedVideoFpsRangesFor = i;
        acquire.getHighSpeedVideoSizes = i2;
        acquire.Camera2StreamConfigurationMap = i3;
        acquire.getHighResolutionOutputSizeshNQ4ISI = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp) {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        updateOp.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getOutputMinFrameDuration.release(updateOp);
    }

    private void getHighSpeedVideoFpsRanges(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            getHighResolutionOutputSizeshNQ4ISI(list.get(i));
        }
        list.clear();
    }
}
