package androidx.recyclerview.widget;

/* loaded from: classes7.dex */
class OpReorderer {
    final androidx.recyclerview.widget.OpReorderer.Callback Camera2StreamConfigurationMap;

    interface Callback {
        void getHighResolutionOutputSizeshNQ4ISI(androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp);

        androidx.recyclerview.widget.AdapterHelper.UpdateOp getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, java.lang.Object obj);
    }

    OpReorderer(androidx.recyclerview.widget.OpReorderer.Callback callback) {
        this.Camera2StreamConfigurationMap = callback;
    }

    final void getHighSpeedVideoFpsRangesFor(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> list) {
        while (true) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes(list);
            if (highSpeedVideoSizes == -1) {
                return;
            } else {
                getHighResolutionOutputSizeshNQ4ISI(list, highSpeedVideoSizes, highSpeedVideoSizes + 1);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> list, int i, int i2) {
        boolean z;
        androidx.recyclerview.widget.AdapterHelper.UpdateOp highSpeedVideoFpsRangesFor;
        androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp = list.get(i);
        androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp2 = list.get(i2);
        int i3 = updateOp2.getHighSpeedVideoFpsRangesFor;
        if (i3 == 1) {
            r3 = updateOp.Camera2StreamConfigurationMap < updateOp2.getHighSpeedVideoSizes ? -1 : 0;
            if (updateOp.getHighSpeedVideoSizes < updateOp2.getHighSpeedVideoSizes) {
                r3++;
            }
            if (updateOp2.getHighSpeedVideoSizes <= updateOp.getHighSpeedVideoSizes) {
                updateOp.getHighSpeedVideoSizes += updateOp2.Camera2StreamConfigurationMap;
            }
            if (updateOp2.getHighSpeedVideoSizes <= updateOp.Camera2StreamConfigurationMap) {
                updateOp.Camera2StreamConfigurationMap += updateOp2.Camera2StreamConfigurationMap;
            }
            updateOp2.getHighSpeedVideoSizes += r3;
            list.set(i, updateOp2);
            list.set(i2, updateOp);
            return;
        }
        androidx.recyclerview.widget.AdapterHelper.UpdateOp updateOp3 = null;
        if (i3 == 2) {
            if (updateOp.getHighSpeedVideoSizes < updateOp.Camera2StreamConfigurationMap) {
                if (updateOp2.getHighSpeedVideoSizes == updateOp.getHighSpeedVideoSizes && updateOp2.Camera2StreamConfigurationMap == updateOp.Camera2StreamConfigurationMap - updateOp.getHighSpeedVideoSizes) {
                    z = false;
                    r3 = 1;
                } else {
                    z = false;
                }
            } else if (updateOp2.getHighSpeedVideoSizes == updateOp.Camera2StreamConfigurationMap + 1 && updateOp2.Camera2StreamConfigurationMap == updateOp.getHighSpeedVideoSizes - updateOp.Camera2StreamConfigurationMap) {
                z = true;
                r3 = 1;
            } else {
                z = true;
            }
            if (updateOp.Camera2StreamConfigurationMap < updateOp2.getHighSpeedVideoSizes) {
                updateOp2.getHighSpeedVideoSizes--;
            } else if (updateOp.Camera2StreamConfigurationMap < updateOp2.getHighSpeedVideoSizes + updateOp2.Camera2StreamConfigurationMap) {
                updateOp2.Camera2StreamConfigurationMap--;
                updateOp.getHighSpeedVideoFpsRangesFor = 2;
                updateOp.Camera2StreamConfigurationMap = 1;
                if (updateOp2.Camera2StreamConfigurationMap == 0) {
                    list.remove(i2);
                    this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(updateOp2);
                    return;
                }
                return;
            }
            if (updateOp.getHighSpeedVideoSizes <= updateOp2.getHighSpeedVideoSizes) {
                updateOp2.getHighSpeedVideoSizes++;
            } else if (updateOp.getHighSpeedVideoSizes < updateOp2.getHighSpeedVideoSizes + updateOp2.Camera2StreamConfigurationMap) {
                updateOp3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(2, updateOp.getHighSpeedVideoSizes + 1, (updateOp2.getHighSpeedVideoSizes + updateOp2.Camera2StreamConfigurationMap) - updateOp.getHighSpeedVideoSizes, null);
                updateOp2.Camera2StreamConfigurationMap = updateOp.getHighSpeedVideoSizes - updateOp2.getHighSpeedVideoSizes;
            }
            if (r3 != 0) {
                list.set(i, updateOp2);
                list.remove(i2);
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(updateOp);
                return;
            }
            if (z) {
                if (updateOp3 != null) {
                    if (updateOp.getHighSpeedVideoSizes > updateOp3.getHighSpeedVideoSizes) {
                        updateOp.getHighSpeedVideoSizes -= updateOp3.Camera2StreamConfigurationMap;
                    }
                    if (updateOp.Camera2StreamConfigurationMap > updateOp3.getHighSpeedVideoSizes) {
                        updateOp.Camera2StreamConfigurationMap -= updateOp3.Camera2StreamConfigurationMap;
                    }
                }
                if (updateOp.getHighSpeedVideoSizes > updateOp2.getHighSpeedVideoSizes) {
                    updateOp.getHighSpeedVideoSizes -= updateOp2.Camera2StreamConfigurationMap;
                }
                if (updateOp.Camera2StreamConfigurationMap > updateOp2.getHighSpeedVideoSizes) {
                    updateOp.Camera2StreamConfigurationMap -= updateOp2.Camera2StreamConfigurationMap;
                }
            } else {
                if (updateOp3 != null) {
                    if (updateOp.getHighSpeedVideoSizes >= updateOp3.getHighSpeedVideoSizes) {
                        updateOp.getHighSpeedVideoSizes -= updateOp3.Camera2StreamConfigurationMap;
                    }
                    if (updateOp.Camera2StreamConfigurationMap >= updateOp3.getHighSpeedVideoSizes) {
                        updateOp.Camera2StreamConfigurationMap -= updateOp3.Camera2StreamConfigurationMap;
                    }
                }
                if (updateOp.getHighSpeedVideoSizes >= updateOp2.getHighSpeedVideoSizes) {
                    updateOp.getHighSpeedVideoSizes -= updateOp2.Camera2StreamConfigurationMap;
                }
                if (updateOp.Camera2StreamConfigurationMap >= updateOp2.getHighSpeedVideoSizes) {
                    updateOp.Camera2StreamConfigurationMap -= updateOp2.Camera2StreamConfigurationMap;
                }
            }
            list.set(i, updateOp2);
            if (updateOp.getHighSpeedVideoSizes != updateOp.Camera2StreamConfigurationMap) {
                list.set(i2, updateOp);
            } else {
                list.remove(i2);
            }
            if (updateOp3 != null) {
                list.add(i, updateOp3);
                return;
            }
            return;
        }
        if (i3 != 4) {
            return;
        }
        if (updateOp.Camera2StreamConfigurationMap < updateOp2.getHighSpeedVideoSizes) {
            updateOp2.getHighSpeedVideoSizes--;
        } else if (updateOp.Camera2StreamConfigurationMap < updateOp2.getHighSpeedVideoSizes + updateOp2.Camera2StreamConfigurationMap) {
            updateOp2.Camera2StreamConfigurationMap--;
            highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(4, updateOp.getHighSpeedVideoSizes, 1, updateOp2.getHighResolutionOutputSizeshNQ4ISI);
            if (updateOp.getHighSpeedVideoSizes > updateOp2.getHighSpeedVideoSizes) {
                updateOp2.getHighSpeedVideoSizes++;
            } else if (updateOp.getHighSpeedVideoSizes < updateOp2.getHighSpeedVideoSizes + updateOp2.Camera2StreamConfigurationMap) {
                int i4 = (updateOp2.getHighSpeedVideoSizes + updateOp2.Camera2StreamConfigurationMap) - updateOp.getHighSpeedVideoSizes;
                updateOp3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(4, updateOp.getHighSpeedVideoSizes + 1, i4, updateOp2.getHighResolutionOutputSizeshNQ4ISI);
                updateOp2.Camera2StreamConfigurationMap -= i4;
            }
            list.set(i2, updateOp);
            if (updateOp2.Camera2StreamConfigurationMap <= 0) {
                list.set(i, updateOp2);
            } else {
                list.remove(i);
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(updateOp2);
            }
            if (highSpeedVideoFpsRangesFor != null) {
                list.add(i, highSpeedVideoFpsRangesFor);
            }
            if (updateOp3 == null) {
                list.add(i, updateOp3);
                return;
            }
            return;
        }
        highSpeedVideoFpsRangesFor = null;
        if (updateOp.getHighSpeedVideoSizes > updateOp2.getHighSpeedVideoSizes) {
        }
        list.set(i2, updateOp);
        if (updateOp2.Camera2StreamConfigurationMap <= 0) {
        }
        if (highSpeedVideoFpsRangesFor != null) {
        }
        if (updateOp3 == null) {
        }
    }

    private static int getHighSpeedVideoSizes(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).getHighSpeedVideoFpsRangesFor != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
